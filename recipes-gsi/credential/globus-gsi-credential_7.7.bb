DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-gsi-callback"

LIC_FILES_CHKSUM = "file://library/globus_gsi_credential.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "043ef19127d4fcccaa2aef02eb11aa94"
SRC_URI[archive.sha256sum] = "c9087102ee99b581d96bb519b6d9175ef5089b4774a25d823b128e5976412796"
SRC_URI[dpatch.md5sum] = "d6687d8c5a45cecbc915bb9589aba0cb"
SRC_URI[dpatch.sha256sum] = "3bbb8a4fbef38f69042cce727c7a6cbb7c511c5d50835e4e3e9abe878cfee8b5"

S = "${WORKDIR}/globus_gsi_credential-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-callback globus-gsi-sysconfig"
