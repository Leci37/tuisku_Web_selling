//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: AAVEUSDT_30Min_1MAD_26209cf7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_1MAD_26209cf7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_26209cf7(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma30 <= 400.721 )
		if( ma35 <= 84.5313 )
			if( ma35 <= 83.6825 )
				if( ma90 <= 50.7046 )
					if( ma05_colorInt <= 2.5 )
						if( ma20 <= 52.5657 )
							if( ma20_colorInt <= 1.5 )
								if( ma55 <= 36.8131 )
									ret := -0.077519
								if( ma55 > 36.8131 )
									ret := 0.285714
							if( ma20_colorInt > 1.5 )
								if( ma70 <= 40.2946 )
									ret := 0.364198
								if( ma70 > 40.2946 )
									ret := 0.960784 // buy
						if( ma20 > 52.5657 )
							if( ma60 <= 51.6929 )
								if( ma05 <= 54.2749 )
									ret := -0.900000 // sell
								if( ma05 > 54.2749 )
									ret := -1.000000 // sell
							if( ma60 > 51.6929 )
								if( ma70 <= 51.4435 )
									ret := -0.200000
								if( ma70 > 51.4435 )
									ret := -0.875000 // sell
					if( ma05_colorInt > 2.5 )
						if( ma15 <= 40.89 )
							if( ma65 <= 40.7544 )
								if( ma45 <= 34.6486 )
									ret := -0.067308
								if( ma45 > 34.6486 )
									ret := -0.365385
							if( ma65 > 40.7544 )
								if( ma05 <= 40.1157 )
									ret := 0.886364 // buy
								if( ma05 > 40.1157 )
									ret := 0.014493
						if( ma15 > 40.89 )
							if( ma75 <= 48.9557 )
								if( ma05 <= 46.3782 )
									ret := -0.573427
								if( ma05 > 46.3782 )
									ret := -0.979592 // sell
							if( ma75 > 48.9557 )
								if( ma05 <= 48.6643 )
									ret := 0.190476
								if( ma05 > 48.6643 )
									ret := -1.000000 // sell
				if( ma90 > 50.7046 )
					if( ma90 <= 52.8396 )
						if( ma05 <= 55.4119 )
							if( ma65_colorInt <= 1.5 )
								if( ma30 <= 51.6164 )
									ret := -0.360656
								if( ma30 > 51.6164 )
									ret := 0.120690
							if( ma65_colorInt > 1.5 )
								if( ma05 <= 49.5732 )
									ret := 0.903226 // buy
								if( ma05 > 49.5732 )
									ret := 0.296512
						if( ma05 > 55.4119 )
							ret := 1.000000 // buy
					if( ma90 > 52.8396 )
						if( ma15 <= 81.9581 )
							if( ma85 <= 80.6391 )
								if( ma05 <= 78.9283 )
									ret := 0.048401
								if( ma05 > 78.9283 )
									ret := -0.146148
							if( ma85 > 80.6391 )
								if( ma70 <= 82.9996 )
									ret := 0.326369
								if( ma70 > 82.9996 )
									ret := -0.099274
						if( ma15 > 81.9581 )
							if( ma100 <= 81.9081 )
								if( ma35 <= 80.1984 )
									ret := 0.692308
								if( ma35 > 80.1984 )
									ret := -0.318903
							if( ma100 > 81.9081 )
								if( ma55 <= 84.125 )
									ret := 0.037872
								if( ma55 > 84.125 )
									ret := -0.560000
			if( ma35 > 83.6825 )
				if( ma55 <= 84.5119 )
					if( ma35 <= 84.4703 )
						if( ma70 <= 83.4548 )
							if( ma80 <= 82.4719 )
								if( ma55 <= 82.893 )
									ret := 0.142857
								if( ma55 > 82.893 )
									ret := -0.500000
							if( ma80 > 82.4719 )
								if( ma15 <= 84.6946 )
									ret := 0.437500
								if( ma15 > 84.6946 )
									ret := 0.781818 // buy
						if( ma70 > 83.4548 )
							if( ma90 <= 83.6841 )
								if( ma05 <= 83.4117 )
									ret := 0.433333
								if( ma05 > 83.4117 )
									ret := -0.362319
							if( ma90 > 83.6841 )
								if( ma35 <= 84.196 )
									ret := 0.496552
								if( ma35 > 84.196 )
									ret := 0.192547
					if( ma35 > 84.4703 )
						if( ma85 <= 83.4628 )
							ret := 0.352941
						if( ma85 > 83.4628 )
							if( ma70 <= 84.1379 )
								if( ma60 <= 84.1425 )
									ret := -0.800000 // sell
								if( ma60 > 84.1425 )
									ret := -1.000000 // sell
							if( ma70 > 84.1379 )
								ret := -0.454545
				if( ma55 > 84.5119 )
					if( ma35 <= 84.4316 )
						if( ma80 <= 84.913 )
							if( ma65 <= 84.6291 )
								if( ma20_colorInt <= 3.5 )
									ret := 0.416667
								if( ma20_colorInt > 3.5 )
									ret := 0.625000
							if( ma65 > 84.6291 )
								if( ma35 <= 84.377 )
									ret := 0.987342 // buy
								if( ma35 > 84.377 )
									ret := 0.750000 // buy
						if( ma80 > 84.913 )
							if( ma60 <= 84.7928 )
								if( ma90 <= 85.3125 )
									ret := -0.310345
								if( ma90 > 85.3125 )
									ret := 0.777778 // buy
							if( ma60 > 84.7928 )
								if( ma75 <= 85.0615 )
									ret := 0.230769
								if( ma75 > 85.0615 )
									ret := 0.813765 // buy
					if( ma35 > 84.4316 )
						if( ma10 <= 83.7643 )
							if( ma85 <= 85.2249 )
								if( ma25 <= 84.062 )
									ret := 0.800000 // buy
								if( ma25 > 84.062 )
									ret := 1.000000 // buy
							if( ma85 > 85.2249 )
								if( ma90 <= 86.4281 )
									ret := 0.153846
								if( ma90 > 86.4281 )
									ret := 0.846154 // buy
						if( ma10 > 83.7643 )
							if( ma35 <= 84.4712 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.166667
								if( ma05_colorInt > 3.5 )
									ret := -0.687500
							if( ma35 > 84.4712 )
								if( ma100 <= 85.7156 )
									ret := -0.142857
								if( ma100 > 85.7156 )
									ret := 0.588235
		if( ma35 > 84.5313 )
			if( ma15 <= 83.3192 )
				if( ma35 <= 85.9635 )
					if( ma85 <= 86.8321 )
						ret := 0.700000 // buy
					if( ma85 > 86.8321 )
						if( ma90 <= 87.3916 )
							ret := 0.000000
						if( ma90 > 87.3916 )
							ret := -0.384615
				if( ma35 > 85.9635 )
					if( ma90 <= 97.3793 )
						ret := 1.000000 // buy
					if( ma90 > 97.3793 )
						ret := 0.500000
			if( ma15 > 83.3192 )
				if( ma30 <= 85.5845 )
					if( ma80 <= 85.4198 )
						if( ma05 <= 83.8329 )
							if( ma15 <= 83.8762 )
								ret := 0.363636
							if( ma15 > 83.8762 )
								if( ma85 <= 85.3238 )
									ret := 0.796610 // buy
								if( ma85 > 85.3238 )
									ret := 0.400000
						if( ma05 > 83.8329 )
							if( ma15_colorInt <= 1.5 )
								if( ma65 <= 84.2119 )
									ret := -0.673469
								if( ma65 > 84.2119 )
									ret := -0.094737
							if( ma15_colorInt > 1.5 )
								if( ma75 <= 82.1861 )
									ret := 0.722222 // buy
								if( ma75 > 82.1861 )
									ret := 0.022333
					if( ma80 > 85.4198 )
						if( ma10 <= 83.6615 )
							if( ma05 <= 82.8244 )
								if( ma35 <= 85.7158 )
									ret := -0.242424
								if( ma35 > 85.7158 )
									ret := -0.750000 // sell
							if( ma05 > 82.8244 )
								if( ma45 <= 85.1541 )
									ret := 0.692308
								if( ma45 > 85.1541 )
									ret := -0.048780
						if( ma10 > 83.6615 )
							if( ma35_colorInt <= 3.5 )
								if( ma85_colorInt <= 2.5 )
									ret := -0.340206
								if( ma85_colorInt > 2.5 )
									ret := -0.630252
							if( ma35_colorInt > 3.5 )
								if( ma25 <= 84.5862 )
									ret := 0.285714
								if( ma25 > 84.5862 )
									ret := -0.425743
				if( ma30 > 85.5845 )
					if( ma45 <= 391.395 )
						if( ma80 <= 374.203 )
							if( ma45 <= 200.676 )
								if( ma80 <= 195.352 )
									ret := -0.022294
								if( ma80 > 195.352 )
									ret := -0.617834
							if( ma45 > 200.676 )
								if( ma75 <= 205.89 )
									ret := 0.710611 // buy
								if( ma75 > 205.89 )
									ret := 0.026798
						if( ma80 > 374.203 )
							if( ma10_colorInt <= 1.5 )
								if( ma20 <= 395.066 )
									ret := 0.196126
								if( ma20 > 395.066 )
									ret := -0.698630
							if( ma10_colorInt > 1.5 )
								if( ma65 <= 374.216 )
									ret := -0.744048 // sell
								if( ma65 > 374.216 )
									ret := -0.177991
					if( ma45 > 391.395 )
						if( ma05 <= 402.401 )
							if( ma70 <= 400.228 )
								if( ma60_colorInt <= 2.5 )
									ret := 0.250497
								if( ma60_colorInt > 2.5 )
									ret := 0.683938
							if( ma70 > 400.228 )
								if( ma05 <= 367.885 )
									ret := 0.589041
								if( ma05 > 367.885 )
									ret := -0.366864
						if( ma05 > 402.401 )
							if( ma15 <= 403.269 )
								if( ma30 <= 395.349 )
									ret := -0.933333 // sell
								if( ma30 > 395.349 )
									ret := -0.298507
							if( ma15 > 403.269 )
								if( ma10 <= 406.299 )
									ret := 0.826087 // buy
								if( ma10 > 406.299 )
									ret := -0.322581
	if( ma30 > 400.721 )
		if( ma80 <= 601.334 )
			if( ma70_colorInt <= 1.5 )
				if( ma80 <= 394 )
					if( ma70 <= 392.97 )
						if( ma90 <= 386.602 )
							if( ma70 <= 377.034 )
								ret := 1.000000 // buy
							if( ma70 > 377.034 )
								ret := 0.700000 // buy
						if( ma90 > 386.602 )
							if( ma10 <= 407.927 )
								ret := -0.500000
							if( ma10 > 407.927 )
								ret := -1.000000 // sell
					if( ma70 > 392.97 )
						if( ma35_colorInt <= 1.5 )
							if( ma25 <= 403.393 )
								if( ma100 <= 389.946 )
									ret := 1.000000 // buy
								if( ma100 > 389.946 )
									ret := 0.888889 // buy
							if( ma25 > 403.393 )
								if( ma30 <= 405.573 )
									ret := -0.133333
								if( ma30 > 405.573 )
									ret := 0.909091 // buy
						if( ma35_colorInt > 1.5 )
							ret := 1.000000 // buy
				if( ma80 > 394 )
					if( ma55 <= 400.696 )
						if( ma25 <= 401.467 )
							ret := -0.437500
						if( ma25 > 401.467 )
							if( ma05_colorInt <= 1.5 )
								if( ma85 <= 396.093 )
									ret := -0.882353 // sell
								if( ma85 > 396.093 )
									ret := -1.000000 // sell
							if( ma05_colorInt > 1.5 )
								if( ma40 <= 403.566 )
									ret := -0.150000
								if( ma40 > 403.566 )
									ret := -0.928571 // sell
					if( ma55 > 400.696 )
						if( ma45 <= 457.46 )
							if( ma70 <= 402.149 )
								if( ma60 <= 402.229 )
									ret := -0.125000
								if( ma60 > 402.229 )
									ret := 0.711864 // buy
							if( ma70 > 402.149 )
								if( ma30 <= 457.073 )
									ret := -0.345511
								if( ma30 > 457.073 )
									ret := -0.835294 // sell
						if( ma45 > 457.46 )
							if( ma100 <= 493.744 )
								if( ma80 <= 488.138 )
									ret := -0.123267
								if( ma80 > 488.138 )
									ret := 0.660194
							if( ma100 > 493.744 )
								if( ma30 <= 534.348 )
									ret := -0.484615
								if( ma30 > 534.348 )
									ret := -0.081159
			if( ma70_colorInt > 1.5 )
				if( ma25 <= 407.622 )
					if( ma75 <= 423.349 )
						if( ma60 <= 415.448 )
							if( ma70 <= 404.856 )
								if( ma55 <= 402.352 )
									ret := -0.208333
								if( ma55 > 402.352 )
									ret := -0.859375 // sell
							if( ma70 > 404.856 )
								if( ma75 <= 406.876 )
									ret := 0.063291
								if( ma75 > 406.876 )
									ret := -0.526786
						if( ma60 > 415.448 )
							if( ma15 <= 403.031 )
								ret := -0.550000
							if( ma15 > 403.031 )
								ret := -1.000000 // sell
					if( ma75 > 423.349 )
						ret := 0.937500 // buy
				if( ma25 > 407.622 )
					if( ma05 <= 548.276 )
						if( ma30 <= 424.24 )
							if( ma35 <= 421.899 )
								if( ma75 <= 425.217 )
									ret := 0.284946
								if( ma75 > 425.217 )
									ret := -0.818182 // sell
							if( ma35 > 421.899 )
								if( ma50 <= 432.222 )
									ret := 0.873418 // buy
								if( ma50 > 432.222 )
									ret := 0.250000
						if( ma30 > 424.24 )
							if( ma50_colorInt <= 2.5 )
								if( ma90 <= 453.513 )
									ret := -0.143646
								if( ma90 > 453.513 )
									ret := 0.461538
							if( ma50_colorInt > 2.5 )
								if( ma90 <= 457.418 )
									ret := 0.092926
								if( ma90 > 457.418 )
									ret := -0.245844
					if( ma05 > 548.276 )
						if( ma80 <= 533.329 )
							ret := -0.130435
						if( ma80 > 533.329 )
							if( ma25 <= 569.026 )
								ret := -1.000000 // sell
							if( ma25 > 569.026 )
								if( ma30 <= 574.941 )
									ret := -0.500000
								if( ma30 > 574.941 )
									ret := -0.800000 // sell
		if( ma80 > 601.334 )
			if( ma45_colorInt <= 1.5 )
				if( ma30 <= 634.889 )
					ret := -1.000000 // sell
				if( ma30 > 634.889 )
					ret := -0.857143 // sell
			if( ma45_colorInt > 1.5 )
				if( ma50 <= 612.104 )
					ret := -1.000000 // sell
				if( ma50 > 612.104 )
					ret := -0.357143
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_26209cf7(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)

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


