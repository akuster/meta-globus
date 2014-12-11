DESCRIPTION = "Globus Toolkit - Globus GridFTP Server Programs"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "openssl libgcrypt globus-io globus-ftp-control globus-gfork globus-gridftp-server-control globus-authz"

LIC_FILES_CHKSUM = "file://globus_gridftp_server.c;beginline=4;endline=5;md5=736323dfba47917c4dfc5a209af4e5f6"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "df01e398c5d2fb0718be274cc3884e84"
SRC_URI[archive.sha256sum] = "a68ead79f51e4ba9f8991ea97b7cabf7a604fa8da57b013d143eb4a6ea63fa0a"
SRC_URI[dpatch.md5sum] = "600e0d1aaca6769832ee11c59b9b89d6"
SRC_URI[dpatch.sha256sum] = "705f9cd8234883ab0043566457271594d44a5a020a6e11ec7e37c6cf638fe08b"

S = "${WORKDIR}/globus_gridftp_server-${PV}"

inherit autotools pkgconfig

FILES_${PN} += "/run /var/run"

RDEPENDS_${PN} = "globus-usage globus-ftp-control globus-gsi-sysconfig globus-gsi-cert-utils globus-gsi-openssl-error"
