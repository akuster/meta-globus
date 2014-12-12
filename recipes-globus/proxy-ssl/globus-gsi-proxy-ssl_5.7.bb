DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "openssl"

LIC_FILES_CHKSUM = "file://library/proxypolicy.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "253bdf378c94381bda9c47ffeb3f6f63"
SRC_URI[archive.sha256sum] = "66cb96835a557e61ca9bd4b97a2fba58f614707352b0b33fe34edf16dc6c4649"
SRC_URI[dpatch.md5sum] = "c86799974df0f766592f4691d1ae7078"
SRC_URI[dpatch.sha256sum] = "b315d12dd369848aac0645cc03b9526a373846e5fd7fc76667d9a358e56497c3"

S = "${WORKDIR}/globus_gsi_proxy_ssl-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "openssl"
