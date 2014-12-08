DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://GLOBUS_LICENSE;beginline=2;endline=3;md5=be7a69ad89bb32348d4e7fcfd77e1ba6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "e522ac7d4c8f6ebd61292cda18f04f19"
SRC_URI[archive.sha256sum] = "0b1f35ab2b7e9cbe3ee1a0958fd60b28d9890c5ebe30dec647026bf35a80d8bd"
SRC_URI[dpatch.md5sum] = "435cc26171747154eb682e6d66e53c13"
SRC_URI[dpatch.sha256sum] = "870e99dabd198d7df84bf270c3ffe298a79424682122e41ef89ac0e48f67d4e2"

S = "${WORKDIR}/globus_simple_ca-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-common"
