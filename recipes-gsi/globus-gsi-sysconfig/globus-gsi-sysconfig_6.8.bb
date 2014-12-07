DESCRIPTION = " "
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/gsiopenssh"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-gsi-openssl-error globus-openssl-module"

LIC_FILES_CHKSUM = "file://library/globus_gsi_system_config.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "09f1b2ddca196c5d0d6343dfc2b7e2ac"
SRC_URI[archive.sha256sum] = "fb2e6b7046862de8944065a887498bcb5d168abfa35bcc522f245cfb7a7c791c"
SRC_URI[dpatch.md5sum] = "95df557ea058598b046d22d123e58f09"
SRC_URI[dpatch.sha256sum] = "b6ab533e120137d684467b7861b2d02134a7758c9b7ef8e12b7c6fe5e46c6ca2"

S = "${WORKDIR}/globus_gsi_sysconfig-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-gsi-openssl-error globus-openssl-module"
