//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: LYFT_1Min_1MAD_03278d8b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_1MAD_03278d8b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_03278d8b(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ma30_colorInt <= 1.5 )
		if( ma45 <= 17.4458 )
			if( ma25_colorInt <= 1.5 )
				if( ma60_colorInt <= 1.5 )
					if( ma05_colorInt <= 1.5 )
						if( ma25 <= 11.6444 )
							if( ma70 <= 11.6309 )
								if( ma100 <= 10.2679 )
									ret := -0.159618
								if( ma100 > 10.2679 )
									ret := -0.019154
							if( ma70 > 11.6309 )
								if( ma15 <= 11.6402 )
									ret := 0.750000 // buy
								if( ma15 > 11.6402 )
									ret := 0.950000 // buy
						if( ma25 > 11.6444 )
							if( ma65 <= 11.6256 )
								if( ma15 <= 11.6723 )
									ret := -0.612903
								if( ma15 > 11.6723 )
									ret := -0.933333 // sell
							if( ma65 > 11.6256 )
								if( ma60 <= 17.4011 )
									ret := -0.173218
								if( ma60 > 17.4011 )
									ret := 0.447368
					if( ma05_colorInt > 1.5 )
						if( ma05_colorInt <= 2.5 )
							if( ma55 <= 12.1395 )
								if( ma40 <= 10.2924 )
									ret := -0.039370
								if( ma40 > 10.2924 )
									ret := 0.173233
							if( ma55 > 12.1395 )
								if( ma100 <= 12.3535 )
									ret := -0.202952
								if( ma100 > 12.3535 )
									ret := 0.074557
						if( ma05_colorInt > 2.5 )
							if( ma85_colorInt <= 3.5 )
								if( ma50 <= 13.9798 )
									ret := -0.440000
								if( ma50 > 13.9798 )
									ret := -0.750000 // sell
							if( ma85_colorInt > 3.5 )
								ret := 0.090909
				if( ma60_colorInt > 1.5 )
					if( ma10 <= 10.2492 )
						if( ma90_colorInt <= 2.5 )
							if( ma45 <= 10.1408 )
								ret := -0.888889 // sell
							if( ma45 > 10.1408 )
								ret := -1.000000 // sell
						if( ma90_colorInt > 2.5 )
							if( ma50_colorInt <= 2.5 )
								if( ma05_colorInt <= 1.5 )
									ret := 0.638889
								if( ma05_colorInt > 1.5 )
									ret := -0.500000
							if( ma50_colorInt > 2.5 )
								if( ma40_colorInt <= 3.5 )
									ret := -0.666667
								if( ma40_colorInt > 3.5 )
									ret := -0.256410
					if( ma10 > 10.2492 )
						if( ma60 <= 10.8051 )
							if( ma90 <= 10.2134 )
								ret := 1.000000 // buy
							if( ma90 > 10.2134 )
								if( ma05 <= 10.5886 )
									ret := -0.066667
								if( ma05 > 10.5886 )
									ret := 0.610526
						if( ma60 > 10.8051 )
							if( ma65 <= 12.8237 )
								if( ma80_colorInt <= 3 )
									ret := 0.540000
								if( ma80_colorInt > 3 )
									ret := -0.036585
							if( ma65 > 12.8237 )
								if( ma20 <= 17.1876 )
									ret := 0.180164
								if( ma20 > 17.1876 )
									ret := 0.584746
			if( ma25_colorInt > 1.5 )
				if( ma60 <= 15.7894 )
					if( ma60 <= 15.4366 )
						if( ma60 <= 12.5278 )
							if( ma20 <= 9.68088 )
								ret := 0.851852 // buy
							if( ma20 > 9.68088 )
								if( ma30 <= 10.0621 )
									ret := -0.139535
								if( ma30 > 10.0621 )
									ret := 0.334895
						if( ma60 > 12.5278 )
							if( ma75 <= 13.4107 )
								if( ma45 <= 13.4133 )
									ret := -0.055556
								if( ma45 > 13.4133 )
									ret := -0.571429
							if( ma75 > 13.4107 )
								if( ma40 <= 13.534 )
									ret := 0.653061
								if( ma40 > 13.534 )
									ret := -0.190476
					if( ma60 > 15.4366 )
						if( ma90 <= 15.7135 )
							if( ma30 <= 15.6595 )
								if( ma85 <= 15.5135 )
									ret := 1.000000 // buy
								if( ma85 > 15.5135 )
									ret := 0.500000
							if( ma30 > 15.6595 )
								if( ma05 <= 15.7797 )
									ret := 0.966667 // buy
								if( ma05 > 15.7797 )
									ret := 0.809524 // buy
						if( ma90 > 15.7135 )
							if( ma45 <= 15.7837 )
								ret := -0.076923
							if( ma45 > 15.7837 )
								ret := 0.857143 // buy
				if( ma60 > 15.7894 )
					if( ma90 <= 16.7026 )
						if( ma85 <= 15.8096 )
							ret := -0.909091 // sell
						if( ma85 > 15.8096 )
							if( ma55 <= 16.5185 )
								if( ma20 <= 16.4854 )
									ret := -0.158333
								if( ma20 > 16.4854 )
									ret := 1.000000 // buy
							if( ma55 > 16.5185 )
								if( ma50 <= 16.6491 )
									ret := -0.923077 // sell
								if( ma50 > 16.6491 )
									ret := -0.526316
					if( ma90 > 16.7026 )
						if( ma15_colorInt <= 2.5 )
							if( ma30 <= 17.0814 )
								if( ma85 <= 16.9299 )
									ret := 0.318182
								if( ma85 > 16.9299 )
									ret := 0.000000
							if( ma30 > 17.0814 )
								if( ma80 <= 17.2521 )
									ret := 0.933333 // buy
								if( ma80 > 17.2521 )
									ret := 0.470588
						if( ma15_colorInt > 2.5 )
							ret := 0.944444 // buy
		if( ma45 > 17.4458 )
			if( ma90_colorInt <= 2.5 )
				if( ma20 <= 18.0439 )
					if( ma15 <= 17.7733 )
						if( ma20 <= 17.5713 )
							if( ma65_colorInt <= 1.5 )
								if( ma50 <= 17.5196 )
									ret := -0.480952
								if( ma50 > 17.5196 )
									ret := -0.094828
							if( ma65_colorInt > 1.5 )
								ret := 0.785714 // buy
						if( ma20 > 17.5713 )
							if( ma10 <= 17.6408 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.954955 // sell
								if( ma10_colorInt > 1.5 )
									ret := -0.633333
							if( ma10 > 17.6408 )
								if( ma40 <= 17.5638 )
									ret := 0.578947
								if( ma40 > 17.5638 )
									ret := -0.556962
					if( ma15 > 17.7733 )
						ret := 0.071429
				if( ma20 > 18.0439 )
					if( ma20 <= 18.0594 )
						if( ma15 <= 18.0652 )
							ret := -1.000000 // sell
						if( ma15 > 18.0652 )
							ret := -0.461538
					if( ma20 > 18.0594 )
						ret := -1.000000 // sell
			if( ma90_colorInt > 2.5 )
				ret := 0.916667 // buy
	if( ma30_colorInt > 1.5 )
		if( ma15 <= 12.506 )
			if( ma40 <= 12.4332 )
				if( ma60 <= 11.0827 )
					if( ma35_colorInt <= 3.5 )
						if( ma70 <= 10.8262 )
							if( ma50 <= 10.5947 )
								if( ma20 <= 10.5786 )
									ret := 0.182138
								if( ma20 > 10.5786 )
									ret := -0.867925 // sell
							if( ma50 > 10.5947 )
								if( ma60 <= 10.7507 )
									ret := 0.714286 // buy
								if( ma60 > 10.7507 )
									ret := 0.344426
						if( ma70 > 10.8262 )
							if( ma20 <= 10.8284 )
								if( ma30 <= 10.8177 )
									ret := -0.034483
								if( ma30 > 10.8177 )
									ret := -0.595960
							if( ma20 > 10.8284 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.243711
								if( ma05_colorInt > 3.5 )
									ret := -0.089286
					if( ma35_colorInt > 3.5 )
						if( ma05 <= 10.9588 )
							if( ma75_colorInt <= 1.5 )
								if( ma25 <= 10.1287 )
									ret := 0.266667
								if( ma25 > 10.1287 )
									ret := -0.846154 // sell
							if( ma75_colorInt > 1.5 )
								if( ma45 <= 9.47669 )
									ret := -0.340426
								if( ma45 > 9.47669 )
									ret := -0.066528
						if( ma05 > 10.9588 )
							if( ma85_colorInt <= 2.5 )
								ret := -0.181818
							if( ma85_colorInt > 2.5 )
								if( ma85 <= 11.08 )
									ret := 0.857143 // buy
								if( ma85 > 11.08 )
									ret := -0.068966
				if( ma60 > 11.0827 )
					if( ma10_colorInt <= 3.5 )
						if( ma25 <= 11.0854 )
							if( ma80 <= 11.1377 )
								if( ma75 <= 11.0928 )
									ret := -0.833333 // sell
								if( ma75 > 11.0928 )
									ret := 0.083333
							if( ma80 > 11.1377 )
								ret := -1.000000 // sell
						if( ma25 > 11.0854 )
							if( ma10 <= 11.0354 )
								ret := -0.818182 // sell
							if( ma10 > 11.0354 )
								if( ma60 <= 12.4482 )
									ret := 0.093023
								if( ma60 > 12.4482 )
									ret := -0.880000 // sell
					if( ma10_colorInt > 3.5 )
						if( ma40 <= 12.1112 )
							if( ma45 <= 11.1016 )
								if( ma45_colorInt <= 3.5 )
									ret := -0.756410 // sell
								if( ma45_colorInt > 3.5 )
									ret := -0.117647
							if( ma45 > 11.1016 )
								if( ma40 <= 11.2319 )
									ret := 0.233716
								if( ma40 > 11.2319 )
									ret := -0.158589
						if( ma40 > 12.1112 )
							if( ma35 <= 12.1929 )
								if( ma70 <= 12.1885 )
									ret := -0.057471
								if( ma70 > 12.1885 )
									ret := 0.543779
							if( ma35 > 12.1929 )
								if( ma90 <= 12.2838 )
									ret := 0.153203
								if( ma90 > 12.2838 )
									ret := -0.035851
			if( ma40 > 12.4332 )
				if( ma20_colorInt <= 2.5 )
					if( ma10_colorInt <= 3.5 )
						if( ma60 <= 12.4738 )
							if( ma15 <= 12.4973 )
								if( ma65 <= 12.4572 )
									ret := -0.070312
								if( ma65 > 12.4572 )
									ret := 0.413333
							if( ma15 > 12.4973 )
								ret := -0.687500
						if( ma60 > 12.4738 )
							if( ma80 <= 12.4783 )
								if( ma25 <= 12.4896 )
									ret := -0.764706 // sell
								if( ma25 > 12.4896 )
									ret := -1.000000 // sell
							if( ma80 > 12.4783 )
								if( ma75 <= 12.4824 )
									ret := 0.833333 // buy
								if( ma75 > 12.4824 )
									ret := 0.019231
					if( ma10_colorInt > 3.5 )
						ret := 0.928571 // buy
				if( ma20_colorInt > 2.5 )
					if( ma15_colorInt <= 3.5 )
						if( ma30 <= 12.4444 )
							if( ma10 <= 12.4074 )
								if( ma10 <= 12.3232 )
									ret := 0.000000
								if( ma10 > 12.3232 )
									ret := 0.829545 // buy
							if( ma10 > 12.4074 )
								if( ma70 <= 12.4567 )
									ret := 0.539474
								if( ma70 > 12.4567 )
									ret := -0.250000
						if( ma30 > 12.4444 )
							if( ma80 <= 12.538 )
								if( ma05 <= 12.4465 )
									ret := 0.187919
								if( ma05 > 12.4465 )
									ret := 0.607064
							if( ma80 > 12.538 )
								if( ma60 <= 12.5341 )
									ret := -0.571429
								if( ma60 > 12.5341 )
									ret := 0.246377
					if( ma15_colorInt > 3.5 )
						if( ma35 <= 12.4672 )
							if( ma60 <= 12.454 )
								if( ma05 <= 12.4393 )
									ret := 0.566667
								if( ma05 > 12.4393 )
									ret := -0.085714
							if( ma60 > 12.454 )
								if( ma50_colorInt <= 3.5 )
									ret := 0.373134
								if( ma50_colorInt > 3.5 )
									ret := 0.794118 // buy
						if( ma35 > 12.4672 )
							if( ma70_colorInt <= 2.5 )
								if( ma10 <= 12.4853 )
									ret := 0.100000
								if( ma10 > 12.4853 )
									ret := 0.850000 // buy
							if( ma70_colorInt > 2.5 )
								if( ma05 <= 12.4534 )
									ret := -0.600000
								if( ma05 > 12.4534 )
									ret := -0.058081
		if( ma15 > 12.506 )
			if( ma15_colorInt <= 3.5 )
				if( ma80 <= 17.7768 )
					if( ma05 <= 17.7264 )
						if( ma100 <= 16.2779 )
							if( ma05 <= 16.0618 )
								if( ma20_colorInt <= 1.5 )
									ret := -0.162921
								if( ma20_colorInt > 1.5 )
									ret := 0.052362
							if( ma05 > 16.0618 )
								if( ma05 <= 16.0796 )
									ret := 0.663265
								if( ma05 > 16.0796 )
									ret := 0.194467
						if( ma100 > 16.2779 )
							if( ma60 <= 16.4673 )
								if( ma100 <= 16.305 )
									ret := -0.543651
								if( ma100 > 16.305 )
									ret := -0.260000
							if( ma60 > 16.4673 )
								if( ma25_colorInt <= 1.5 )
									ret := -0.609756
								if( ma25_colorInt > 1.5 )
									ret := 0.058657
					if( ma05 > 17.7264 )
						if( ma45 <= 17.7453 )
							ret := 0.000000
						if( ma45 > 17.7453 )
							if( ma40_colorInt <= 1.5 )
								ret := 0.384615
							if( ma40_colorInt > 1.5 )
								if( ma45 <= 17.7553 )
									ret := 0.837838 // buy
								if( ma45 > 17.7553 )
									ret := 1.000000 // buy
				if( ma80 > 17.7768 )
					if( ma100 <= 17.9548 )
						if( ma65 <= 17.8575 )
							if( ma100 <= 17.8122 )
								if( ma25 <= 18.0107 )
									ret := -0.619048
								if( ma25 > 18.0107 )
									ret := -1.000000 // sell
							if( ma100 > 17.8122 )
								ret := -0.538462
						if( ma65 > 17.8575 )
							if( ma30_colorInt <= 2.5 )
								if( ma25 <= 17.8718 )
									ret := 1.000000 // buy
								if( ma25 > 17.8718 )
									ret := -0.187500
							if( ma30_colorInt > 2.5 )
								ret := -0.650000
					if( ma100 > 17.9548 )
						ret := -1.000000 // sell
			if( ma15_colorInt > 3.5 )
				if( ma50 <= 15.7191 )
					if( ma65 <= 13.4221 )
						if( ma90 <= 12.5175 )
							if( ma65 <= 12.5066 )
								ret := -0.500000
							if( ma65 > 12.5066 )
								ret := -1.000000 // sell
						if( ma90 > 12.5175 )
							if( ma10_colorInt <= 1.5 )
								if( ma70 <= 12.8519 )
									ret := -0.079365
								if( ma70 > 12.8519 )
									ret := -0.544872
							if( ma10_colorInt > 1.5 )
								if( ma65_colorInt <= 3.5 )
									ret := -0.127980
								if( ma65_colorInt > 3.5 )
									ret := 0.075575
					if( ma65 > 13.4221 )
						if( ma50_colorInt <= 3.5 )
							if( ma55 <= 13.4207 )
								ret := -1.000000 // sell
							if( ma55 > 13.4207 )
								if( ma45 <= 15.5202 )
									ret := -0.098139
								if( ma45 > 15.5202 )
									ret := -0.303681
						if( ma50_colorInt > 3.5 )
							if( ma55 <= 13.4531 )
								if( ma70 <= 13.4389 )
									ret := -0.541667
								if( ma70 > 13.4389 )
									ret := -0.906977 // sell
							if( ma55 > 13.4531 )
								if( ma70 <= 13.4744 )
									ret := 0.146341
								if( ma70 > 13.4744 )
									ret := -0.317737
				if( ma50 > 15.7191 )
					if( ma75 <= 15.7556 )
						if( ma100 <= 15.7485 )
							if( ma85 <= 15.743 )
								if( ma75_colorInt <= 3.5 )
									ret := -0.111111
								if( ma75_colorInt > 3.5 )
									ret := 0.318182
							if( ma85 > 15.743 )
								ret := -1.000000 // sell
						if( ma100 > 15.7485 )
							if( ma45_colorInt <= 3.5 )
								if( ma40 <= 15.7321 )
									ret := 1.000000 // buy
								if( ma40 > 15.7321 )
									ret := 0.666667
							if( ma45_colorInt > 3.5 )
								if( ma90 <= 15.7563 )
									ret := 0.633333
								if( ma90 > 15.7563 )
									ret := 0.000000
					if( ma75 > 15.7556 )
						if( ma15 <= 17.4221 )
							if( ma40 <= 17.2922 )
								if( ma20 <= 17.1377 )
									ret := -0.082033
								if( ma20 > 17.1377 )
									ret := -0.373494
							if( ma40 > 17.2922 )
								if( ma80 <= 17.3833 )
									ret := 0.789916 // buy
								if( ma80 > 17.3833 )
									ret := 0.141892
						if( ma15 > 17.4221 )
							if( ma80 <= 17.5441 )
								if( ma05 <= 17.4653 )
									ret := -0.463158
								if( ma05 > 17.4653 )
									ret := -0.826087 // sell
							if( ma80 > 17.5441 )
								if( ma50 <= 17.5458 )
									ret := 0.434783
								if( ma50 > 17.5458 )
									ret := -0.923077 // sell
	
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
float op_operation = decision_tree_0_LYFT_1Min_03278d8b(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


