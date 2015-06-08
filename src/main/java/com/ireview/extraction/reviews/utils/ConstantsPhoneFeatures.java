package com.ireview.extraction.reviews.utils;

public class ConstantsPhoneFeatures {

	//All Feature Constants. This will be used as file name.
	public static final String CAMERA = "CAMERA";
	public static final String NETWORK = "NETWORK";
	public static final String MEMORY = "MEMORY";
	public static final String DISPLAY = "DISPLAY";
	public static final String PROCESSOR = "PROCESSOR";
	public static final String UPGRADE = "UPGRADE";
	public static final String PRICE = "PRICE";
	public static final String DESIGN = "DESIGN";
	public static final String SERVICE = "SERVICE";
	public static final String WIFI = "WIFI";
	public static final String AUDIO = "AUDIO";
	
	//#######################   PHONE FEATURE1 = CAMERA   #######################
	public static final String[] PHONE_CAMERA_MATCH = {"camera", "pictures", "exposure", "photosphere", "grainy", "photos", "panoramic", 
													   "indoor pics", "indoor picture", "photos", "HDR", "iso", "daylight", "mp", "megapixel", 
													   "selfi", "selfie", "selfies", "shutter", "slomo", "snapper", "autofocus", "video recording", 
													   "*MP", "megapixel", "*megapixel", "point-and-shoot", "video capture", "webcam", 
													   "image noise", "photography", "*fps", "shooter", "photographic"};
	public static final String[] PHONE_CAMERA_EXACT_MATCH = {"flash", "photo sphere", "front camera", "front cam", "cam", "white balance", 
															 "white balancing", "zoom", "white light", "day light", "low light", "mega pixel",
															 "slow motion", "slo mo", "slo-mo", "auto focus", "auto-focus", "fixed focus", 
															 "manual focus", "focus", "mega pixel", "point and shoot", "video call", 
															 "video calling", "face detection", "fastboot flash", "vga"};
	public static final String[] PHONE_CAMERA_EXACT_UNMATCH = {"photo app", "photos:", "flash sale", "flash sales", "flash drive", "flashing", 
															   "Flashed", "flash drives", "Flash Mod", "Fastboot Flash", "flash player", "flashes", 
															   "bike", "Motorcycle","flash update", "Flash stock", "flash retail", "flash custom ROM", 
															   "flash ROM", "rom flash", "flash recovery", "transfer my photos", "transfer photos", 
															   "transfer photo", "transfer my pictures", "transfer pictures", "transfer picture", 
															   "Picture transfer", "pictures didn't transfer", "pictures did not transfer", 
															   "transfer all the photos", "transfer all photos", "transfer vids and photos", 
															   "transfer data and pictures", "transfer of photos", "transfer of pictures", 
															   "Pictures won't transfer", "photos would transfer", "transfer all my photos", 
															   "transferring photos", "flash transfer", "backing photos", "Exporting Photos", 
															   "send pictures", "receive pictures", "Small sized pictures", "MotoFlash", 
															   "Photos to Gallary", "Google+ Photos", "OTA flash", "flash drive", 
															   "pictures won't send", "save photos", "save pictures", "flash roms", "photo album", 
															   "Flash Factory", "comparison picture", "Recovering deleted pictures", 
															   "Recovering deleted photos", "Photos via text", "flash the Lollipop", 
															   "flash a rom", "YouTube picture", "photos auto back up", "photos auto backup", 
															   "photos backup", "photo backup", "flash a custom ROM", "Instagram photo", 
															   "photo gallery", "photos from the gallery", "photos to the gallery", "Adobe Flash", 
															   "Importing Photos", "App Photos", "Photo folders", "photos icon", "TWRP flash", 
															   "stock flash", "Saving pictures", "Saving photos"};
	
