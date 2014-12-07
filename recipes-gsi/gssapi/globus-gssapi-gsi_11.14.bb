DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "libtool"

LIC_FILES_CHKSUM = "file://library/module.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "035fdc2b6c838a525b6d66e1f3d279c2"
SRC_URI[archive.sha256sum] = "0d3a22244fa59371ee81ce586f031a001d0ab6044c441d569c5216765cdf1242"
SRC_URI[dpatch.md5sum] = "500328614fea053f1b0766cf3ca283ec"
SRC_URI[dpatch.sha256sum] = "f214d6f2665df53d30f4e5eb25f81ef3ed0aa49d3b5d4623be664deb40eb7d35"

S = "${WORKDIR}/globus_gssapi_gsi-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-proxy-core globus-gsi-proxy-ssl globus-gsi-sysconfig globus-gsi-cert-utils globus-gsi-callback globus-gsi-credential" 
