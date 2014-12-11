DESCRIPTION = "Globus Toolkit - Globus Gass Copy Programs"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-gass-transfer globus-ftp-client"

LIC_FILES_CHKSUM = "file://globus_gass_copy.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "a7aa13ee95f87ca88c5f80f8bea9837d"
SRC_URI[archive.sha256sum] = "71a36272275cfce330f657c3f8e487eabd36438b7e5e7314813cfa051f3f2bf6"
SRC_URI[dpatch.md5sum] = "e363c0b3cfa715296ff8ee3a632fc556"
SRC_URI[dpatch.sha256sum] = "79cf08ecafab2c112dbd14c2f6a6ff0087509a22ef7bd7ca46b84af9da3319ae"

S = "${WORKDIR}/globus_gass_copy-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-ftp-control globus-ftp-client"
