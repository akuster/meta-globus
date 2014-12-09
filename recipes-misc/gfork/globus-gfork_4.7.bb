DESCRIPTION = "Globus Toolkit - GSSAPI Assist library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-xio"

LIC_FILES_CHKSUM = "file://globus_gfork_server.c;beginline=2;endline=3;md5=ac519975bfd8977f4ed0efa158ad2a00"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "fe4c66e1ee45a9838916c32ed7f2338c"
SRC_URI[archive.sha256sum] = "e6a24dad69e20c14b47796b97e0814304b059186941f82789c82c622e259980b"
SRC_URI[dpatch.md5sum] = "4d65a8fb560c2943e8c9139cd1aa248f"
SRC_URI[dpatch.sha256sum] = "c41752a6a55bbe68753843108d8b0816d77d97b78724f5c48793dad19980056c"

S = "${WORKDIR}/globus_gfork-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-xio"
