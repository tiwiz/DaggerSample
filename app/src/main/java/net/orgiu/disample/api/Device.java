package net.orgiu.disample.api;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

public class Device{

    @SerializedName("DeviceName")
    private final String deviceName;
    @SerializedName("Brand")
    private final String brand;
    @SerializedName("technology")
    private final String technology;
    @SerializedName("gprs")
    private final String gprs;
    @SerializedName("edge")
    private final String edge;
    @SerializedName("announced")
    private final String announced;
    @SerializedName("status")
    private final String status;
    @SerializedName("dimensions")
    private final String dimensions;
    @SerializedName("weight")
    private final String weight;
    @SerializedName("sim")
    private final String sim;
    @SerializedName("type")
    private final String type;
    @SerializedName("size")
    private final String size;
    @SerializedName("resolution")
    private final String resolution;
    @SerializedName("card_slot")
    private final String cardSlot;
    @SerializedName("alert_types")
    private final String alertTypes;
    @SerializedName("loudspeaker_")
    private final String loudspeaker;
    @SerializedName("sound_c")
    private final String soundC;
    @SerializedName("wlan")
    private final String wlan;
    @SerializedName("bluetooth")
    private final String bluetooth;
    @SerializedName("gps")
    private final String gps;
    @SerializedName("radio")
    private final String radio;
    @SerializedName("usb")
    private final String usb;
    @SerializedName("messaging")
    private final String messaging;
    @SerializedName("browser")
    private final String browser;
    @SerializedName("java")
    private final String java;
    @SerializedName("features_c")
    private final String featuresC;
    @SerializedName("battery_c")
    private final String batteryC;
    @SerializedName("stand_by")
    private final String standBy;
    @SerializedName("talk_time")
    private final String talkTime;
    @SerializedName("colors")
    private final String colors;
    @SerializedName("sensors")
    private final String sensors;
    @SerializedName("cpu")
    private final String cpu;
    @SerializedName("internal")
    private final String internal;
    @SerializedName("os")
    private final String os;
    @SerializedName("primary_")
    private final String primary;
    @SerializedName("video")
    private final String video;
    @SerializedName("secondary")
    private final String secondary;
    @SerializedName("speed")
    private final String speed;
    @SerializedName("network_c")
    private final String networkC;
    @SerializedName("chipset")
    private final String chipset;
    @SerializedName("features")
    private final String features;
    @SerializedName("music_play")
    private final String musicPlay;
    @SerializedName("protection")
    private final String protection;
    @SerializedName("gpu")
    private final String gpu;
    @SerializedName("multitouch")
    private final String multitouch;
    @SerializedName("nfc")
    private final String nfc;
    @SerializedName("camera")
    private final String camera;
    @SerializedName("performance")
    private final String performance;
    @SerializedName("_2g_bands")
    private final String _2gBands;
    @SerializedName("_3_5mm_jack_")
    private final String _35mmJack;
    @SerializedName("_3g_bands")
    private final String _3gBands;
    @SerializedName("_4g_bands")
    private final String _4gBands;

    public Device() {
        this.deviceName = "";
        this.brand = "";
        this.technology = "";
        this.gprs = "";
        this.edge = "";
        this.announced = "";
        this.status = "";
        this.dimensions = "";
        this.weight = "";
        this.sim = "";
        this.type = "";
        this.size = "";
        this.resolution = "";
        this.cardSlot = "";
        this.alertTypes = "";
        this.loudspeaker = "";
        this.soundC = "";
        this.wlan = "";
        this.bluetooth = "";
        this.gps = "";
        this.radio = "";
        this.usb = "";
        this.messaging = "";
        this.browser = "";
        this.java = "";
        this.featuresC = "";
        this.batteryC = "";
        this.standBy = "";
        this.talkTime = "";
        this.colors = "";
        this.sensors = "";
        this.cpu = "";
        this.internal = "";
        this.os = "";
        this.primary = "";
        this.video = "";
        this.secondary = "";
        this.speed = "";
        this.networkC = "";
        this.chipset = "";
        this.features = "";
        this.musicPlay = "";
        this.protection = "";
        this.gpu = "";
        this.multitouch = "";
        this.nfc = "";
        this.camera = "";
        this.performance = "";
        this._2gBands = "";
        this._35mmJack = "";
        this._3gBands = "";
        this._4gBands = "";
    }

