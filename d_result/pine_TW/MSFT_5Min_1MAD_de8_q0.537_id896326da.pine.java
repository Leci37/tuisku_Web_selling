//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: MSFT_5Min_1MAD_896326da Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_1MAD_896326da", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_896326da(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma30_colorInt <= 1.5 )
		if( ma65 <= 284.551 )
			if( ma65 <= 281.216 )
				if( ma50 <= 279.617 )
					ret := 1.000000 // buy
				if( ma50 > 279.617 )
					ret := -0.062500
			if( ma65 > 281.216 )
				if( ma100 <= 282.656 )
					ret := 1.000000 // buy
				if( ma100 > 282.656 )
					ret := 0.700000 // buy
		if( ma65 > 284.551 )
			if( ma25 <= 309.45 )
				if( ma10 <= 307.005 )
					if( ma20 <= 296.552 )
						if( ma45 <= 286.453 )
							if( ma30 <= 284.907 )
								ret := -0.100000
							if( ma30 > 284.907 )
								ret := -1.000000 // sell
						if( ma45 > 286.453 )
							if( ma50 <= 296.044 )
								if( ma35 <= 295.851 )
									ret := 0.384615
								if( ma35 > 295.851 )
									ret := 1.000000 // buy
							if( ma50 > 296.044 )
								ret := 0.000000
					if( ma20 > 296.552 )
						if( ma100 <= 296.079 )
							if( ma20 <= 297.079 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.653846
								if( ma05_colorInt > 1.5 )
									ret := 0.680000
							if( ma20 > 297.079 )
								if( ma40 <= 294.657 )
									ret := -0.307692
								if( ma40 > 294.657 )
									ret := -0.982456 // sell
						if( ma100 > 296.079 )
							if( ma60 <= 303.596 )
								if( ma80 <= 296.854 )
									ret := 0.960000 // buy
								if( ma80 > 296.854 )
									ret := 0.400000
							if( ma60 > 303.596 )
								if( ma100 <= 303.585 )
									ret := -0.549020
								if( ma100 > 303.585 )
									ret := 0.059490
				if( ma10 > 307.005 )
					if( ma10 <= 308.61 )
						if( ma15 <= 307.472 )
							if( ma60 <= 306.799 )
								if( ma30 <= 306.903 )
									ret := -0.784173 // sell
								if( ma30 > 306.903 )
									ret := -0.338983
							if( ma60 > 306.799 )
								ret := 0.066667
						if( ma15 > 307.472 )
							if( ma85_colorInt <= 3.5 )
								if( ma100 <= 306.86 )
									ret := -1.000000 // sell
								if( ma100 > 306.86 )
									ret := -0.960000 // sell
							if( ma85_colorInt > 3.5 )
								if( ma35 <= 307.807 )
									ret := 0.000000
								if( ma35 > 307.807 )
									ret := -1.000000 // sell
					if( ma10 > 308.61 )
						if( ma05 <= 309.171 )
							if( ma100 <= 307.685 )
								if( ma50 <= 307.614 )
									ret := 0.000000
								if( ma50 > 307.614 )
									ret := 0.794872 // buy
							if( ma100 > 307.685 )
								ret := -0.230769
						if( ma05 > 309.171 )
							if( ma90 <= 309.055 )
								if( ma50 <= 309.109 )
									ret := -0.273973
								if( ma50 > 309.109 )
									ret := -0.944444 // sell
							if( ma90 > 309.055 )
								ret := 0.000000
			if( ma25 > 309.45 )
				if( ma85 <= 308.543 )
					if( ma25 <= 309.587 )
						if( ma90 <= 308.226 )
							ret := 1.000000 // buy
						if( ma90 > 308.226 )
							ret := 0.750000 // buy
					if( ma25 > 309.587 )
						ret := 1.000000 // buy
				if( ma85 > 308.543 )
					if( ma30 <= 415.337 )
						if( ma75 <= 414.463 )
							if( ma50 <= 393.381 )
								if( ma80 <= 389.992 )
									ret := -0.027679
								if( ma80 > 389.992 )
									ret := -0.455738
							if( ma50 > 393.381 )
								if( ma35 <= 396.554 )
									ret := 0.725490 // buy
								if( ma35 > 396.554 )
									ret := 0.017782
						if( ma75 > 414.463 )
							if( ma10 <= 415.781 )
								if( ma90 <= 414.303 )
									ret := -0.333333
								if( ma90 > 414.303 )
									ret := 0.743119 // buy
							if( ma10 > 415.781 )
								ret := -0.166667
					if( ma30 > 415.337 )
						if( ma35 <= 415.628 )
							if( ma50 <= 414.026 )
								if( ma35 <= 415.308 )
									ret := -0.846154 // sell
								if( ma35 > 415.308 )
									ret := -1.000000 // sell
							if( ma50 > 414.026 )
								if( ma05_colorInt <= 1.5 )
									ret := -0.517483
								if( ma05_colorInt > 1.5 )
									ret := -0.072727
						if( ma35 > 415.628 )
							if( ma25 <= 415.674 )
								ret := 0.933333 // buy
							if( ma25 > 415.674 )
								if( ma80 <= 415.365 )
									ret := 0.236559
								if( ma80 > 415.365 )
									ret := -0.064960
	if( ma30_colorInt > 1.5 )
		if( ma55_colorInt <= 3.5 )
			if( ma50 <= 462.853 )
				if( ma05 <= 441.724 )
					if( ma70 <= 440.26 )
						if( ma05 <= 437.422 )
							if( ma75 <= 437.22 )
								if( ma45 <= 432.15 )
									ret := 0.028811
								if( ma45 > 432.15 )
									ret := 0.273087
							if( ma75 > 437.22 )
								if( ma65 <= 439.396 )
									ret := -0.545455
								if( ma65 > 439.396 )
									ret := 0.875000 // buy
						if( ma05 > 437.422 )
							if( ma05_colorInt <= 1.5 )
								ret := -0.352941
							if( ma05_colorInt > 1.5 )
								if( ma100 <= 437.993 )
									ret := 0.916667 // buy
								if( ma100 > 437.993 )
									ret := 0.435897
					if( ma70 > 440.26 )
						if( ma25 <= 440.802 )
							if( ma80 <= 440.269 )
								ret := -0.235294
							if( ma80 > 440.269 )
								if( ma20 <= 440.434 )
									ret := -0.816000 // sell
								if( ma20 > 440.434 )
									ret := -0.384615
						if( ma25 > 440.802 )
							if( ma75 <= 443.776 )
								if( ma50 <= 442.43 )
									ret := -0.126984
								if( ma50 > 442.43 )
									ret := 0.580000
							if( ma75 > 443.776 )
								if( ma60 <= 443.758 )
									ret := -1.000000 // sell
								if( ma60 > 443.758 )
									ret := -0.857143 // sell
				if( ma05 > 441.724 )
					if( ma10 <= 460.149 )
						if( ma50 <= 441.54 )
							ret := -1.000000 // sell
						if( ma50 > 441.54 )
							if( ma65 <= 442.559 )
								if( ma45 <= 442.208 )
									ret := 0.350000
								if( ma45 > 442.208 )
									ret := 0.955556 // buy
							if( ma65 > 442.559 )
								if( ma40_colorInt <= 2.5 )
									ret := 0.067909
								if( ma40_colorInt > 2.5 )
									ret := 0.253112
					if( ma10 > 460.149 )
						if( ma10 <= 461.026 )
							if( ma25 <= 460.25 )
								ret := 0.571429
							if( ma25 > 460.25 )
								if( ma10_colorInt <= 2.5 )
									ret := 0.846154 // buy
								if( ma10_colorInt > 2.5 )
									ret := 0.962963 // buy
						if( ma10 > 461.026 )
							if( ma45 <= 461.091 )
								ret := 0.333333
							if( ma45 > 461.091 )
								ret := -0.777778 // sell
			if( ma50 > 462.853 )
				if( ma50 <= 465.573 )
					if( ma70 <= 465.382 )
						if( ma20 <= 463.292 )
							if( ma10 <= 460.283 )
								ret := -1.000000 // sell
							if( ma10 > 460.283 )
								if( ma25 <= 462.759 )
									ret := -0.363636
								if( ma25 > 462.759 )
									ret := -0.833333 // sell
						if( ma20 > 463.292 )
							ret := -1.000000 // sell
					if( ma70 > 465.382 )
						ret := -0.615385
				if( ma50 > 465.573 )
					if( ma05 <= 465.847 )
						if( ma25 <= 466.14 )
							if( ma70 <= 465.512 )
								ret := -0.166667
							if( ma70 > 465.512 )
								if( ma55 <= 465.788 )
									ret := 0.400000
								if( ma55 > 465.788 )
									ret := -0.071429
						if( ma25 > 466.14 )
							ret := 0.500000
					if( ma05 > 465.847 )
						if( ma25_colorInt <= 1.5 )
							ret := -1.000000 // sell
						if( ma25_colorInt > 1.5 )
							if( ma30 <= 467.096 )
								if( ma100 <= 466.756 )
									ret := -0.500000
								if( ma100 > 466.756 )
									ret := -0.833333 // sell
							if( ma30 > 467.096 )
								if( ma90 <= 467.496 )
									ret := 0.142857
								if( ma90 > 467.496 )
									ret := -0.700000 // sell
		if( ma55_colorInt > 3.5 )
			if( ma20 <= 427.406 )
				if( ma75 <= 427.073 )
					if( ma30 <= 345.289 )
						if( ma90 <= 338.385 )
							if( ma70 <= 281.543 )
								if( ma35 <= 280.409 )
									ret := -1.000000 // sell
								if( ma35 > 280.409 )
									ret := -0.666667
							if( ma70 > 281.543 )
								if( ma30 <= 314.249 )
									ret := 0.081395
								if( ma30 > 314.249 )
									ret := -0.152842
						if( ma90 > 338.385 )
							if( ma90 <= 341.544 )
								if( ma100 <= 340.495 )
									ret := -0.512195
								if( ma100 > 340.495 )
									ret := -0.962963 // sell
							if( ma90 > 341.544 )
								if( ma70 <= 345.187 )
									ret := 0.112500
								if( ma70 > 345.187 )
									ret := -0.784314 // sell
					if( ma30 > 345.289 )
						if( ma45 <= 403.345 )
							if( ma35 <= 390.611 )
								if( ma15 <= 372.54 )
									ret := 0.248696
								if( ma15 > 372.54 )
									ret := -0.151515
							if( ma35 > 390.611 )
								if( ma70 <= 396.331 )
									ret := 0.721893 // buy
								if( ma70 > 396.331 )
									ret := 0.134658
						if( ma45 > 403.345 )
							if( ma20 <= 418.954 )
								if( ma25 <= 417.354 )
									ret := -0.109063
								if( ma25 > 417.354 )
									ret := -0.662500
							if( ma20 > 418.954 )
								if( ma80 <= 421.774 )
									ret := 0.244957
								if( ma80 > 421.774 )
									ret := -0.243243
				if( ma75 > 427.073 )
					if( ma75 <= 427.276 )
						if( ma05 <= 427.004 )
							ret := 0.333333
						if( ma05 > 427.004 )
							ret := 1.000000 // buy
					if( ma75 > 427.276 )
						if( ma40 <= 427.107 )
							ret := 0.000000
						if( ma40 > 427.107 )
							if( ma25 <= 427.17 )
								ret := 1.000000 // buy
							if( ma25 > 427.17 )
								ret := 0.294118
			if( ma20 > 427.406 )
				if( ma05 <= 428.421 )
					if( ma35 <= 427.572 )
						if( ma70 <= 427.499 )
							ret := -0.333333
						if( ma70 > 427.499 )
							ret := -0.529412
					if( ma35 > 427.572 )
						if( ma60 <= 427.586 )
							ret := -1.000000 // sell
						if( ma60 > 427.586 )
							if( ma45 <= 427.971 )
								ret := -0.888889 // sell
							if( ma45 > 427.971 )
								ret := -1.000000 // sell
				if( ma05 > 428.421 )
					if( ma80 <= 444.979 )
						if( ma20 <= 437.734 )
							if( ma85 <= 433.317 )
								if( ma80 <= 430.916 )
									ret := -0.156522
								if( ma80 > 430.916 )
									ret := 0.395833
							if( ma85 > 433.317 )
								if( ma100 <= 433.525 )
									ret := -0.921053 // sell
								if( ma100 > 433.525 )
									ret := -0.299401
						if( ma20 > 437.734 )
							if( ma05 <= 443.483 )
								if( ma100 <= 439.178 )
									ret := -0.333333
								if( ma100 > 439.178 )
									ret := 0.677966
							if( ma05 > 443.483 )
								if( ma80 <= 442.757 )
									ret := -0.600000
								if( ma80 > 442.757 )
									ret := 0.000000
					if( ma80 > 444.979 )
						if( ma90_colorInt <= 2 )
							if( ma90 <= 453.073 )
								ret := 0.500000
							if( ma90 > 453.073 )
								ret := 1.000000 // buy
						if( ma90_colorInt > 2 )
							if( ma15 <= 457.955 )
								if( ma05 <= 444.883 )
									ret := -1.000000 // sell
								if( ma05 > 444.883 )
									ret := -0.483146
							if( ma15 > 457.955 )
								if( ma25 <= 461.098 )
									ret := 0.437500
								if( ma25 > 461.098 )
									ret := -0.166667
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_896326da(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


