DESCRIPTION = "Globus Toolkit - Globus GridFTP Server Library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io globus-xio-pipe-driver"

LIC_FILES_CHKSUM = "file://globus_gridftp_server_control.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "724cf7410e83ebc4642e8434de4b7f8c"
SRC_URI[archive.sha256sum] = "ff94838955e697390bdb8a9e0ef9ae7c6614199fd98e66d1e3d6093dcd79a029"
SRC_URI[dpatch.md5sum] = "cc61d7e0333e28e6c650e6488743336a"
SRC_URI[dpatch.sha256sum] = "8b7aa17478cdd4d8ffb3fe0935cbc71e8ecfc050ed6c91d4b115ebb02c82dba7"

S = "${WORKDIR}/globus_gridftp_server_control-${PV}"

inherit autotools pkgconfig
