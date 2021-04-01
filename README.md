## Sensors 
can be used to monitor the three-dimensional device movement or change in the environment of the device.
Android provides sensor api to work with different types of sensors


## This App focuses on Sensors example that 
- prints x, y and z axis values. Here, we are going to see that.
- changes the background color when device is shuffled. Click for changing background color of activity sensor example

## Android Sensor API

Android sensor api provides many classes and interface. The important classes and
interfaces of sensor api are as follows:
- SensorManager class

## The android.hardware.SensorManager class provides methods :
- to get sensor instance,
- to access and list sensors,
- to register and unregister sensor listeners etc.

## You can get the instance of SensorManager by calling the method getSystemService() and passing the SENSOR_SERVICE constant in it.
- SensorManager sm= (SensorManager)getSystemService(SENSOR_SERVICE);
- Sensor class

## The android.hardware.Sensor class provides methods to get information of the sensor
such as sensor 
- name 
- sensor type
- sensor resolution
- sensor type etc.

## SensorEvent class
Its instance is created by the system. It provides information about the sensor.

## SensorEventListener interface
It provides two call back methods to get information when sensor values (x,y and z) change
or sensor accuracy changes.



|    Public and abstract methods Description           |                  Decription                    |
| ---------------------------------------------------- | ---------------------------------------------- |
| void onAccuracyChanged(Sensor sensor, int accuracy)  | it is called when sensor accuracy is changed.  |
|     void onSensorChanged(SensorEvent event)          |  it is called when sensor values are changed.  |


