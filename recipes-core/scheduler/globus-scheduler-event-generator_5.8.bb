DESCRIPTION = " Globus Toolkit - Globus XIO GSI Driver Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit/docs/6.0/xio"
SECTION = "networking"
LICENSE = "Apache-2.0"

DEPENDS = "globus-io globus-callout globus-gram-protocol"

LIC_FILES_CHKSUM = "file://globus_scheduler_event_generator.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-1.debian.tar.xz;name=dpatch \
    "
SRC_URI[archive.md5sum] = "4858f68608aa8ad520876955085f57aa"
SRC_URI[archive.sha256sum] = "d4da866c4b5c0b5d70dd6437f3d8692134909674246a8112fbe38929131c5772"
SRC_URI[dpatch.md5sum] = "67cb8cf9b8a76bc319427a2e63fb8614"
SRC_URI[dpatch.sha256sum] = "2b3bd571493d37b513fe1c88e94b769a05cbd8fd642196abfc936fc8e46afdb0"

S = "${WORKDIR}/globus_scheduler_event_generator-${PV}"

inherit autotools pkgconfig

RDEPENDS_${PN} = "globus-io globus-xio globus-gssapi-gsi globus-gss-assist globus-gsi-sysconfig globus-openssl-module globus-gsi-cert-utils globus-gsi-callback globus-gssapi-error globus-gsi-credential globus-gsi-proxy-core"
