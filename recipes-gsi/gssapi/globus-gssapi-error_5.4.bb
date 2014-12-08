DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://library/globus_error_gssapi.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "93f31aeb82fdaaac49ed15ee05f73441"
SRC_URI[archive.sha256sum] = "ddbe38f759cbf603cc05759a4fbf295126a6ce892d3b4ae4d5ed8c3b9182af5e"
SRC_URI[dpatch.md5sum] = "21c85a4e8eaa95d86a040feefdfbcba4"
SRC_URI[dpatch.sha256sum] = "f47338515cb8920a97974f782d4224b559c4f99279a978bb8699f55b44900302"

S = "${WORKDIR}/globus_gssapi_error-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-proxy-core globus-gsi-proxy-ssl globus-gsi-sysconfig globus-gsi-callback globus-gssapi-gsi globus-callout globus-gss-assist globus-gsi-credential" 
