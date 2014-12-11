DESCRIPTION = "Globus Toolkit - Globus Pipe Driver Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-xio"

LIC_FILES_CHKSUM = "file://globus_xio_pipe_driver.c;beginline=2;endline=3;md5=9898108665dd602e41273315a49d4efa"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "6c3053a8f3353fe530fd65e968d00e4b"
SRC_URI[archive.sha256sum] = "ec6941de70abfc24cfc678f6d3c8a3e546ede94b8935df6b469519a0c5d32c87"
RC_URI[dpatch.md5sum] = "5b80532a5d76a9998c5f44f5640793d5"
SRC_URI[dpatch.sha256sum] = "19dbedfcc60dd0b75a35ec331a0dd29afe47d4059e36e6552b4a6b689913bb1c"

S = "${WORKDIR}/globus_xio_pipe_driver-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-xio"
