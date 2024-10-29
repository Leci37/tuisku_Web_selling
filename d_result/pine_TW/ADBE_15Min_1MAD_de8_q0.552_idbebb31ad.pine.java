//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: ADBE_15Min_1MAD_bebb31ad Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_1MAD_bebb31ad", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_bebb31ad(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma05 <= 515.304 )
		if( ma05_colorInt <= 3.5 )
			if( ma15_colorInt <= 1.5 )
				if( ma75 <= 342.884 )
					if( ma15 <= 343.848 )
						if( ma100 <= 104.769 )
							if( ma75_colorInt <= 2.5 )
								if( ma40 <= 104.59 )
									ret := 0.350515
								if( ma40 > 104.59 )
									ret := 0.730159 // buy
							if( ma75_colorInt > 2.5 )
								if( ma05 <= 102.004 )
									ret := -0.285714
								if( ma05 > 102.004 )
									ret := 0.000000
						if( ma100 > 104.769 )
							if( ma85 <= 108.304 )
								if( ma75 <= 108.275 )
									ret := -0.295019
								if( ma75 > 108.275 )
									ret := -0.958333 // sell
							if( ma85 > 108.304 )
								if( ma30 <= 326.741 )
									ret := 0.001899
								if( ma30 > 326.741 )
									ret := 0.127801
					if( ma15 > 343.848 )
						if( ma100 <= 338.581 )
							if( ma45 <= 340.689 )
								if( ma100 <= 335.744 )
									ret := -0.769231 // sell
								if( ma100 > 335.744 )
									ret := -0.962963 // sell
							if( ma45 > 340.689 )
								if( ma30 <= 343.748 )
									ret := -0.038462
								if( ma30 > 343.748 )
									ret := 0.487179
						if( ma100 > 338.581 )
							if( ma05_colorInt <= 1.5 )
								if( ma50 <= 345.059 )
									ret := -0.818792 // sell
								if( ma50 > 345.059 )
									ret := 0.250000
							if( ma05_colorInt > 1.5 )
								if( ma15 <= 347.934 )
									ret := -0.125000
								if( ma15 > 347.934 )
									ret := -1.000000 // sell
				if( ma75 > 342.884 )
					if( ma90 <= 343.748 )
						if( ma05 <= 343.298 )
							ret := -1.000000 // sell
						if( ma05 > 343.298 )
							if( ma05 <= 347.142 )
								if( ma15 <= 345.115 )
									ret := 0.790698 // buy
								if( ma15 > 345.115 )
									ret := -0.068182
							if( ma05 > 347.142 )
								if( ma25 <= 348.498 )
									ret := 0.888889 // buy
								if( ma25 > 348.498 )
									ret := -0.200000
					if( ma90 > 343.748 )
						if( ma65 <= 508.172 )
							if( ma75 <= 498.444 )
								if( ma65 <= 345.982 )
									ret := -0.284722
								if( ma65 > 345.982 )
									ret := 0.073682
							if( ma75 > 498.444 )
								if( ma80 <= 499.646 )
									ret := -0.602941
								if( ma80 > 499.646 )
									ret := -0.079167
						if( ma65 > 508.172 )
							if( ma55 <= 513.353 )
								if( ma100 <= 509.134 )
									ret := 0.378788
								if( ma100 > 509.134 )
									ret := 0.813333 // buy
							if( ma55 > 513.353 )
								if( ma35 <= 516.703 )
									ret := -0.282609
								if( ma35 > 516.703 )
									ret := 1.000000 // buy
			if( ma15_colorInt > 1.5 )
				if( ma15 <= 513.157 )
					if( ma90 <= 337.762 )
						if( ma100 <= 323.916 )
							if( ma100 <= 321.486 )
								if( ma05 <= 292.437 )
									ret := 0.143181
								if( ma05 > 292.437 )
									ret := 0.035965
							if( ma100 > 321.486 )
								if( ma15 <= 316.074 )
									ret := 0.083333
								if( ma15 > 316.074 )
									ret := -0.697368
						if( ma100 > 323.916 )
							if( ma15_colorInt <= 3.5 )
								if( ma05 <= 330.213 )
									ret := 0.520710
								if( ma05 > 330.213 )
									ret := 0.246679
							if( ma15_colorInt > 3.5 )
								if( ma90 <= 333.554 )
									ret := 0.153061
								if( ma90 > 333.554 )
									ret := -0.547170
					if( ma90 > 337.762 )
						if( ma15 <= 339.686 )
							if( ma30 <= 336.41 )
								if( ma35 <= 335.352 )
									ret := -0.270270
								if( ma35 > 335.352 )
									ret := 0.655556
							if( ma30 > 336.41 )
								if( ma15 <= 335.635 )
									ret := -0.714286 // sell
								if( ma15 > 335.635 )
									ret := -0.207547
						if( ma15 > 339.686 )
							if( ma90_colorInt <= 2.5 )
								if( ma100 <= 504.589 )
									ret := 0.117937
								if( ma100 > 504.589 )
									ret := 0.362869
							if( ma90_colorInt > 2.5 )
								if( ma35 <= 344.249 )
									ret := 0.543689
								if( ma35 > 344.249 )
									ret := 0.035473
				if( ma15 > 513.157 )
					if( ma40 <= 520.84 )
						if( ma50 <= 517.148 )
							if( ma90 <= 519.205 )
								if( ma75 <= 515.387 )
									ret := 0.487179
								if( ma75 > 515.387 )
									ret := 0.095238
							if( ma90 > 519.205 )
								if( ma05 <= 513.631 )
									ret := -0.333333
								if( ma05 > 513.631 )
									ret := -0.850000 // sell
						if( ma50 > 517.148 )
							if( ma05 <= 514.782 )
								if( ma25 <= 515.002 )
									ret := -1.000000 // sell
								if( ma25 > 515.002 )
									ret := 0.731579 // buy
							if( ma05 > 514.782 )
								if( ma85 <= 523.224 )
									ret := 0.041667
								if( ma85 > 523.224 )
									ret := 0.777778 // buy
					if( ma40 > 520.84 )
						if( ma75_colorInt <= 2.5 )
							if( ma15 <= 517.804 )
								ret := -1.000000 // sell
							if( ma15 > 517.804 )
								ret := -0.250000
						if( ma75_colorInt > 2.5 )
							if( ma20 <= 520.846 )
								if( ma50 <= 528.187 )
									ret := 0.058824
								if( ma50 > 528.187 )
									ret := 0.400000
							if( ma20 > 520.846 )
								if( ma25 <= 538.27 )
									ret := -0.555556
								if( ma25 > 538.27 )
									ret := -0.875000 // sell
		if( ma05_colorInt > 3.5 )
			if( ma50 <= 340.444 )
				if( ma05 <= 336.301 )
					if( ma75 <= 341.883 )
						if( ma45 <= 337.017 )
							if( ma100 <= 290.805 )
								if( ma85 <= 286.218 )
									ret := 0.018339
								if( ma85 > 286.218 )
									ret := -0.396985
							if( ma100 > 290.805 )
								if( ma100 <= 292.634 )
									ret := 0.611650
								if( ma100 > 292.634 )
									ret := 0.057221
						if( ma45 > 337.017 )
							if( ma60 <= 339.942 )
								if( ma65 <= 339.194 )
									ret := -0.571429
								if( ma65 > 339.194 )
									ret := -1.000000 // sell
							if( ma60 > 339.942 )
								if( ma15 <= 335.278 )
									ret := -0.250000
								if( ma15 > 335.278 )
									ret := -0.500000
					if( ma75 > 341.883 )
						ret := 1.000000 // buy
				if( ma05 > 336.301 )
					if( ma80_colorInt <= 1.5 )
						ret := -1.000000 // sell
					if( ma80_colorInt > 1.5 )
						if( ma100 <= 337.144 )
							ret := -0.600000
						if( ma100 > 337.144 )
							if( ma45 <= 336.341 )
								if( ma25 <= 335.393 )
									ret := 0.250000
								if( ma25 > 335.393 )
									ret := -0.200000
							if( ma45 > 336.341 )
								if( ma30 <= 338.208 )
									ret := 0.853333 // buy
								if( ma30 > 338.208 )
									ret := 0.222222
			if( ma50 > 340.444 )
				if( ma80 <= 342.166 )
					if( ma10 <= 338.962 )
						ret := -0.500000
					if( ma10 > 338.962 )
						if( ma10 <= 339.618 )
							if( ma25 <= 339.92 )
								ret := -1.000000 // sell
							if( ma25 > 339.92 )
								ret := -0.750000 // sell
						if( ma10 > 339.618 )
							ret := -1.000000 // sell
				if( ma80 > 342.166 )
					if( ma10_colorInt <= 3.5 )
						if( ma15_colorInt <= 3.5 )
							if( ma100 <= 428.959 )
								if( ma15 <= 418.772 )
									ret := 0.160665
								if( ma15 > 418.772 )
									ret := 1.000000 // buy
							if( ma100 > 428.959 )
								if( ma90 <= 430.49 )
									ret := -0.785714 // sell
								if( ma90 > 430.49 )
									ret := 0.015559
						if( ma15_colorInt > 3.5 )
							if( ma85 <= 478.903 )
								ret := -0.750000 // sell
							if( ma85 > 478.903 )
								ret := -1.000000 // sell
					if( ma10_colorInt > 3.5 )
						if( ma55 <= 409.173 )
							if( ma60 <= 386.965 )
								if( ma30 <= 378.324 )
									ret := -0.168766
								if( ma30 > 378.324 )
									ret := 0.341463
							if( ma60 > 386.965 )
								if( ma50 <= 394.088 )
									ret := -0.794872 // sell
								if( ma50 > 394.088 )
									ret := -0.354839
						if( ma55 > 409.173 )
							if( ma30 <= 408.068 )
								if( ma10 <= 406.714 )
									ret := 0.400000
								if( ma10 > 406.714 )
									ret := 0.941176 // buy
							if( ma30 > 408.068 )
								if( ma05 <= 411.857 )
									ret := -0.678571
								if( ma05 > 411.857 )
									ret := -0.034385
	if( ma05 > 515.304 )
		if( ma100 <= 680.575 )
			if( ma20_colorInt <= 3.5 )
				if( ma15 <= 542.551 )
					if( ma50 <= 540.635 )
						if( ma35 <= 536.237 )
							if( ma35 <= 531.126 )
								if( ma100 <= 516.694 )
									ret := -0.121951
								if( ma100 > 516.694 )
									ret := 0.047752
							if( ma35 > 531.126 )
								if( ma15 <= 531.922 )
									ret := -0.657303
								if( ma15 > 531.922 )
									ret := -0.084706
						if( ma35 > 536.237 )
							if( ma80 <= 538.596 )
								if( ma80 <= 535.529 )
									ret := 0.301370
								if( ma80 > 535.529 )
									ret := 0.909091 // buy
							if( ma80 > 538.596 )
								if( ma65 <= 540.514 )
									ret := -0.447368
								if( ma65 > 540.514 )
									ret := 0.566667
					if( ma50 > 540.635 )
						if( ma85 <= 550.504 )
							if( ma80 <= 547.411 )
								if( ma70 <= 543.971 )
									ret := -0.692308
								if( ma70 > 543.971 )
									ret := -0.156627
							if( ma80 > 547.411 )
								if( ma45 <= 545.422 )
									ret := -0.913793 // sell
								if( ma45 > 545.422 )
									ret := -0.222222
						if( ma85 > 550.504 )
							if( ma100 <= 563.275 )
								if( ma60 <= 549.367 )
									ret := 0.521739
								if( ma60 > 549.367 )
									ret := -0.405405
							if( ma100 > 563.275 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.937500 // buy
								if( ma05_colorInt > 3.5 )
									ret := 0.166667
				if( ma15 > 542.551 )
					if( ma70 <= 543.107 )
						if( ma60 <= 541.664 )
							if( ma20 <= 544.533 )
								if( ma10 <= 544.79 )
									ret := 0.637681
								if( ma10 > 544.79 )
									ret := 0.218750
							if( ma20 > 544.533 )
								if( ma20 <= 545.626 )
									ret := -0.423729
								if( ma20 > 545.626 )
									ret := 0.396552
						if( ma60 > 541.664 )
							if( ma15 <= 552.284 )
								if( ma10 <= 549.643 )
									ret := 0.891892 // buy
								if( ma10 > 549.643 )
									ret := 0.456522
							if( ma15 > 552.284 )
								ret := -0.333333
					if( ma70 > 543.107 )
						if( ma05 <= 540.922 )
							if( ma30 <= 545.294 )
								ret := -0.142857
							if( ma30 > 545.294 )
								if( ma75 <= 566.665 )
									ret := 0.972222 // buy
								if( ma75 > 566.665 )
									ret := 0.545455
						if( ma05 > 540.922 )
							if( ma05 <= 665.625 )
								if( ma90 <= 663.69 )
									ret := 0.015991
								if( ma90 > 663.69 )
									ret := 0.302419
							if( ma05 > 665.625 )
								if( ma50_colorInt <= 2.5 )
									ret := -0.053269
								if( ma50_colorInt > 2.5 )
									ret := -0.692308
			if( ma20_colorInt > 3.5 )
				if( ma70 <= 515.105 )
					if( ma15 <= 514.744 )
						if( ma15 <= 513.273 )
							ret := 0.600000
						if( ma15 > 513.273 )
							if( ma20 <= 514.007 )
								ret := 0.000000
							if( ma20 > 514.007 )
								ret := 0.250000
					if( ma15 > 514.744 )
						if( ma90 <= 516.212 )
							if( ma45 <= 514.386 )
								ret := 1.000000 // buy
							if( ma45 > 514.386 )
								ret := 0.800000 // buy
						if( ma90 > 516.212 )
							ret := 0.500000
				if( ma70 > 515.105 )
					if( ma90 <= 532.222 )
						if( ma90 <= 518.837 )
							if( ma55 <= 517.178 )
								if( ma15 <= 515.522 )
									ret := 0.120000
								if( ma15 > 515.522 )
									ret := -0.744186 // sell
							if( ma55 > 517.178 )
								if( ma50_colorInt <= 3.5 )
									ret := -0.333333
								if( ma50_colorInt > 3.5 )
									ret := 0.625000
						if( ma90 > 518.837 )
							if( ma55 <= 518.86 )
								if( ma20 <= 517.552 )
									ret := -0.660377
								if( ma20 > 517.552 )
									ret := -0.970588 // sell
							if( ma55 > 518.86 )
								if( ma75 <= 521.648 )
									ret := -0.083333
								if( ma75 > 521.648 )
									ret := -0.518519
					if( ma90 > 532.222 )
						if( ma80 <= 552.034 )
							if( ma85 <= 552.207 )
								if( ma100 <= 546.154 )
									ret := -0.049550
								if( ma100 > 546.154 )
									ret := 0.264463
							if( ma85 > 552.207 )
								if( ma100 <= 554.444 )
									ret := 1.000000 // buy
								if( ma100 > 554.444 )
									ret := 0.750000 // buy
						if( ma80 > 552.034 )
							if( ma100 <= 609.809 )
								if( ma80_colorInt <= 2.5 )
									ret := 0.029586
								if( ma80_colorInt > 2.5 )
									ret := -0.288316
							if( ma100 > 609.809 )
								if( ma35_colorInt <= 2.5 )
									ret := -0.638889
								if( ma35_colorInt > 2.5 )
									ret := 0.094374
		if( ma100 > 680.575 )
			if( ma25 <= 692.245 )
				if( ma30 <= 681.238 )
					if( ma45_colorInt <= 2.5 )
						ret := -1.000000 // sell
					if( ma45_colorInt > 2.5 )
						ret := -0.833333 // sell
				if( ma30 > 681.238 )
					if( ma25 <= 683.606 )
						if( ma25_colorInt <= 2.5 )
							ret := -1.000000 // sell
						if( ma25_colorInt > 2.5 )
							ret := 0.000000
					if( ma25 > 683.606 )
						ret := 0.000000
			if( ma25 > 692.245 )
				if( ma05 <= 695.371 )
					ret := -0.800000 // sell
				if( ma05 > 695.371 )
					ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_ADBE_15Min_bebb31ad(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)

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


