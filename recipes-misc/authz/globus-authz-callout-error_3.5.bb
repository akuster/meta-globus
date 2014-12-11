DESCRIPTION = "Globus Toolkit - Globus authz error library Development Files"
HOMEPAGE = "http://toolkit.globus.org/toolkit"
SECTION = "networking"
LICENSE = "Apache-2.0"
DEPENDS = "globus-common"

LIC_FILES_CHKSUM = "file://globus_gsi_authz_callout_error.c;beginline=2;endline=3;md5=c7c837422acdd14cafd3833a2bc8bc69"

SRC_URI = "${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}.orig.tar.gz;name=archive \
    ${DEBIAN_MIRROR}/main/g/${BPN}/${BPN}_${PV}-3.debian.tar.xz;name=dpatch \
    "

SRC_URI[archive.md5sum] = "383089c441a69f46cf0baf7eeb70ae5b"
SRC_URI[archive.sha256sum] = "ffefb40d1d3b0295eeeb6cacb93d5f421787b325346c93ebc98f79c8e51fb45f"
SRC_URI[dpatch.md5sum] = "cbdbc65311f5f759b15664f4efc96771"
SRC_URI[dpatch.sha256sum] = "d67d5e95f23dc7a39462d9b4ca9de9b0485878547e179ce75b2c872b0c1c68e8"

S = "${WORKDIR}/globus_authz_callout_error-${PV}"

inherit autotools pkgconfig

#FILES_${PN} += "/run /var/run"

#RDEPENDS_${PN} = "globus-common"
