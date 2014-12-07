DESCRIPTION = " Globus Toolkit"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/ccommonlib"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = " libtool"

LIC_FILES_CHKSUM = "file://library/globus_common.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=patch3 \
            "
SRC_URI[archive.md5sum] = "da9ed23bbc51aa1d4a5d8238f8a53e34"
SRC_URI[archive.sha256sum] = "690772e5b8cb91a528247dddaa4879a679c0fa36de8e48a33d72006b558c4104"
SRC_URI[patch3.md5sum] = "3d26120dc045ecc5f9af3f273adf042e"
SRC_URI[patch3.sha256sum] = "bc484eecb9abe100bbb8c668b4df65af3140d937080c03ef251837b7dc70507d"

S = "${WORKDIR}/globus_common-${PV}"

inherit autotools 

do_compile_append() {
    sed -i 's/\$(MAKE) \$(AM_MAKEFLAGS) check-TESTS//g' test/Makefile
    oe_runmake check
}

PACKAGES += " ${PN}-progs libglobus-common0"

FILES_${PN}-progs += " ${datadir}/globus-user-env*"

FILES_libglobus-common0 = "${libdir}/*/libglobus_common.so.* ${libdir}/*/libglobus_memory_debug.so.* ${libdir}/*/libglobus_thread_pthread.so ${libdir}/perl/Globus/Core/Config.pm ${libdir}/perl/Globus/Core/Paths.pm"

RDEPENDS_${PN} = "perl"
