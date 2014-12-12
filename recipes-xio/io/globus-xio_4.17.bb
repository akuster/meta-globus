DESCRIPTION = " Globus Toolkit - Globus XIO Framework"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = " globus-common"

LIC_FILES_CHKSUM = "file://globus_xio_server.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=patch1 \
    "

SRC_URI[archive.md5sum] = "c12d29eaec510937bea26fc3643402e5"
SRC_URI[archive.sha256sum] = "54c40a19bc5d614adc00a422502eba1f6d54fbaf8a5ec278cc91ed7ebca510d8"
SRC_URI[patch1.md5sum] = "06e1d2913878b35123c8355834ae03af"
SRC_URI[patch1.sha256sum] = "bc8133164fd2847e9edc2d035e755667722caac7dd41e04bfeffe387a86da475"

S = "${WORKDIR}/globus_xio-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-common"

