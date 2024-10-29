//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: GME_1Min_1MAD_de176046 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1MAD_de176046", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_de176046(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma10 <= 21.6404 )
		if( ma30_colorInt <= 3.5 )
			if( ma65 <= 21.4297 )
				if( ma35 <= 15.8015 )
					if( ma10 <= 15.5428 )
						if( ma25 <= 15.3666 )
							if( ma100 <= 13.4705 )
								if( ma20 <= 13.5154 )
									ret := 0.089017
								if( ma20 > 13.5154 )
									ret := -0.434211
							if( ma100 > 13.4705 )
								if( ma05_colorInt <= 2.5 )
									ret := 0.642259
								if( ma05_colorInt > 2.5 )
									ret := -0.002688
						if( ma25 > 15.3666 )
							if( ma90 <= 15.495 )
								if( ma45 <= 15.4622 )
									ret := 1.000000 // buy
								if( ma45 > 15.4622 )
									ret := 0.818182 // buy
							if( ma90 > 15.495 )
								if( ma55 <= 15.5072 )
									ret := -0.883333 // sell
								if( ma55 > 15.5072 )
									ret := -0.268571
					if( ma10 > 15.5428 )
						if( ma10 <= 15.8109 )
							if( ma55 <= 15.6867 )
								if( ma25 <= 15.553 )
									ret := 0.920635 // buy
								if( ma25 > 15.553 )
									ret := 0.180000
							if( ma55 > 15.6867 )
								if( ma35_colorInt <= 2.5 )
									ret := 1.000000 // buy
								if( ma35_colorInt > 2.5 )
									ret := 0.821053 // buy
						if( ma10 > 15.8109 )
							if( ma40 <= 15.6607 )
								if( ma90 <= 15.2656 )
									ret := 0.421053
								if( ma90 > 15.2656 )
									ret := 1.000000 // buy
							if( ma40 > 15.6607 )
								if( ma60 <= 15.5013 )
									ret := -1.000000 // sell
								if( ma60 > 15.5013 )
									ret := -0.238095
				if( ma35 > 15.8015 )
					if( ma30 <= 19.4624 )
						if( ma85 <= 18.7263 )
							if( ma20 <= 15.8963 )
								if( ma100 <= 16.0551 )
									ret := -0.380665
								if( ma100 > 16.0551 )
									ret := 1.000000 // buy
							if( ma20 > 15.8963 )
								if( ma20 <= 15.9594 )
									ret := 0.498350
								if( ma20 > 15.9594 )
									ret := -0.001407
						if( ma85 > 18.7263 )
							if( ma90 <= 18.8909 )
								if( ma60 <= 18.6955 )
									ret := -0.333333
								if( ma60 > 18.6955 )
									ret := -0.817734 // sell
							if( ma90 > 18.8909 )
								if( ma85 <= 19.1003 )
									ret := 0.712329 // buy
								if( ma85 > 19.1003 )
									ret := -0.366300
					if( ma30 > 19.4624 )
						if( ma90 <= 19.794 )
							if( ma20 <= 20.4405 )
								if( ma90 <= 18.5877 )
									ret := -1.000000 // sell
								if( ma90 > 18.5877 )
									ret := 0.328313
							if( ma20 > 20.4405 )
								if( ma20 <= 20.4608 )
									ret := -0.783784 // sell
								if( ma20 > 20.4608 )
									ret := 0.153846
						if( ma90 > 19.794 )
							if( ma70 <= 19.9022 )
								if( ma60 <= 19.6816 )
									ret := 1.000000 // buy
								if( ma60 > 19.6816 )
									ret := -0.304569
							if( ma70 > 19.9022 )
								if( ma10 <= 19.6152 )
									ret := 0.765625 // buy
								if( ma10 > 19.6152 )
									ret := 0.057757
			if( ma65 > 21.4297 )
				if( ma20 <= 21.4604 )
					if( ma70 <= 21.8855 )
						if( ma70 <= 21.5091 )
							if( ma55 <= 21.4104 )
								ret := 1.000000 // buy
							if( ma55 > 21.4104 )
								if( ma40 <= 21.3497 )
									ret := -0.400000
								if( ma40 > 21.3497 )
									ret := 0.302239
						if( ma70 > 21.5091 )
							if( ma30 <= 21.4667 )
								if( ma60 <= 21.5618 )
									ret := 0.433962
								if( ma60 > 21.5618 )
									ret := 0.870588 // buy
							if( ma30 > 21.4667 )
								if( ma55 <= 21.5547 )
									ret := 0.979592 // buy
								if( ma55 > 21.5547 )
									ret := 0.804348 // buy
					if( ma70 > 21.8855 )
						ret := -1.000000 // sell
				if( ma20 > 21.4604 )
					if( ma65 <= 22.2176 )
						if( ma100 <= 22.3371 )
							if( ma55 <= 21.6355 )
								if( ma40_colorInt <= 3.5 )
									ret := 0.220268
								if( ma40_colorInt > 3.5 )
									ret := -0.444444
							if( ma55 > 21.6355 )
								if( ma100 <= 21.7332 )
									ret := -0.417476
								if( ma100 > 21.7332 )
									ret := 0.273312
						if( ma100 > 22.3371 )
							if( ma45 <= 21.872 )
								ret := -0.083333
							if( ma45 > 21.872 )
								if( ma30 <= 21.7409 )
									ret := -0.600000
								if( ma30 > 21.7409 )
									ret := -1.000000 // sell
					if( ma65 > 22.2176 )
						if( ma10_colorInt <= 3.5 )
							if( ma90 <= 23.2768 )
								ret := 0.666667
							if( ma90 > 23.2768 )
								ret := 1.000000 // buy
						if( ma10_colorInt > 3.5 )
							ret := 0.380952
		if( ma30_colorInt > 3.5 )
			if( ma40 <= 15.4925 )
				if( ma65 <= 15.5043 )
					if( ma85 <= 10.0865 )
						if( ma90_colorInt <= 3.5 )
							if( ma90 <= 10.0723 )
								ret := 0.875000 // buy
							if( ma90 > 10.0723 )
								ret := 0.363636
						if( ma90_colorInt > 3.5 )
							if( ma35 <= 10.0646 )
								if( ma40 <= 10.0546 )
									ret := -0.700000 // sell
								if( ma40 > 10.0546 )
									ret := -0.230769
							if( ma35 > 10.0646 )
								ret := -1.000000 // sell
					if( ma85 > 10.0865 )
						if( ma65_colorInt <= 3.5 )
							if( ma100 <= 15.609 )
								if( ma05 <= 15.2914 )
									ret := 0.025714
								if( ma05 > 15.2914 )
									ret := -0.593220
							if( ma100 > 15.609 )
								ret := 1.000000 // buy
						if( ma65_colorInt > 3.5 )
							if( ma15 <= 10.3474 )
								if( ma75 <= 10.3236 )
									ret := 0.026087
								if( ma75 > 10.3236 )
									ret := -0.812500 // sell
							if( ma15 > 10.3474 )
								if( ma75_colorInt <= 2 )
									ret := -0.652174
								if( ma75_colorInt > 2 )
									ret := 0.296223
				if( ma65 > 15.5043 )
					if( ma75_colorInt <= 3.5 )
						ret := 1.000000 // buy
					if( ma75_colorInt > 3.5 )
						ret := 0.826087 // buy
			if( ma40 > 15.4925 )
				if( ma15 <= 15.635 )
					if( ma05 <= 15.5841 )
						if( ma65 <= 15.5364 )
							if( ma10 <= 15.5366 )
								ret := -0.555556
							if( ma10 > 15.5366 )
								ret := 0.000000
						if( ma65 > 15.5364 )
							ret := -0.714286 // sell
					if( ma05 > 15.5841 )
						if( ma20 <= 15.5412 )
							ret := -0.818182 // sell
						if( ma20 > 15.5412 )
							ret := -1.000000 // sell
				if( ma15 > 15.635 )
					if( ma10 <= 15.7679 )
						if( ma05 <= 15.7618 )
							if( ma30 <= 15.7205 )
								if( ma60 <= 15.651 )
									ret := 0.833333 // buy
								if( ma60 > 15.651 )
									ret := -0.480000
							if( ma30 > 15.7205 )
								ret := 0.933333 // buy
						if( ma05 > 15.7618 )
							if( ma55 <= 15.79 )
								ret := 1.000000 // buy
							if( ma55 > 15.79 )
								ret := 0.437500
					if( ma10 > 15.7679 )
						if( ma10 <= 16.0889 )
							if( ma55 <= 16.0404 )
								if( ma70 <= 16.0659 )
									ret := -0.239362
								if( ma70 > 16.0659 )
									ret := 1.000000 // buy
							if( ma55 > 16.0404 )
								if( ma40_colorInt <= 3.5 )
									ret := -0.384615
								if( ma40_colorInt > 3.5 )
									ret := -0.946667 // sell
						if( ma10 > 16.0889 )
							if( ma05 <= 17.4042 )
								if( ma40 <= 17.3288 )
									ret := 0.906667 // buy
								if( ma40 > 17.3288 )
									ret := 0.250000
							if( ma05 > 17.4042 )
								if( ma05 <= 18.432 )
									ret := 0.153101
								if( ma05 > 18.432 )
									ret := -0.079712
	if( ma10 > 21.6404 )
		if( ma40_colorInt <= 1.5 )
			if( ma15 <= 33.3063 )
				if( ma50 <= 32.8777 )
					if( ma35 <= 21.692 )
						if( ma10 <= 22.0538 )
							if( ma90 <= 21.0493 )
								if( ma10 <= 21.9681 )
									ret := 0.846154 // buy
								if( ma10 > 21.9681 )
									ret := 0.142857
							if( ma90 > 21.0493 )
								if( ma20 <= 21.6058 )
									ret := -0.810811 // sell
								if( ma20 > 21.6058 )
									ret := -0.253763
						if( ma10 > 22.0538 )
							if( ma50 <= 21.3528 )
								if( ma35 <= 21.0366 )
									ret := -0.428571
								if( ma35 > 21.0366 )
									ret := -1.000000 // sell
							if( ma50 > 21.3528 )
								ret := 0.076923
					if( ma35 > 21.692 )
						if( ma10 <= 33.1237 )
							if( ma85 <= 32.3662 )
								if( ma10 <= 31.115 )
									ret := -0.060310
								if( ma10 > 31.115 )
									ret := -0.271201
							if( ma85 > 32.3662 )
								if( ma75 <= 32.4589 )
									ret := 1.000000 // buy
								if( ma75 > 32.4589 )
									ret := 0.302632
						if( ma10 > 33.1237 )
							if( ma55 <= 32.5661 )
								if( ma80 <= 32.0498 )
									ret := -0.666667
								if( ma80 > 32.0498 )
									ret := -1.000000 // sell
							if( ma55 > 32.5661 )
								ret := 0.100000
				if( ma50 > 32.8777 )
					if( ma90 <= 32.8684 )
						if( ma20 <= 33.1034 )
							ret := -0.200000
						if( ma20 > 33.1034 )
							if( ma75 <= 32.846 )
								if( ma100 <= 32.6104 )
									ret := -1.000000 // sell
								if( ma100 > 32.6104 )
									ret := -0.785714 // sell
							if( ma75 > 32.846 )
								ret := -1.000000 // sell
					if( ma90 > 32.8684 )
						ret := 0.000000
			if( ma15 > 33.3063 )
				if( ma20 <= 35.99 )
					if( ma10 <= 34.9499 )
						if( ma50_colorInt <= 1.5 )
							if( ma40 <= 34.1833 )
								if( ma60 <= 33.5805 )
									ret := 0.333333
								if( ma60 > 33.5805 )
									ret := 0.867347 // buy
							if( ma40 > 34.1833 )
								if( ma75 <= 34.1027 )
									ret := -0.406250
								if( ma75 > 34.1027 )
									ret := 1.000000 // buy
						if( ma50_colorInt > 1.5 )
							ret := -1.000000 // sell
					if( ma10 > 34.9499 )
						if( ma60 <= 34.5692 )
							if( ma25 <= 35.2604 )
								ret := 1.000000 // buy
							if( ma25 > 35.2604 )
								ret := 0.777778 // buy
						if( ma60 > 34.5692 )
							if( ma90 <= 34.4461 )
								ret := 0.000000
							if( ma90 > 34.4461 )
								if( ma85 <= 34.6245 )
									ret := 1.000000 // buy
								if( ma85 > 34.6245 )
									ret := 0.760000 // buy
				if( ma20 > 35.99 )
					if( ma35 <= 36.1381 )
						if( ma45 <= 35.3976 )
							if( ma60 <= 34.9275 )
								ret := -0.947368 // sell
							if( ma60 > 34.9275 )
								ret := -0.090909
						if( ma45 > 35.3976 )
							if( ma50 <= 35.7291 )
								ret := -1.000000 // sell
							if( ma50 > 35.7291 )
								ret := -0.250000
					if( ma35 > 36.1381 )
						if( ma25 <= 67.2788 )
							if( ma70_colorInt <= 3.5 )
								if( ma45 <= 38.3696 )
									ret := 0.406593
								if( ma45 > 38.3696 )
									ret := 0.020179
							if( ma70_colorInt > 3.5 )
								if( ma40 <= 45.2742 )
									ret := -1.000000 // sell
								if( ma40 > 45.2742 )
									ret := -0.578947
						if( ma25 > 67.2788 )
							if( ma10 <= 68.5133 )
								ret := 0.000000
							if( ma10 > 68.5133 )
								if( ma55 <= 65.2011 )
									ret := -0.818182 // sell
								if( ma55 > 65.2011 )
									ret := -1.000000 // sell
		if( ma40_colorInt > 1.5 )
			if( ma80 <= 29.5421 )
				if( ma80 <= 29.4097 )
					if( ma20 <= 29.1667 )
						if( ma30 <= 29.0026 )
							if( ma10 <= 28.9671 )
								if( ma60 <= 29.1588 )
									ret := 0.008479
								if( ma60 > 29.1588 )
									ret := 0.729412 // buy
							if( ma10 > 28.9671 )
								if( ma45 <= 28.865 )
									ret := -0.873016 // sell
								if( ma45 > 28.865 )
									ret := -0.059701
						if( ma30 > 29.0026 )
							if( ma90_colorInt <= 1.5 )
								if( ma50 <= 29.171 )
									ret := -0.928571 // sell
								if( ma50 > 29.171 )
									ret := -0.545455
							if( ma90_colorInt > 1.5 )
								if( ma60 <= 29.1278 )
									ret := 0.006897
								if( ma60 > 29.1278 )
									ret := -0.576159
					if( ma20 > 29.1667 )
						if( ma30 <= 29.4729 )
							if( ma25 <= 29.1959 )
								if( ma60 <= 29.1121 )
									ret := 0.454545
								if( ma60 > 29.1121 )
									ret := 0.955556 // buy
							if( ma25 > 29.1959 )
								if( ma85 <= 29.0765 )
									ret := -0.014925
								if( ma85 > 29.0765 )
									ret := 0.557047
						if( ma30 > 29.4729 )
							if( ma85 <= 29.2299 )
								if( ma80 <= 29.2288 )
									ret := -0.733333 // sell
								if( ma80 > 29.2288 )
									ret := -0.200000
							if( ma85 > 29.2299 )
								if( ma75 <= 29.336 )
									ret := 0.962963 // buy
								if( ma75 > 29.336 )
									ret := -0.062500
				if( ma80 > 29.4097 )
					if( ma45 <= 29.2666 )
						if( ma90 <= 29.6235 )
							if( ma25 <= 29.0068 )
								if( ma80 <= 29.4744 )
									ret := 0.857143 // buy
								if( ma80 > 29.4744 )
									ret := -0.076923
							if( ma25 > 29.0068 )
								if( ma55_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma55_colorInt > 3.5 )
									ret := 0.461538
						if( ma90 > 29.6235 )
							ret := 1.000000 // buy
					if( ma45 > 29.2666 )
						if( ma50 <= 29.5825 )
							if( ma40 <= 29.3506 )
								if( ma30 <= 29.2193 )
									ret := -0.203125
								if( ma30 > 29.2193 )
									ret := 0.714286 // buy
							if( ma40 > 29.3506 )
								if( ma10 <= 28.927 )
									ret := 0.416667
								if( ma10 > 28.927 )
									ret := -0.381356
						if( ma50 > 29.5825 )
							if( ma60_colorInt <= 1.5 )
								if( ma20 <= 29.8464 )
									ret := 0.769231 // buy
								if( ma20 > 29.8464 )
									ret := -0.555556
							if( ma60_colorInt > 1.5 )
								if( ma60 <= 29.6315 )
									ret := 0.705882 // buy
								if( ma60 > 29.6315 )
									ret := 1.000000 // buy
			if( ma80 > 29.5421 )
				if( ma60 <= 29.6199 )
					if( ma50 <= 29.5844 )
						if( ma90 <= 29.7018 )
							if( ma20 <= 29.151 )
								if( ma30 <= 29.0742 )
									ret := -0.777778 // sell
								if( ma30 > 29.0742 )
									ret := -1.000000 // sell
							if( ma20 > 29.151 )
								if( ma20 <= 29.1755 )
									ret := -0.153846
								if( ma20 > 29.1755 )
									ret := -0.900000 // sell
						if( ma90 > 29.7018 )
							if( ma60 <= 29.4085 )
								if( ma05 <= 27.7795 )
									ret := -0.500000
								if( ma05 > 27.7795 )
									ret := -1.000000 // sell
							if( ma60 > 29.4085 )
								if( ma10 <= 29.1042 )
									ret := 0.140000
								if( ma10 > 29.1042 )
									ret := -0.810811 // sell
					if( ma50 > 29.5844 )
						ret := 0.400000
				if( ma60 > 29.6199 )
					if( ma45_colorInt <= 1.5 )
						if( ma30 <= 30.2305 )
							if( ma55 <= 29.9186 )
								ret := -1.000000 // sell
							if( ma55 > 29.9186 )
								ret := -0.769231 // sell
						if( ma30 > 30.2305 )
							if( ma65 <= 52.1619 )
								if( ma40 <= 31.32 )
									ret := 0.200000
								if( ma40 > 31.32 )
									ret := 0.931624 // buy
							if( ma65 > 52.1619 )
								ret := 0.058824
					if( ma45_colorInt > 1.5 )
						if( ma10 <= 28.9797 )
							if( ma05_colorInt <= 3.5 )
								if( ma65 <= 30.1848 )
									ret := -0.239130
								if( ma65 > 30.1848 )
									ret := 0.666667
							if( ma05_colorInt > 3.5 )
								if( ma35 <= 29.3085 )
									ret := 0.588235
								if( ma35 > 29.3085 )
									ret := 1.000000 // buy
						if( ma10 > 28.9797 )
							if( ma45 <= 59.5053 )
								if( ma15 <= 54.2036 )
									ret := -0.062711
								if( ma15 > 54.2036 )
									ret := -0.514019
							if( ma45 > 59.5053 )
								if( ma85 <= 61.566 )
									ret := 0.590909
								if( ma85 > 61.566 )
									ret := -0.264151
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_GME_1Min_de176046(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


