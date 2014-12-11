DESCRIPTION = "Globus Toolkit - Globus authz library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-authz-callout-error"

LIC_FILES_CHKSUM = "file://globus_gsi_authz.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "a04064d85bddebc2dbc6148ae0e5d5d1"
SRC_URI[archive.sha256sum] = "961dbd246f167f192520ca26f5af3811eaa589a78486868866b0515248f65907"
SRC_URI[dpatch.md5sum] = "8ac46106eb3d77f53f4d3c99e2e30eb8"
SRC_URI[dpatch.sha256sum] = "16fa59bdefe71ef33bf9286307403e4632547154e1a708a43b6d21d8fd317a82"

S = "${WORKDIR}/globus_authz-${PV}"

inherit autotools pkgconfig

#FILES_${PN} += "/run /var/run"

#RDEPENDS_${PN} = "globus-common"
