DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-common globus-gsi-proxy-ssl libgcrypt globus-gsi-openssl-error"

LIC_FILES_CHKSUM = "file://library/globus_openssl.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "564c0e1166231b2dde259145db234370"
SRC_URI[archive.sha256sum] = "846883b3c6a6b50e7dff963f865c8345bf2e8a324680b53288dc1ceb5fd5c263"
SRC_URI[dpatch.md5sum] = "d6211c3fce136bab57e88f5d8e4c28ba"
SRC_URI[dpatch.sha256sum] = "95adbbda36aae31c89584f2de6f38aca1847b412f246e0bfa234f9601e5a7b0f"

S = "${WORKDIR}/globus_openssl_module-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-common globus-gsi-proxy-ssl libcrypto libssl globus-gsi-openssl-error libtool"
