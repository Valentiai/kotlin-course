package org.example.lessons.lesson18.homeworks

import java.io.InputStream

interface Powerable {
    fun powerOn()
    fun powerOff()
}

interface Openable {
    fun open()
    fun close()
}

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}

interface WaterConnection {
    fun connectToWaterSupply()
    fun getWater(amount: Int)
}

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}

interface Drainable {
    fun connectToDrain()
    fun drain()
}

interface Timable {
    fun setTimer(time: Int)
}

interface BatteryOperated {
    fun getCapacity(): Double
    fun replaceBattery()
}

interface Mechanical {
    fun performMechanicalAction()
}

interface LightEmitting {
    fun emitLight()
    fun completeLiteEmission()
}

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}

interface Programmable {
    fun programAction(action: String)
    fun execute()
}

interface Movable {
    fun move(direction: String, distance: Int)
}

interface Cleanable {
    fun clean()
}

interface Rechargeable {
    fun getChargeLevel(): Double
    fun recharge()
}

abstract class Refrigerator :
    Powerable,
    TemperatureRegulatable,
    Cleanable

// Стиральная машина
abstract class WashingMachine :
    Powerable,
    WaterConnection,
    Drainable,
    TemperatureRegulatable,
    Timable,
    AutomaticShutdown,
    Cleanable

// Умная лампа
abstract class SmartLamp :
    Powerable,
    LightEmitting,
    Programmable,
    Timable

// Электронные часы
abstract class DigitalClock :
    Powerable,
    Timable,
    LightEmitting,
    Programmable

// Робот-пылесос
abstract class RobotVacuumCleaner :
    Powerable,
    Movable,
    Rechargeable,
    Programmable,
    Cleanable

// Механические часы
abstract class MechanicalClock :
    Mechanical,
    Timable

// Фонарик
abstract class Flashlight :
    Powerable,
    LightEmitting,
    BatteryOperated

// Кофемашина
abstract class CoffeeMachine :
    Powerable,
    WaterConnection,
    Drainable,
    TemperatureRegulatable,
    Programmable,
    Cleanable,
    AutomaticShutdown

// Умная колонка
abstract class SmartSpeaker :
    Powerable,
    SoundEmitting,
    Programmable,
    Rechargeable,
    Timable