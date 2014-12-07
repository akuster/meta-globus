DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = " globus-common openssl"

LIC_FILES_CHKSUM = "file://library/globus_error_openssl.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "eff089ad9fd0612788938345f9c1934c"
SRC_URI[archive.sha256sum] = "71e841acd383c0be7f6a78cf44129692d2e83d2cf5dca974ee29f3aee06a78b9"
SRC_URI[dpatch.md5sum] = "b1956c2024086a96c5de012557a07c12"
SRC_URI[dpatch.sha256sum] = "1f24827d4fa790fca449238c64e66a10518798c5d0c3a904b47cfe5b660b0da8"

S = "${WORKDIR}/globus_gsi_openssl_error-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-common openssl"

