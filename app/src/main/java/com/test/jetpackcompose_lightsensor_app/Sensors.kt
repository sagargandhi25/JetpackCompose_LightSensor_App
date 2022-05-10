package com.test.jetpackcompose_lightsensor_app

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

class LightSensor(
    context: Context
): AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_LIGHT,
    sensorType = Sensor.TYPE_LIGHT
)

//can add whatever sensors you want to add
//class ProximitySensor(
//    context: Context
//): AndroidSensor(
//    context = context,
//    sensorFeature = PackageManager.FEATURE_SENSOR_PROXIMITY,
//    sensorType = Sensor.TYPE_PROXIMITY
//)