	//#######################   PHONE FEATURE2 = NETWORK   #######################
	public static final String[] PHONE_NETWORK_MATCH = { "antenna", "antennae",  "call quality", "call drop", "dropped call", "Call clarity", 
														 "phone calls", "Call Functionality", "call facility", "Signal", "Tower", "internet"};
	public static final String[] PHONE_NETWORK_EXACT_MATCH = {"signal strength", "service area", "loss of service", "out of service", 
															  "network provider", "mobile internet", "emergency call", "voice call", 
															  "sim selection", "sim registration", "network", "IMEI", "CDMA", "UMTS", "GSM", 
															  "HSDPA", "HSDPA+", "HSUPA", "HSPA", "EDGE", "GPRS", "Coverage", "reachable", 
															  "unreachable", "reception", "service provider", "n/w", "not reachable", "mobile data", 
															  "data connection", "service area", "loss of service", "out of service", "SVLTE", 
															  "simulatenous voice and data", "simul data+voice", "SVDO", "RF", "VoLTE", "HD Voice", 
															  "Voice over LTE", "cellular network", "networking issues", "emergency calls", 
															  "emergency svc", "emergency service", "HD Voice", "radio band", "radio bands", 
															  "advanced calling", "advance calling"};
	public static final String[] PHONE_NETWORK_EXACT_UNMATCH = {"internet surfing", "reviews on the internet", "mobile data/internet", "called", 
																"accidental coverage", "Feedback Network", "Radio Signal Strength", 
																"Digital Signal Processing", "media coverage", "internet research", 
																"network_shogun", "surfing the internet", "wifi reception", "wifi signal", 
																"wifi signals", "wifi coverage", "wifi network", "wifi n/w", "WiFi Calling",};
	
	//#######################   PHONE FEATURE3 = MEMORY   #######################
	public static final String[] PHONE_MEMORY_MATCH = {"GB", "MB", "KB", "RAM", "Memory", "*GB", "*MB", "*KB", "SD", "Gig", "Meg", "storage", 
													   "microSD", "micro-SD", "microSDHC", "microSDXC"};
	public static final String[] PHONE_MEMORY_EXACT_MATCH = {"sdcard"};
	public static final String[] PHONE_MEMORY_EXACT_UNMATCH = {"custom ROM", "stock ROM", "OEM ROM", "AOSP ROM", "unicorns ROM", "custom ROMs", 
															   "cyanogen", "Cyanogenmod", "Google Play Edition ROM", "ROM", "gb model", "gb nexus", 
															   "gb nexus", "gb version", "gb variant", "gb motox", "gb motog", "gb moto", 
															   "proud owner of Moto", "proud owner of Nexus 6", "extra GB", "paid for 64 GB", 
															   "gb of data", "GB/month", "GB/week", "GB/day", "mb/month", "mb/week", "mb/day", 
															   "GB per month", "GB per week", "GB per day", "GB 3G data", "GB 2G data", 
															   "GB daily", "gb data", "GB 3G/2G data", "Gb version", "got moto x 16 gb", 
															   "got moto x 16gb", "got moto x(16 gb)", "got the 16 GB", 
															   "Awaited for moto x 2nd gen (32 gb)", "got the 32 GB model", "got the 16 GB model", 
															   "got the 8 GB model", "got the 64 GB model", "got the 32 GB version", 
															   "got the 16 GB version", "got the 8 GB version", "got the 64 GB version", 
															   "8 GB isn't available", "16 GB isn't available", "32 GB isn't available", 
															   "64 GB isn't available", "8 GB is not available", "16 GB is not available", 
															   "32 GB is not available", "64 GB is not available", "Ordered", "Purchased}", 
															   "8 GB version", "16 GB version", "32 GB version", "64 GB version", "8GB version", 
															   "16GB version", "32GB version", "64GB version", "Moto G 16GB", "Moto G 16 GB", 
															   "Moto G 8GB", "Moto G 8 GB", "moto g 32gb", "moto g 32 gb", "Moto x 16GB", 
															   "Moto x 16 GB", "Moto x 8GB", "Moto x 8 GB", "moto x 32gb", "moto x 32 gb", 
															   "nexus 6 32gb", "nexus 6 32 gb", "nexus 6 64gb", "nexus 6 64 gb", "64GB Nexus 6", 
															   "64 GB Nexus 6", "32GB Nexus 6", "32 GB Nexus 6", "n6 32gb", "n6 32 gb", "n6 64gb", 
															   "n6 64 gb", "64GB n6", "64 GB n6", "32GB n6", "32 GB n6", "16gb Moto G", 
															   "16 gb Moto G", "8gb Moto G", "8 gb Moto G", "16gb Moto X", "16 gb Moto X", 
															   "32gb Moto X", "32 gb Moto X", "Gb Model available" };

