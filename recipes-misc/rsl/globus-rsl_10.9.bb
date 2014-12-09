DESCRIPTION = "Globus Toolkit - Resource Specification Language Library"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-common"

LIC_FILES_CHKSUM = "file://globus_rsl.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "a443bd3a10fdbb83e1ae551f98def958"
SRC_URI[archive.sha256sum] = "6726c0cbe18615bacd4cfd4a992b9a1e862ed6c4ca06a36304315685e5496c4d"
SRC_URI[dpatch.md5sum] = "304269fe2a4a4784b27d1ec7655b228a"
SRC_URI[dpatch.sha256sum] = "50c56faed94b4b50fd161a8c0a1aafe8dca1788c4632579478f17f55b169129f"

S = "${WORKDIR}/globus_rsl-${PV}"

inherit autotools pkgconfig

FILES_${PN} += "/run /var/run"

RDEPENDS_${PN} = "globus-common"
