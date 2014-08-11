# Copyright (C) 2012, 2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel
require recipes-kernel/linux/linux-dtb.inc

KBRANCH_DEFAULT = "standard/base"
KBRANCH = "${KBRANCH_DEFAULT}"

SRCBRANCH_sama5d4ek = "at91-3.10-trunk/sama5d4_integration"
SRC_URI_sama5d4ek = "git://git@github.com/linux4sam/linux-at91-timesys.git;protocol=ssh;branch=${SRCBRANCH_sama5d4ek}"
SRC_URI_sama5d4ek += "file://defconfig"
SRCREV_sama5d4ek = "4843608072cc3f46ca3ff7055bfc1a6c5e57b223"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(sama5d4ek)"
