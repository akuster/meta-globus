DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-gsi-sysconfig globus-openssl-module globus-gsi-cert-utils globus-gsi-credential globus-gsi-callback globus-gsi-proxy-core globus-gss-assist"

LIC_FILES_CHKSUM = "file://GLOBUS_LICENSE;beginline=2;endline=3;md5=be7a69ad89bb32348d4e7fcfd77e1ba6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "a9c05d0d96b9a1d406ec8f48ad3b343d"
SRC_URI[archive.sha256sum] = "2867dfa41786354a095de13906d0c0b3ef1b6138ba6c8aab5d58491469dba1fa"
SRC_URI[dpatch.md5sum] = "8ccf8cf57fde5a4daab2367bd37d6d6d"
SRC_URI[dpatch.sha256sum] = "c935900d53562302fad5eaac5acea8480d536ed0aaa2d6ac6893f20a61a8b41d"

S = "${WORKDIR}/globus_proxy_utils-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-openssl-module globus-gsi-sysconfig globus-gsi-proxy-core globus-gss-assist globus-gsi-callback globus-gsi-credential"