	//#######################   PHONE FEATURE4 = DISPLAY   #######################
	public static final String[] PHONE_DISPLAY_MATCH = {"Screen", "Amoled", "Gorilla", "Capacitive", "4.7-inch", "inch", "Touchscreen", "Resistive", 
														"720p", "1080p", "TFT", "LCD", "IPS LCD", "4-inch", "4.3-inch", "4.5-inch", "5-inch", 
														"5.2-inch",  "ppi", "*ppi", "*inch", "*-inch", "coating", "repellent", "repellant", "water", 
														"retina", "ratina","coating", "Oleophobic", "glass", "scratch", "fragile screen", "brittle", 
														"OLED", "pixels", "display", "back lit", " resolution", "corning", "corning"};
	public static final String[] PHONE_DISPLAY_EXACT_MATCH = { "screen ontime", "records in 1080p", "records in 720p","pixel per inch", 
															   "pixels per inch", "1920 x 1080", "1920x1080", "5.2", "touch screen", "viewing angle", 
															   "viewing angles", "Quad HD", "corning", "corning"};
	public static final String[] PHONE_DISPLAY_EXACT_UNMATCH = {"start screen", "pick screen", "blank screen", "screen on time", "material design", 
																"skins", "home screen", "settings screen", "lock screen", "active display", 
																"boot screen", "cast screen", "screen cast", "lock-screen", "screen shots", 
																"screenshot", "screenshots", "screen shot", "1080p videos", "1080p video", 
																"720p videos", "720p video", "fullscreen", "full screen", "lock screen", 
																"lockscreen", "screen wallpaper", "homescreen", "screen home", "home screens", 
																"lock screens", "home-screen", "On screen navigation", "mega pixel", "mega pixels", 
																"chromebook pixel", "mirror my screen", "mirror screen", "screen mirror", 
																"ambient display", "ambient screen", "water", "wake up screen", 
																"wake up the screen", "navigationscreen", "Navigation displayed", "screen lock", 
																"lock the screen"};
	
	//#######################   PHONE FEATURE5 = PROCESSOR   #######################
	public static final String[] PHONE_PROCESSOR_MATCH = {"CPU", "GPU", "Processor", "Snapdragon", "Snap Dragon", "Krait", "Qualcomm", "Dual-Core", 
														  "Octa-Core", "Quad-Core",  "MSM8x10", "MSM", "GHz", "Cortex", "Cortex-A7", "A7", "Adreno", 
														  "*GHz", "*MHz", "GHz", "MHz", "*-GHz", "*-MHz", "X8", "v7", "Mediatek",  "Mali-400"};
	public static final String[] PHONE_PROCESSOR_EXACT_MATCH = {"Dual Core", "Octa Core", "Quad Core", "Media tek", "TI", "Texas Instruments", 
																"nvidia", "envidia", "Tegra", "apx", "Exynos", "Intel", "Intel Atom", "Celeron", 
																"Krait", "ARM", "Marvell", "AmLogic", "Renesas", "Fast response"};
	public static final String[] PHONE_PROCESSOR_EXACT_UNMATCH = {};
	
