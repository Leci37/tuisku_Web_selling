//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: AAVEUSDT_15Min_1MAD_2e110d39 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_15Min_1MAD_2e110d39", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_15Min_2e110d39(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma70 <= 84.669 )
		if( ma20 <= 48.1026 )
			if( ma70 <= 49.0826 )
				ret := 1.000000 // buy
			if( ma70 > 49.0826 )
				ret := 0.842105 // buy
		if( ma20 > 48.1026 )
			if( ma50 <= 83.4895 )
				if( ma70 <= 54.9988 )
					if( ma100 <= 55.1696 )
						if( ma15 <= 55.3333 )
							if( ma35 <= 49.534 )
								if( ma15_colorInt <= 3.5 )
									ret := -0.918919 // sell
								if( ma15_colorInt > 3.5 )
									ret := -0.266667
							if( ma35 > 49.534 )
								if( ma20 <= 49.9952 )
									ret := 0.695652
								if( ma20 > 49.9952 )
									ret := 0.106075
						if( ma15 > 55.3333 )
							if( ma20 <= 57.2537 )
								if( ma60_colorInt <= 3 )
									ret := 0.666667
								if( ma60_colorInt > 3 )
									ret := 0.906977 // buy
							if( ma20 > 57.2537 )
								ret := 0.100000
					if( ma100 > 55.1696 )
						if( ma50 <= 54.5535 )
							if( ma85 <= 54.9405 )
								ret := -0.785714 // sell
							if( ma85 > 54.9405 )
								ret := -1.000000 // sell
						if( ma50 > 54.5535 )
							ret := -0.250000
				if( ma70 > 54.9988 )
					if( ma10 <= 54.5572 )
						if( ma80 <= 55.5654 )
							if( ma75 <= 55.3873 )
								if( ma05 <= 54.4004 )
									ret := -0.187500
								if( ma05 > 54.4004 )
									ret := -0.785714 // sell
							if( ma75 > 55.3873 )
								ret := 0.285714
						if( ma80 > 55.5654 )
							if( ma35 <= 56.233 )
								if( ma40 <= 55.269 )
									ret := 0.891089 // buy
								if( ma40 > 55.269 )
									ret := 0.680851
							if( ma35 > 56.233 )
								ret := 0.125000
					if( ma10 > 54.5572 )
						if( ma100 <= 55.7719 )
							if( ma90 <= 55.5759 )
								if( ma25 <= 55.0489 )
									ret := -0.274194
								if( ma25 > 55.0489 )
									ret := -0.005556
							if( ma90 > 55.5759 )
								if( ma05 <= 56.4566 )
									ret := -0.271739
								if( ma05 > 56.4566 )
									ret := -0.702703 // sell
						if( ma100 > 55.7719 )
							if( ma60 <= 83.0412 )
								if( ma100 <= 78.4919 )
									ret := 0.004965
								if( ma100 > 78.4919 )
									ret := 0.084863
							if( ma60 > 83.0412 )
								if( ma05 <= 83.0924 )
									ret := 0.046205
								if( ma05 > 83.0924 )
									ret := -0.355102
			if( ma50 > 83.4895 )
				if( ma25 <= 83.5169 )
					if( ma35 <= 83.5938 )
						if( ma65_colorInt <= 3.5 )
							if( ma90 <= 84.7974 )
								if( ma85 <= 83.9262 )
									ret := 0.186441
								if( ma85 > 83.9262 )
									ret := 0.619048
							if( ma90 > 84.7974 )
								if( ma05 <= 82.5686 )
									ret := -0.589744
								if( ma05 > 82.5686 )
									ret := 0.190476
						if( ma65_colorInt > 3.5 )
							if( ma85_colorInt <= 3.5 )
								ret := -0.318182
							if( ma85_colorInt > 3.5 )
								ret := 0.000000
					if( ma35 > 83.5938 )
						if( ma90 <= 84.2988 )
							if( ma70 <= 84.0261 )
								ret := 0.142857
							if( ma70 > 84.0261 )
								ret := 0.444444
						if( ma90 > 84.2988 )
							if( ma85 <= 84.8261 )
								if( ma15 <= 82.8434 )
									ret := 0.809524 // buy
								if( ma15 > 82.8434 )
									ret := 0.944444 // buy
							if( ma85 > 84.8261 )
								ret := 0.461538
				if( ma25 > 83.5169 )
					if( ma75 <= 83.7906 )
						if( ma70 <= 83.3173 )
							if( ma100 <= 82.9506 )
								if( ma25 <= 86.8144 )
									ret := 0.336957
								if( ma25 > 86.8144 )
									ret := -0.954545 // sell
							if( ma100 > 82.9506 )
								if( ma70 <= 83.2793 )
									ret := -0.888889 // sell
								if( ma70 > 83.2793 )
									ret := -1.000000 // sell
						if( ma70 > 83.3173 )
							if( ma20 <= 83.6188 )
								ret := -0.250000
							if( ma20 > 83.6188 )
								if( ma05 <= 84.4211 )
									ret := 0.684524
								if( ma05 > 84.4211 )
									ret := 0.337838
					if( ma75 > 83.7906 )
						if( ma05 <= 83.2286 )
							if( ma75 <= 84.1559 )
								if( ma90_colorInt <= 2.5 )
									ret := -0.964286 // sell
								if( ma90_colorInt > 2.5 )
									ret := 0.000000
							if( ma75 > 84.1559 )
								if( ma45 <= 83.9114 )
									ret := 0.937500 // buy
								if( ma45 > 83.9114 )
									ret := 0.521739
						if( ma05 > 83.2286 )
							if( ma55 <= 83.9254 )
								if( ma100 <= 84.0455 )
									ret := -0.710000 // sell
								if( ma100 > 84.0455 )
									ret := 0.126126
							if( ma55 > 83.9254 )
								if( ma70 <= 84.2566 )
									ret := 0.302508
								if( ma70 > 84.2566 )
									ret := -0.015987
	if( ma70 > 84.669 )
		if( ma100 <= 168.607 )
			if( ma20 <= 86.3128 )
				if( ma10 <= 82.2658 )
					if( ma75 <= 90.4725 )
						if( ma80 <= 87.679 )
							if( ma45 <= 83.4623 )
								ret := -0.333333
							if( ma45 > 83.4623 )
								if( ma45 <= 83.9071 )
									ret := 0.846154 // buy
								if( ma45 > 83.9071 )
									ret := 0.368421
						if( ma80 > 87.679 )
							if( ma20 <= 81.4818 )
								if( ma25 <= 81.44 )
									ret := -0.818182 // sell
								if( ma25 > 81.44 )
									ret := 0.735294 // buy
							if( ma20 > 81.4818 )
								if( ma05 <= 81.1645 )
									ret := -0.176471
								if( ma05 > 81.1645 )
									ret := -1.000000 // sell
					if( ma75 > 90.4725 )
						if( ma10 <= 80.8131 )
							ret := 1.000000 // buy
						if( ma10 > 80.8131 )
							ret := 0.882353 // buy
				if( ma10 > 82.2658 )
					if( ma80 <= 88.7195 )
						if( ma100 <= 88.6902 )
							if( ma60 <= 84.5934 )
								if( ma15 <= 82.7274 )
									ret := 0.230769
								if( ma15 > 82.7274 )
									ret := -0.728814 // sell
							if( ma60 > 84.5934 )
								if( ma100 <= 84.6391 )
									ret := -0.557312
								if( ma100 > 84.6391 )
									ret := -0.103976
						if( ma100 > 88.6902 )
							if( ma75 <= 87.9295 )
								if( ma75 <= 87.6091 )
									ret := 1.000000 // buy
								if( ma75 > 87.6091 )
									ret := 0.800000 // buy
							if( ma75 > 87.9295 )
								if( ma20 <= 85.9625 )
									ret := 0.612245
								if( ma20 > 85.9625 )
									ret := -0.785714 // sell
					if( ma80 > 88.7195 )
						if( ma35 <= 87.191 )
							if( ma100 <= 89.6656 )
								ret := -0.700000 // sell
							if( ma100 > 89.6656 )
								if( ma85 <= 93.0134 )
									ret := -1.000000 // sell
								if( ma85 > 93.0134 )
									ret := -0.933333 // sell
						if( ma35 > 87.191 )
							ret := -0.133333
			if( ma20 > 86.3128 )
				if( ma35 <= 87.3235 )
					if( ma30_colorInt <= 1.5 )
						if( ma30 <= 87.0458 )
							if( ma05_colorInt <= 1.5 )
								if( ma30 <= 85.8978 )
									ret := -1.000000 // sell
								if( ma30 > 85.8978 )
									ret := -0.202465
							if( ma05_colorInt > 1.5 )
								if( ma80 <= 85.9528 )
									ret := 0.500000
								if( ma80 > 85.9528 )
									ret := -0.161765
						if( ma30 > 87.0458 )
							if( ma100 <= 86.621 )
								if( ma65 <= 86.6111 )
									ret := 0.130178
								if( ma65 > 86.6111 )
									ret := 0.750000 // buy
							if( ma100 > 86.621 )
								if( ma45 <= 87.0156 )
									ret := -0.809524 // sell
								if( ma45 > 87.0156 )
									ret := -0.154639
					if( ma30_colorInt > 1.5 )
						if( ma100 <= 86.117 )
							if( ma85 <= 84.3294 )
								ret := -0.812500 // sell
							if( ma85 > 84.3294 )
								if( ma45_colorInt <= 1.5 )
									ret := 0.274194
								if( ma45_colorInt > 1.5 )
									ret := 0.695402
						if( ma100 > 86.117 )
							if( ma10_colorInt <= 3.5 )
								if( ma05 <= 85.4714 )
									ret := -0.500000
								if( ma05 > 85.4714 )
									ret := 0.107087
							if( ma10_colorInt > 3.5 )
								if( ma15_colorInt <= 3.5 )
									ret := -0.352941
								if( ma15_colorInt > 3.5 )
									ret := 0.473684
				if( ma35 > 87.3235 )
					if( ma70 <= 87.9577 )
						if( ma65 <= 86.0958 )
							if( ma85 <= 84.2956 )
								ret := -0.285714
							if( ma85 > 84.2956 )
								if( ma70 <= 85.4273 )
									ret := 1.000000 // buy
								if( ma70 > 85.4273 )
									ret := 0.875000 // buy
						if( ma65 > 86.0958 )
							if( ma20 <= 88.2623 )
								if( ma05 <= 89.2299 )
									ret := -0.205832
								if( ma05 > 89.2299 )
									ret := 1.000000 // buy
							if( ma20 > 88.2623 )
								if( ma70 <= 87.6744 )
									ret := -0.527344
								if( ma70 > 87.6744 )
									ret := -0.186916
					if( ma70 > 87.9577 )
						if( ma80 <= 88.2733 )
							if( ma85 <= 87.7446 )
								if( ma75 <= 87.8248 )
									ret := 0.714286 // buy
								if( ma75 > 87.8248 )
									ret := -0.476923
							if( ma85 > 87.7446 )
								if( ma50 <= 87.7363 )
									ret := -1.000000 // sell
								if( ma50 > 87.7363 )
									ret := 0.326301
						if( ma80 > 88.2733 )
							if( ma45 <= 88.3452 )
								if( ma60 <= 88.1829 )
									ret := 0.083333
								if( ma60 > 88.1829 )
									ret := -0.413442
							if( ma45 > 88.3452 )
								if( ma20_colorInt <= 3.5 )
									ret := -0.000187
								if( ma20_colorInt > 3.5 )
									ret := -0.069225
		if( ma100 > 168.607 )
			if( ma10 <= 167.81 )
				if( ma40 <= 167.554 )
					ret := -0.833333 // sell
				if( ma40 > 167.554 )
					if( ma80 <= 170.482 )
						if( ma70 <= 169.021 )
							ret := 0.583333
						if( ma70 > 169.021 )
							ret := 0.133333
					if( ma80 > 170.482 )
						ret := 1.000000 // buy
			if( ma10 > 167.81 )
				if( ma05 <= 167.574 )
					ret := 0.272727
				if( ma05 > 167.574 )
					if( ma45_colorInt <= 1.5 )
						if( ma80 <= 171.181 )
							if( ma55 <= 170.708 )
								if( ma25 <= 170.172 )
									ret := -0.733333 // sell
								if( ma25 > 170.172 )
									ret := -0.846154 // sell
							if( ma55 > 170.708 )
								if( ma60 <= 171.366 )
									ret := 0.875000 // buy
								if( ma60 > 171.366 )
									ret := 0.000000
						if( ma80 > 171.181 )
							if( ma40 <= 173.193 )
								ret := -0.625000
							if( ma40 > 173.193 )
								ret := -1.000000 // sell
					if( ma45_colorInt > 1.5 )
						if( ma70 <= 169.876 )
							ret := -1.000000 // sell
						if( ma70 > 169.876 )
							if( ma25 <= 171.621 )
								if( ma20_colorInt <= 3.5 )
									ret := -0.187500
								if( ma20_colorInt > 3.5 )
									ret := -0.909091 // sell
							if( ma25 > 171.621 )
								if( ma50 <= 173.037 )
									ret := -1.000000 // sell
								if( ma50 > 173.037 )
									ret := -0.647059
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_AAVEUSDT_15Min_2e110d39(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)

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