    public Device(String deviceName, String brand, String technology, String gprs, String edge, String announced, String status, String dimensions, String weight, String sim, String type, String size, String resolution, String cardSlot, String alertTypes, String loudspeaker, String soundC, String wlan, String bluetooth, String gps, String radio, String usb, String messaging, String browser, String java, String featuresC, String batteryC, String standBy, String talkTime, String colors, String sensors, String cpu, String internal, String os, String primary, String video, String secondary, String speed, String networkC, String chipset, String features, String musicPlay, String protection, String gpu, String multitouch, String nfc, String camera, String performance, String _2gBands, String _35mmJack, String _3gBands, String _4gBands) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.technology = technology;
        this.gprs = gprs;
        this.edge = edge;
        this.announced = announced;
        this.status = status;
        this.dimensions = dimensions;
        this.weight = weight;
        this.sim = sim;
        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.cardSlot = cardSlot;
        this.alertTypes = alertTypes;
        this.loudspeaker = loudspeaker;
        this.soundC = soundC;
        this.wlan = wlan;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.radio = radio;
        this.usb = usb;
        this.messaging = messaging;
        this.browser = browser;
        this.java = java;
        this.featuresC = featuresC;
        this.batteryC = batteryC;
        this.standBy = standBy;
        this.talkTime = talkTime;
        this.colors = colors;
        this.sensors = sensors;
        this.cpu = cpu;
        this.internal = internal;
        this.os = os;
        this.primary = primary;
        this.video = video;
        this.secondary = secondary;
        this.speed = speed;
        this.networkC = networkC;
        this.chipset = chipset;
        this.features = features;
        this.musicPlay = musicPlay;
        this.protection = protection;
        this.gpu = gpu;
        this.multitouch = multitouch;
        this.nfc = nfc;
        this.camera = camera;
        this.performance = performance;
        this._2gBands = _2gBands;
        this._35mmJack = _35mmJack;
        this._3gBands = _3gBands;
        this._4gBands = _4gBands;
    }

    protected Device(Parcel in) {
        deviceName = in.readString();
        brand = in.readString();
        technology = in.readString();
        gprs = in.readString();
        edge = in.readString();
        announced = in.readString();
        status = in.readString();
        dimensions = in.readString();
        weight = in.readString();
        sim = in.readString();
        type = in.readString();
        size = in.readString();
        resolution = in.readString();
        cardSlot = in.readString();
        alertTypes = in.readString();
        loudspeaker = in.readString();
        soundC = in.readString();
        wlan = in.readString();
        bluetooth = in.readString();
        gps = in.readString();
        radio = in.readString();
        usb = in.readString();
        messaging = in.readString();
        browser = in.readString();
        java = in.readString();
        featuresC = in.readString();
        batteryC = in.readString();
        standBy = in.readString();
        talkTime = in.readString();
        colors = in.readString();
        sensors = in.readString();
        cpu = in.readString();
        internal = in.readString();
        os = in.readString();
        primary = in.readString();
        video = in.readString();
        secondary = in.readString();
        speed = in.readString();
        networkC = in.readString();
        chipset = in.readString();
        features = in.readString();
        musicPlay = in.readString();
        protection = in.readString();
        gpu = in.readString();
        multitouch = in.readString();
        nfc = in.readString();
        camera = in.readString();
        performance = in.readString();
        _2gBands = in.readString();
        _35mmJack = in.readString();
        _3gBands = in.readString();
        _4gBands = in.readString();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getBrand() {
        return brand;
    }

    public String getTechnology() {
        return technology;
    }

    public String getGprs() {
        return gprs;
    }

    public String getEdge() {
        return edge;
    }

    public String getAnnounced() {
        return announced;
    }

    public String getStatus() {
        return status;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public String getSim() {
        return sim;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public String getCardSlot() {
        return cardSlot;
    }

    public String getAlertTypes() {
        return alertTypes;
    }

    public String getLoudspeaker() {
        return loudspeaker;
    }

    public String getSoundC() {
        return soundC;
    }

    public String getWlan() {
        return wlan;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getGps() {
        return gps;
    }

    public String getRadio() {
        return radio;
    }

    public String getUsb() {
        return usb;
    }

    public String getMessaging() {
        return messaging;
    }

    public String getBrowser() {
        return browser;
    }

    public String getJava() {
        return java;
    }

    public String getFeaturesC() {
        return featuresC;
    }

    public String getBatteryC() {
        return batteryC;
    }

    public String getStandBy() {
        return standBy;
    }

    public String getTalkTime() {
        return talkTime;
    }

    public String getColors() {
        return colors;
    }

    public String getSensors() {
        return sensors;
    }

    public String getCpu() {
        return cpu;
    }

    public String getInternal() {
        return internal;
    }

    public String getOs() {
        return os;
    }

    public String getPrimary() {
        return primary;
    }

    public String getVideo() {
        return video;
    }

    public String getSecondary() {
        return secondary;
    }

    public String getSpeed() {
        return speed;
    }

    public String getNetworkC() {
        return networkC;
    }

    public String getChipset() {
        return chipset;
    }

    public String getFeatures() {
        return features;
    }

    public String getMusicPlay() {
        return musicPlay;
    }

    public String getProtection() {
        return protection;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMultitouch() {
        return multitouch;
    }

    public String getNfc() {
        return nfc;
    }

    public String getCamera() {
        return camera;
    }

    public String getPerformance() {
        return performance;
    }

    public String get_2gBands() {
        return _2gBands;
    }

    public String get_35mmJack() {
        return _35mmJack;
    }

    public String get_3gBands() {
        return _3gBands;
    }

    public String get_4gBands() {
        return _4gBands;
    }

    @Override
    public int hashCode() {
        return deviceName.hashCode();
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", technology='" + technology + '\'' +
                ", gprs='" + gprs + '\'' +
                ", edge='" + edge + '\'' +
                ", announced='" + announced + '\'' +
                ", status='" + status + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", weight='" + weight + '\'' +
                ", sim='" + sim + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                ", cardSlot='" + cardSlot + '\'' +
                ", alertTypes='" + alertTypes + '\'' +
                ", loudspeaker='" + loudspeaker + '\'' +
                ", soundC='" + soundC + '\'' +
                ", wlan='" + wlan + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", gps='" + gps + '\'' +
                ", radio='" + radio + '\'' +
                ", usb='" + usb + '\'' +
                ", messaging='" + messaging + '\'' +
                ", browser='" + browser + '\'' +
                ", java='" + java + '\'' +
                ", featuresC='" + featuresC + '\'' +
                ", batteryC='" + batteryC + '\'' +
                ", standBy='" + standBy + '\'' +
                ", talkTime='" + talkTime + '\'' +
                ", colors='" + colors + '\'' +
                ", sensors='" + sensors + '\'' +
                ", cpu='" + cpu + '\'' +
                ", internal='" + internal + '\'' +
                ", os='" + os + '\'' +
                ", primary='" + primary + '\'' +
                ", video='" + video + '\'' +
                ", secondary='" + secondary + '\'' +
                ", speed='" + speed + '\'' +
                ", networkC='" + networkC + '\'' +
                ", chipset='" + chipset + '\'' +
                ", features='" + features + '\'' +
                ", musicPlay='" + musicPlay + '\'' +
                ", protection='" + protection + '\'' +
                ", gpu='" + gpu + '\'' +
                ", multitouch='" + multitouch + '\'' +
                ", nfc='" + nfc + '\'' +
                ", camera='" + camera + '\'' +
                ", performance='" + performance + '\'' +
                ", _2gBands='" + _2gBands + '\'' +
                ", _35mmJack='" + _35mmJack + '\'' +
                ", _3gBands='" + _3gBands + '\'' +
                ", _4gBands='" + _4gBands + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Device && ((Device) obj).deviceName.equalsIgnoreCase(deviceName);
    }
}

