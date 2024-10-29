//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: ATOMUSDT_30Min_1MAD_86b356fc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_30Min_1MAD_86b356fc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_30Min_86b356fc(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma90 <= 39.5246 )
		if( ma05_colorInt <= 1.5 )
			if( ma35 <= 4.62398 )
				if( ma50 <= 4.09576 )
					if( ma35_colorInt <= 1.5 )
						if( ma10 <= 4.09012 )
							if( ma75 <= 3.83078 )
								if( ma35 <= 3.81552 )
									ret := 0.545455
								if( ma35 > 3.81552 )
									ret := 0.000000
							if( ma75 > 3.83078 )
								if( ma05 <= 3.99931 )
									ret := 1.000000 // buy
								if( ma05 > 3.99931 )
									ret := 0.454545
						if( ma10 > 4.09012 )
							ret := 0.130435
					if( ma35_colorInt > 1.5 )
						if( ma20 <= 4.08892 )
							if( ma15 <= 3.77102 )
								ret := 0.894737 // buy
							if( ma15 > 3.77102 )
								if( ma65 <= 4.02694 )
									ret := 0.666667
								if( ma65 > 4.02694 )
									ret := 0.750000 // buy
						if( ma20 > 4.08892 )
							ret := 1.000000 // buy
				if( ma50 > 4.09576 )
					if( ma65 <= 4.57829 )
						if( ma100 <= 4.13495 )
							if( ma65 <= 4.12638 )
								if( ma10 <= 4.15167 )
									ret := 0.000000
								if( ma10 > 4.15167 )
									ret := 0.100000
							if( ma65 > 4.12638 )
								if( ma30 <= 4.16885 )
									ret := -0.555556
								if( ma30 > 4.16885 )
									ret := -0.333333
						if( ma100 > 4.13495 )
							if( ma75 <= 4.18094 )
								if( ma05 <= 4.24788 )
									ret := 0.111111
								if( ma05 > 4.24788 )
									ret := 0.842105 // buy
							if( ma75 > 4.18094 )
								if( ma05 <= 4.66427 )
									ret := 0.236842
								if( ma05 > 4.66427 )
									ret := -0.333333
					if( ma65 > 4.57829 )
						if( ma90 <= 4.60448 )
							if( ma15_colorInt <= 1.5 )
								if( ma25 <= 4.59379 )
									ret := 0.680000
								if( ma25 > 4.59379 )
									ret := 0.943396 // buy
							if( ma15_colorInt > 1.5 )
								ret := 0.272727
						if( ma90 > 4.60448 )
							if( ma10 <= 4.67331 )
								if( ma25 <= 4.61095 )
									ret := 0.266667
								if( ma25 > 4.61095 )
									ret := 0.000000
							if( ma10 > 4.67331 )
								ret := 0.923077 // buy
			if( ma35 > 4.62398 )
				if( ma10 <= 40.5493 )
					if( ma90 <= 5.13378 )
						if( ma100 <= 4.78763 )
							if( ma70 <= 4.64307 )
								if( ma45 <= 4.62513 )
									ret := 0.185185
								if( ma45 > 4.62513 )
									ret := -0.540323
							if( ma70 > 4.64307 )
								if( ma55 <= 4.79242 )
									ret := 0.024845
								if( ma55 > 4.79242 )
									ret := 0.693878
						if( ma100 > 4.78763 )
							if( ma55 <= 5.16397 )
								if( ma30_colorInt <= 3 )
									ret := -0.180798
								if( ma30_colorInt > 3 )
									ret := -0.469274
							if( ma55 > 5.16397 )
								if( ma85 <= 5.11341 )
									ret := -0.964286 // sell
								if( ma85 > 5.11341 )
									ret := -0.500000
					if( ma90 > 5.13378 )
						if( ma55 <= 5.26829 )
							if( ma60_colorInt <= 3 )
								if( ma05 <= 5.28876 )
									ret := 0.544776
								if( ma05 > 5.28876 )
									ret := 0.132353
							if( ma60_colorInt > 3 )
								ret := -0.476190
						if( ma55 > 5.26829 )
							if( ma75_colorInt <= 1.5 )
								if( ma35_colorInt <= 1.5 )
									ret := -0.070673
								if( ma35_colorInt > 1.5 )
									ret := 0.103165
							if( ma75_colorInt > 1.5 )
								if( ma80 <= 6.83454 )
									ret := 0.211538
								if( ma80 > 6.83454 )
									ret := -0.005867
				if( ma10 > 40.5493 )
					if( ma30 <= 40.7702 )
						if( ma85 <= 39.1918 )
							if( ma30 <= 40.4192 )
								if( ma65 <= 38.7265 )
									ret := -0.656250
								if( ma65 > 38.7265 )
									ret := -1.000000 // sell
							if( ma30 > 40.4192 )
								ret := 0.076923
						if( ma85 > 39.1918 )
							ret := 0.600000
					if( ma30 > 40.7702 )
						if( ma45 <= 40.5675 )
							ret := -1.000000 // sell
						if( ma45 > 40.5675 )
							ret := -0.857143 // sell
		if( ma05_colorInt > 1.5 )
			if( ma20_colorInt <= 2.5 )
				if( ma55 <= 4.48106 )
					if( ma30 <= 4.43794 )
						if( ma55 <= 4.107 )
							if( ma05 <= 4.10799 )
								if( ma65 <= 3.95615 )
									ret := 0.480000
								if( ma65 > 3.95615 )
									ret := 0.974359 // buy
							if( ma05 > 4.10799 )
								if( ma70 <= 4.06729 )
									ret := 0.384615
								if( ma70 > 4.06729 )
									ret := 0.000000
						if( ma55 > 4.107 )
							if( ma90 <= 4.09647 )
								ret := 0.384615
							if( ma90 > 4.09647 )
								if( ma35 <= 4.29577 )
									ret := -0.066667
								if( ma35 > 4.29577 )
									ret := 0.186441
					if( ma30 > 4.43794 )
						if( ma25 <= 4.4558 )
							ret := 1.000000 // buy
						if( ma25 > 4.4558 )
							if( ma55 <= 4.44588 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.142857
								if( ma25_colorInt > 1.5 )
									ret := 0.500000
							if( ma55 > 4.44588 )
								ret := 0.900000 // buy
				if( ma55 > 4.48106 )
					if( ma80_colorInt <= 1.5 )
						if( ma65 <= 21.3819 )
							if( ma05 <= 20.5421 )
								if( ma65 <= 19.9508 )
									ret := 0.057580
								if( ma65 > 19.9508 )
									ret := -0.644444
							if( ma05 > 20.5421 )
								if( ma50 <= 21.0007 )
									ret := 0.641667
								if( ma50 > 21.0007 )
									ret := 0.073171
						if( ma65 > 21.3819 )
							if( ma80 <= 24.2882 )
								if( ma35 <= 22.3565 )
									ret := -0.683544
								if( ma35 > 22.3565 )
									ret := -0.217484
							if( ma80 > 24.2882 )
								if( ma40 <= 28.2736 )
									ret := 0.335470
								if( ma40 > 28.2736 )
									ret := -0.041768
					if( ma80_colorInt > 1.5 )
						if( ma60 <= 39.5579 )
							if( ma65 <= 39.0708 )
								if( ma70_colorInt <= 2.5 )
									ret := 0.148301
								if( ma70_colorInt > 2.5 )
									ret := 0.030411
							if( ma65 > 39.0708 )
								if( ma10 <= 39.654 )
									ret := -0.763889 // sell
								if( ma10 > 39.654 )
									ret := 0.350000
						if( ma60 > 39.5579 )
							if( ma80 <= 39.4822 )
								ret := 0.888889 // buy
							if( ma80 > 39.4822 )
								ret := 1.000000 // buy
			if( ma20_colorInt > 2.5 )
				if( ma80 <= 34.2904 )
					if( ma25 <= 27.7462 )
						if( ma90 <= 28.4045 )
							if( ma35 <= 25.6231 )
								if( ma15 <= 24.6623 )
									ret := -0.006742
								if( ma15 > 24.6623 )
									ret := -0.695364
							if( ma35 > 25.6231 )
								if( ma35_colorInt <= 2.5 )
									ret := 0.648936
								if( ma35_colorInt > 2.5 )
									ret := 0.077300
						if( ma90 > 28.4045 )
							if( ma10_colorInt <= 3.5 )
								if( ma70 <= 28.4003 )
									ret := 0.892308 // buy
								if( ma70 > 28.4003 )
									ret := 0.627907
							if( ma10_colorInt > 3.5 )
								if( ma100 <= 28.9808 )
									ret := -0.055556
								if( ma100 > 28.9808 )
									ret := 0.600000
					if( ma25 > 27.7462 )
						if( ma90 <= 31.9177 )
							if( ma40 <= 27.8399 )
								if( ma100 <= 27.9861 )
									ret := -0.978723 // sell
								if( ma100 > 27.9861 )
									ret := -0.470588
							if( ma40 > 27.8399 )
								if( ma05 <= 30.2825 )
									ret := -0.156270
								if( ma05 > 30.2825 )
									ret := -0.537879
						if( ma90 > 31.9177 )
							if( ma85 <= 32.3002 )
								if( ma70 <= 32.1396 )
									ret := 0.732484 // buy
								if( ma70 > 32.1396 )
									ret := -0.156250
							if( ma85 > 32.3002 )
								if( ma20 <= 29.7246 )
									ret := 0.842105 // buy
								if( ma20 > 29.7246 )
									ret := -0.120137
				if( ma80 > 34.2904 )
					if( ma35 <= 34.3226 )
						if( ma55 <= 34.0188 )
							if( ma05 <= 30.5682 )
								ret := 1.000000 // buy
							if( ma05 > 30.5682 )
								if( ma15 <= 31.7043 )
									ret := -0.909091 // sell
								if( ma15 > 31.7043 )
									ret := 0.111111
						if( ma55 > 34.0188 )
							if( ma80 <= 35.2516 )
								if( ma50 <= 34.1655 )
									ret := 0.745455 // buy
								if( ma50 > 34.1655 )
									ret := 0.914286 // buy
							if( ma80 > 35.2516 )
								ret := -0.454545
					if( ma35 > 34.3226 )
						if( ma45 <= 34.7284 )
							if( ma70 <= 34.604 )
								if( ma45 <= 34.4475 )
									ret := 1.000000 // buy
								if( ma45 > 34.4475 )
									ret := -0.142857
							if( ma70 > 34.604 )
								if( ma100 <= 35.327 )
									ret := -0.675214
								if( ma100 > 35.327 )
									ret := 0.090909
						if( ma45 > 34.7284 )
							if( ma35 <= 38.9509 )
								if( ma80 <= 39.1076 )
									ret := 0.043800
								if( ma80 > 39.1076 )
									ret := 0.688889
							if( ma35 > 38.9509 )
								if( ma40 <= 39.4384 )
									ret := -0.673469
								if( ma40 > 39.4384 )
									ret := 0.333333
	if( ma90 > 39.5246 )
		if( ma40 <= 41.256 )
			if( ma10 <= 39.4276 )
				if( ma50 <= 40.21 )
					if( ma05 <= 37.2814 )
						ret := 0.888889 // buy
					if( ma05 > 37.2814 )
						if( ma70 <= 39.9391 )
							if( ma100 <= 39.8862 )
								if( ma65 <= 39.6003 )
									ret := -0.642857
								if( ma65 > 39.6003 )
									ret := -0.977273 // sell
							if( ma100 > 39.8862 )
								ret := -0.642857
						if( ma70 > 39.9391 )
							if( ma15 <= 39.0776 )
								if( ma50 <= 39.8961 )
									ret := -0.636364
								if( ma50 > 39.8961 )
									ret := 0.375000
							if( ma15 > 39.0776 )
								if( ma50 <= 39.9833 )
									ret := -1.000000 // sell
								if( ma50 > 39.9833 )
									ret := -0.791667 // sell
				if( ma50 > 40.21 )
					if( ma10 <= 39.2899 )
						if( ma45 <= 40.27 )
							ret := 0.545455
						if( ma45 > 40.27 )
							ret := 0.714286 // buy
					if( ma10 > 39.2899 )
						ret := -0.700000 // sell
			if( ma10 > 39.4276 )
				if( ma60 <= 40.1743 )
					if( ma40 <= 40.4973 )
						if( ma35 <= 39.6526 )
							ret := -0.545455
						if( ma35 > 39.6526 )
							if( ma10 <= 40.1058 )
								if( ma15 <= 39.8056 )
									ret := 1.000000 // buy
								if( ma15 > 39.8056 )
									ret := 0.720000 // buy
							if( ma10 > 40.1058 )
								if( ma70 <= 39.7116 )
									ret := -1.000000 // sell
								if( ma70 > 39.7116 )
									ret := 0.736842 // buy
					if( ma40 > 40.4973 )
						ret := -1.000000 // sell
				if( ma60 > 40.1743 )
					if( ma40 <= 40.9941 )
						if( ma35 <= 40.659 )
							if( ma25 <= 40.1521 )
								ret := -1.000000 // sell
							if( ma25 > 40.1521 )
								if( ma55 <= 40.2869 )
									ret := 0.300000
								if( ma55 > 40.2869 )
									ret := -0.386364
						if( ma35 > 40.659 )
							if( ma45 <= 40.8122 )
								if( ma60 <= 40.4191 )
									ret := -0.979592 // sell
								if( ma60 > 40.4191 )
									ret := -0.818182 // sell
							if( ma45 > 40.8122 )
								if( ma40 <= 40.918 )
									ret := -0.583333
								if( ma40 > 40.918 )
									ret := -0.200000
					if( ma40 > 40.9941 )
						if( ma45 <= 41.1092 )
							if( ma80 <= 40.6024 )
								if( ma50_colorInt <= 1.5 )
									ret := 0.050000
								if( ma50_colorInt > 1.5 )
									ret := 0.700000 // buy
							if( ma80 > 40.6024 )
								ret := -0.823529 // sell
						if( ma45 > 41.1092 )
							ret := -0.846154 // sell
		if( ma40 > 41.256 )
			if( ma40 <= 42.2049 )
				if( ma85 <= 40.1951 )
					if( ma25_colorInt <= 1.5 )
						ret := -1.000000 // sell
					if( ma25_colorInt > 1.5 )
						ret := -0.347826
				if( ma85 > 40.1951 )
					if( ma100 <= 40.5739 )
						if( ma45 <= 41.1948 )
							ret := -0.700000 // sell
						if( ma45 > 41.1948 )
							ret := -1.000000 // sell
					if( ma100 > 40.5739 )
						if( ma75 <= 41.3378 )
							ret := -0.375000
						if( ma75 > 41.3378 )
							if( ma10 <= 40.7313 )
								ret := -0.666667
							if( ma10 > 40.7313 )
								if( ma75 <= 41.8112 )
									ret := -1.000000 // sell
								if( ma75 > 41.8112 )
									ret := -0.909091 // sell
			if( ma40 > 42.2049 )
				if( ma15_colorInt <= 1.5 )
					ret := -0.933333 // sell
				if( ma15_colorInt > 1.5 )
					if( ma75 <= 41.9351 )
						ret := 0.750000 // buy
					if( ma75 > 41.9351 )
						if( ma100 <= 41.6715 )
							ret := -0.125000
						if( ma100 > 41.6715 )
							ret := -0.785714 // sell
	
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
float op_operation = decision_tree_0_ATOMUSDT_30Min_86b356fc(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)

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