	//#######################   PHONE FEATURE6 = UPGRADE   #######################
	public static final String[] PHONE_UPGRADE_MATCH = {"updated to lollipop", "os update", "android update", "5.0 update", " ota", 
														"firmware update", "firmware upgrade", "lollipop upgrade", "lollipop update", 
														"l upgrade", "l update", " android 5.0",  "update installed",  "update", "android5", 
														"androidlollipop",   "5.1 update",  "update 5.1", "5.1 OS update",   "5 1 1", "lollipop"};
	public static final String[] PHONE_UPGRADE_EXACT_MATCH = {"Android L", "L Release", "to lollipop", "LollipopUpdate","material design",
															  "please upgrade", "bota", "since upgrade", "upgraded","Lollipop 5.1", "Android 5.1", 
															  "5.1 android", "LollipopUpdate 5.1","5.1 version", "AndroidLollipop 5.1", 
															  "version 5.1", "Android5.1", "L 5.1","5.}"};
	public static final String[] PHONE_UPGRADE_EXACT_UNMATCH = {"any updates", "app update", "inbox not updating", "inbox updating", 
																"update status", "customer support center", "customer care", "shield update", 
																"any update", "delivery update", "courier", "Facebook", "calling update", 
																"advance calling update", "VOlte update", "updating the delivery", 
																"Google play update", "camera update", "gallery update", "Firmware Update", 
																"auto update", "auto updates", "preloaded", "pre-loaded", "out of the box", 
																"out of box"};
	
	//#######################   PHONE FEATURE7 = PRICE   #######################
	public static final String[] PHONE_PRICE_MATCH = {"Price", "Cost", "Money", "dollars", "Rupees", "6999", "$", "$*", "*$",  "cheap", "costly", 
													  "overpriced", "discount", "14999", "13999", "*999", "INR",  "sub-15k", "15k", "14k", "10k", 
													  "7k", "pricy", "pricey", "expensive",  "euro", "pounds", "euro", "pounds", "cashback", "rebate", 
													  "freebies",   "-4K Recording"};
	public static final String[] PHONE_PRICE_EXACT_MATCH = {"Rs", "priced at","Rs6999","MRP", "bucks", "EUR", "INR", "USD"};
	public static final String[] PHONE_PRICE_EXACT_UNMATCH = {"4k video","Cheap HEAPHONES", "cheap camera", "return money", "return my money", 
															  "cheap quality", "EURO DROID", "4k vid", "cheap screen", "look cheap", 
															  "2k display", "cheap part", "cheap feel", "cheap strap", "cheap products", 
															  "cheap product", "cheap plastic", "cheap brand", "cheap processor", "cheap quality", 
															  "look cheap", "looks cheap", "feel cheap", "feels cheap"};
	
