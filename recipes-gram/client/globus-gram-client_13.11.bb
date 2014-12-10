DESCRIPTION = "Globus Toolkit - GRAM Client Library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io globus-gss-assist globus-gssapi-error globus-gram-protocol"

LIC_FILES_CHKSUM = "file://globus_gram_client.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "871e872fcec010d54791cc28d8b35261"
SRC_URI[archive.sha256sum] = "afbaa5808a00517aba1a9fa03c206f2d33698d4a9a57e0d372a8f21e10bb53fd"
SRC_URI[dpatch.md5sum] = "aa70dab4f401fa7761d934b57a7a5563"
SRC_URI[dpatch.sha256sum] = "fbad93c46fb1115a764f572d8442e6381235eb74ba389a4ba08d69790eac39e5"

S = "${WORKDIR}/globus_gram_client-${PV}"

inherit autotools pkgconfig

#FILES_${PN} += "${libdir}/perl/*"

RDEPENDS_${PN} = "globus-gram-protocol globus-rsl"
