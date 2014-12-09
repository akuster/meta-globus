DESCRIPTION = "Globus Toolkit - Globus Gass Transfe"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io globus-gss-assist globus-gssapi-gsi"

LIC_FILES_CHKSUM = "file://library/globus_gass_transfer.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "6662391c32380ed6d357cd73e95af4f1"
SRC_URI[archive.sha256sum] = "e435ce636bc8efdbc03d4e81b5de426e3d68a5da921bfe04af1d7f2a6e2dc927"
SRC_URI[dpatch.md5sum] = "32a5822fde636389225884d576c7d241"
SRC_URI[dpatch.sha256sum] = "1a70164a7009ffb1e5fc8aa4171057690f379d66c7036ba01fadeb021bec861f"

S = "${WORKDIR}/globus_gass_transfer-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-io globus-gss-assist"
