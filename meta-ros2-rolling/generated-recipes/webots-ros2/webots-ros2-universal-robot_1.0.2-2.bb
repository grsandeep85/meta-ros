# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Universal Robot ROS2 interface for Webots."
AUTHOR = "Cyberbotics <support@cyberbotics.com>"
HOMEPAGE = "http://wiki.ros.org/webots_ros2"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "webots_ros2"
ROS_BPN = "webots_ros2_universal_robot"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    control-msgs \
    rclpy \
    rosgraph-msgs \
    rviz2 \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    webots-ros2-core \
    webots-ros2-ur-e-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cyberbotics/webots_ros2-release/archive/release/rolling/webots_ros2_universal_robot/1.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/rolling/webots_ros2_universal_robot"
SRC_URI = "git://github.com/cyberbotics/webots_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "d6e4ae8663597298b0c0d983c44e9d2dd6dfb8b9"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