	//#######################   PHONE FEATURE8 = DESIGN   #######################
	public static final String[] PHONE_DESIGN_MATCH = {"durability", "light finish", "dark finish", "gold finish", "champagne gold",  "wood", 
													   "leather", "metal", "material", "aluminium", "Horween", "FSC", "Bamboo", "teak", 
													   "walnut", "ebony", "cognac",  "polycarbonate",  "steel", "enamel",  "plain Jane", 
													   "dent", "bezel", "notch", "P67", "MIL-spec", "810G", "Water", "water-resistant", "p2i",
													   "underwater", "repellant",  "rain",  "scrapes", "scratches", "sturdiness", "sturdy", 
													   "dust", "altitude", "humidity",  "robust", "kevlar",  "grams", "*gms", "*grams", 
													   "Ounce", "*ounce", "weight", "weighs", "gms", "light-weight", "oz", "*oz",  "overweight", 
													   "grams", "*lb", "lbs",  "slenderness", "slim", "thickness",  "compact", "height",  
													   "Width", "Thin", "radius",  "sleek",  "wafer-thin",  "*mm", "*cm", "cm",  "inch", 
													   "*inch",  "grip",  "grill", "backplate", "assembly", "ergonomics", "{ballistic nylon}", 
													   "nylon", "MGF", "Dupont", "fiber",  "sleek", "heavy", "square", "circle", "circular", 
													   "round", "water",  "gorilla", "glass"};
	public static final String[] PHONE_DESIGN_EXACT_MATCH = {"wood-packed", "metal-backed", "leather-backed","unibody metal construction", 
															 "metal skeleton", "stainless steel", "plastic", "raw materials", "plasticky", "alloy", 
															 "magnesium", "aluminium-magnesium", "material quality", "quality of materials", 
															 "navy", "natural oils","natural materials", "rubber","beautiful design", "plain-Jane",
															 "unspectacular", "tastes", "good looks", "blandest designs", "industrial design", 
															 "industrial look", "industrial", "good looking", "flimsy", "better design", 
															 "utilitarian look", "neatly-built", "premium feel", "solidly built", 
															 "construction quality", "gaudy", "craftsmanship", "tight build quality", 
															 "glossy finish", "matte finish", "silk finish", "sandstone finish", "faux-rivets", 
															 "composite shell", "motorola logo", "uneccessary accents", "branding", 
															 "depression", "waterproofing", "water proofing", "nano-coating", "liquid repellant", 
															 "swimming", "nano coating", "accidental spills","splash proof","scratch resistance", 
															 "light scratches", "fingerprint magnet", "shock resistance", "construction quality", 
															 "hard knocks", "everlasting", "durability", "rugged", "reinforced corners",
															 "carbon fiber", "rigid structure","wider", "thicker","phone size", "device size", 
															 "manageable size", "fits comfortably", "nicely in your hand", "diameter","bulky", 
															 "perfectly sized", "slip into a pocket", "use with one hand", "one-handed use", 
															 "one hand", "pudgy", "chunkier","oversized", "over-sized","inches", "slippery", 
															 "easy to handle", "good grip","secure in your hand", "secure in hand", 
															 "structural", "headset socket", "power button", "buttons and ports", "SIM tray", 
															 "volume rocker", "grille", "microUSB charging port", "headphone jack", 
															 "mini-HDMI port", "front-facing speakers", "front facing speakers", "headphone jack",
															 "back plate", "back cover", "removable back", "rear panel", "front panel", 
															 "back panel", "size of the phone","workmanship", "Moto Bands", "Grip Shells", 
															 "Grip Shell", "Moto band", "grip", "145g", "145 g", "taller", "wider","mm", "cms", 
															 "build quality", "protective cover", "protective covers","metalized", "aluminium", 
															 "high-strength", "waterproof", "water-proof", "water proof", "water resistant", 
															 "water-resistant", "waterresistant", "ip64", "ip67","stainless steel", "316l", 
															 "gorgeous", "beautiful", "classy", "warp", "dimple", "light weight"};
	public static final String[] PHONE_DESIGN_EXACT_UNMATCH = {"belt", "strap", "Z3 compact", "Z3 compact", "wider selection", "wide selection", 
															   "strap", "band", "band", "heavy lifting", "spec heavy", "grip covers", "grip cover", 
															   "heavy user", "heavy gaming", "heavy use", "heavy applications", "heavy apps}", 
															   "heavy animations", "heavy games", "heavy thoughs", "heavy graphics", "heavy usage", 
															   "heavy photos", "heavy photo", "heavy application", "heavy app", "heavy animation", 
															   "heavy game", "heavy though", "heavy graphic", "heavy fat", "rubber tips", 
															   "Z1 Compact", "Z3 Compact", "compact camera", "Weight Watchers", "Weight Watcher", 
															   "heavy traffic","material design", "skins"};
	
	//#######################   PHONE FEATURE9 = SERVICE   #######################
	public static final String[] PHONE_SERVICE_MATCH = {"Customer relations",  "technical support", "escalate",   "sales service",  "sales support"};
	public static final String[] PHONE_SERVICE_EXACT_MATCH = {"service center", "call center", "Service Centre", "Call Centre", 
															  "Customer Support", "Customer Service", "After sales", "Post Sales", "replacement", 
															  "return", "returning", "returned", "representative", "customer agent", "service agent",
															  "verizon agent", "motorola agent", "flipkart agent", "FK agent", "executive", 
															  "service rep", "refund", "Customer Care", "spares", "spears", "repair", 
															  "troubleshoot","moto care", "aftersales", "postsales", "flipkart CS", "CS", 
															  "service by Flipkart", "service of Flipkart", "request for return", 
															  "service from Flipkart","sale rep","service by flipkart", "Flipkart Service", 
															  "helpline", "helpdesk","Motorola Service", "service station", "service Motorola", 
															  "amazon service", "Flipkart's service","Motorola’s Service", "Motorolas Service", 
															  "service by Flipkart", "service by motorola", "service by Amazon","Cust svc", 
															  "warranty", "service by verizon", "service of verizon", "service by Flipkart", 
															  "service of Flipkart", "verizonservice", "verizonsservice", "amazonservice", 
															  "amazonsservice","poor service","Service person", "return to flipkart", 
															  "return to amazon", "return to verizon", "return to best buy", "return to store"};
	public static final String[] PHONE_SERVICE_EXACT_UNMATCH = {"replaced","replacement SIM","Replacement Cover", "flipkartsupport", 
																"flipkart support","replacement for my Windows Phone", 
																"replacement for my iPhone", "replacement for Windows Phone", 
																"replacement for an iPhone", "replacement for my galaxy", "replacement for nexus", 
																"Back Replacement Cover", "verizonsupport", "verizonssupport", "amazonsupport", 
																"amazonssupport","return key", "MotorolaSupport","returned home", "return home", 
																"returning home", "returned office", "returning office", "returning to", 
																"return to", "returned to apple", "returned to iphone", "returned to samsung", 
																"returned to galaxy", "returned to htc", "returned to moto", "returned from"};
	
	//#######################   PHONE FEATURE10 = WIFI   #######################
	public static final String[] PHONE_WIFI_MATCH = {"WiFi", "hotspot", "WiFi Calling"};
	public static final String[] PHONE_WIFI_EXACT_MATCH = {"Wi Fi", "Wi-Fi","hot spot", "hot-spot"};
	public static final String[] PHONE_WIFI_EXACT_UNMATCH = {"wifi calling", "wifi caling", "wi-fi calling", "wi fi calling", "wifi reception", 
															 "wifi signal", "wifi coverage", "wifi network", "wifi n/w", "wifi reception", 
															 "wifi signal", "wifi coverage", "wifi network", "wifi n/w"};
	
	//#######################   PHONE FEATURE11 = AUDIO   #######################
	public static final String[] PHONE_AUDIO_MATCH = {"audio", "speaker", "music", "headphones", "headset",  "earpiece", "audiorecording", 
													  "ringtone", "ring tone",  "speaker phone", "speakerphone", "speaker phone", "speakerphone", 
													  "microphone"};
	public static final String[] PHONE_AUDIO_EXACT_MATCH = {"stereo", "jazz", "bass", "sound", "mono", "audio jack", "headphone jack", 
																"loudspeaker", "ear phone", "ear phones", "earphone", "earphones", "audiojack", 
																"audioquality", "equalizer", "soundquality"};
	public static final String[] PHONE_AUDIO_EXACT_UNMATCH = {"sounds good", "sounds amazing", "sounds perfect", "sounds great", "sounds bad", 
															  "sounds worse", "sounds bitter", "sounds cold", "sounds cruel", "sounds like", 
															  "sounds fantastic", "sounds pretty good", "sounds cool", "sounds fun", "sounded fun", 
															  "sounded good", "sounded amazing", "sounded perfect", "sounded great", 
															  "sounded bad", "sounded worse", "sounded bitter", "sounded cold", "sounded cruel", 
															  "sounded like", "sounded fantastic", "sounded pretty good", "sounded cool", 
															  "music player", "music playback", "google play music", "google music play", 
															  "Speaker grill", "Google Music app", "Lock screen music", "sound Like", 
															  "sounds interesting", "sounds delayed", "Sounds ridiculous", "sounds beautiful", 
															  "sounds wonderful", "sounds better", "sounds simple", "Google Music"};
}