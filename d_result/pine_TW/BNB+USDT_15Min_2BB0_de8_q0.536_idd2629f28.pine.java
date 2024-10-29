//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: BNBUSDT_15Min_2BB0_d2629f28 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2BB0_d2629f28", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_d2629f28(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -1.41639 )
		if( bearPower <= -12.2655 )
			if( bbp <= -22.1331 )
				if( Lower_Band <= 296.202 )
					if( bearPower <= -15.3516 )
						ret := 1.000000 // buy
					if( bearPower > -15.3516 )
						if( bearPower <= -14.679 )
							ret := 0.500000
						if( bearPower > -14.679 )
							ret := 1.000000 // buy
				if( Lower_Band > 296.202 )
					if( Upper_Band <= 582.623 )
						if( bbm <= 9.29576 )
							if( bbm <= 7.15897 )
								if( bearPower <= -14.7159 )
									ret := 1.000000 // buy
								if( bearPower > -14.7159 )
									ret := 0.750000 // buy
							if( bbm > 7.15897 )
								if( Upper_Band <= 484.011 )
									ret := 0.888889 // buy
								if( Upper_Band > 484.011 )
									ret := 0.200000
						if( bbm > 9.29576 )
							if( Upper_Band <= 468.693 )
								if( Lower_Band <= 353.136 )
									ret := 0.076923
								if( Lower_Band > 353.136 )
									ret := 1.000000 // buy
							if( Upper_Band > 468.693 )
								if( Upper_Band <= 533.868 )
									ret := -0.875000 // sell
								if( Upper_Band > 533.868 )
									ret := 0.200000
					if( Upper_Band > 582.623 )
						if( bbm <= 5.7 )
							ret := -0.333333
						if( bbm > 5.7 )
							if( Upper_Band <= 615.886 )
								if( Upper_Band <= 583.449 )
									ret := 0.600000
								if( Upper_Band > 583.449 )
									ret := 0.941176 // buy
							if( Upper_Band > 615.886 )
								if( bbm <= 14.1582 )
									ret := 0.071429
								if( bbm > 14.1582 )
									ret := 1.000000 // buy
			if( bbp > -22.1331 )
				if( Upper_Band <= 518.821 )
					if( bearPower <= -13.8506 )
						if( Lower_Band <= 287.977 )
							if( bearPower <= -14.7714 )
								ret := 0.857143 // buy
							if( bearPower > -14.7714 )
								ret := -0.142857
						if( Lower_Band > 287.977 )
							if( Upper_Band <= 438.095 )
								ret := -1.000000 // sell
							if( Upper_Band > 438.095 )
								if( bbm <= 11.2839 )
									ret := -0.714286 // sell
								if( bbm > 11.2839 )
									ret := 0.500000
					if( bearPower > -13.8506 )
						if( bbp <= -18.9368 )
							if( bbp <= -19.5396 )
								if( bbp <= -20.5461 )
									ret := -0.250000
								if( bbp > -20.5461 )
									ret := 1.000000 // buy
							if( bbp > -19.5396 )
								ret := -1.000000 // sell
						if( bbp > -18.9368 )
							if( Upper_Band <= 493.568 )
								if( bbm <= 11.8128 )
									ret := 0.880000 // buy
								if( bbm > 11.8128 )
									ret := 0.000000
							if( Upper_Band > 493.568 )
								ret := -0.200000
				if( Upper_Band > 518.821 )
					if( Lower_Band <= 625.333 )
						if( Lower_Band <= 512.84 )
							if( bbm <= 5.69918 )
								ret := 0.750000 // buy
							if( bbm > 5.69918 )
								ret := 1.000000 // buy
						if( Lower_Band > 512.84 )
							if( Lower_Band <= 519.897 )
								ret := -1.000000 // sell
							if( Lower_Band > 519.897 )
								if( Lower_Band <= 552.22 )
									ret := 0.964286 // buy
								if( Lower_Band > 552.22 )
									ret := 0.582090
					if( Lower_Band > 625.333 )
						if( bullPower <= -4.46565 )
							ret := 1.000000 // buy
						if( bullPower > -4.46565 )
							if( bullPower <= -2.34661 )
								ret := -1.000000 // sell
							if( bullPower > -2.34661 )
								ret := -0.750000 // sell
		if( bearPower > -12.2655 )
			if( Upper_Band <= 580.818 )
				if( Upper_Band <= 205.614 )
					if( Upper_Band <= 203.493 )
						if( bullPower <= -0.091181 )
							if( Upper_Band <= 201.15 )
								if( basis <= 195.385 )
									ret := 0.800000 // buy
								if( basis > 195.385 )
									ret := 1.000000 // buy
							if( Upper_Band > 201.15 )
								if( Lower_Band <= 187.744 )
									ret := 1.000000 // buy
								if( Lower_Band > 187.744 )
									ret := 0.000000
						if( bullPower > -0.091181 )
							if( bbp <= -0.454752 )
								ret := -1.000000 // sell
							if( bbp > -0.454752 )
								ret := -0.750000 // sell
					if( Upper_Band > 203.493 )
						if( Upper_Band <= 205.076 )
							ret := -1.000000 // sell
						if( Upper_Band > 205.076 )
							if( bbp <= -2.76818 )
								ret := -0.500000
							if( bbp > -2.76818 )
								ret := -1.000000 // sell
				if( Upper_Band > 205.614 )
					if( basis <= 209.79 )
						if( bullPower <= -0.508816 )
							if( Lower_Band <= 206.249 )
								if( bbm <= 0.722486 )
									ret := 0.500000
								if( bbm > 0.722486 )
									ret := 0.928571 // buy
							if( Lower_Band > 206.249 )
								if( bullPower <= -0.838442 )
									ret := 0.166667
								if( bullPower > -0.838442 )
									ret := 0.666667
						if( bullPower > -0.508816 )
							if( basis <= 209.654 )
								if( bearPower <= -1.51768 )
									ret := 0.518519
								if( bearPower > -1.51768 )
									ret := -0.400000
							if( basis > 209.654 )
								ret := 1.000000 // buy
					if( basis > 209.79 )
						if( Upper_Band <= 578.919 )
							if( basis <= 573.995 )
								if( bullPower <= -6.11327 )
									ret := -0.209877
								if( bullPower > -6.11327 )
									ret := 0.127984
							if( basis > 573.995 )
								if( bearPower <= -2.35193 )
									ret := -0.658537
								if( bearPower > -2.35193 )
									ret := -0.200000
						if( Upper_Band > 578.919 )
							if( basis <= 574.4 )
								if( Upper_Band <= 579.003 )
									ret := 0.000000
								if( Upper_Band > 579.003 )
									ret := 0.714286 // buy
							if( basis > 574.4 )
								if( Lower_Band <= 574.221 )
									ret := -0.103448
								if( Lower_Band > 574.221 )
									ret := 0.543478
			if( Upper_Band > 580.818 )
				if( Upper_Band <= 709.882 )
					if( basis <= 566.524 )
						if( Upper_Band <= 582.828 )
							if( Lower_Band <= 548.453 )
								if( basis <= 564.588 )
									ret := 0.500000
								if( basis > 564.588 )
									ret := 0.750000 // buy
							if( Lower_Band > 548.453 )
								ret := 1.000000 // buy
						if( Upper_Band > 582.828 )
							ret := 1.000000 // buy
					if( basis > 566.524 )
						if( basis <= 580.074 )
							if( bbm <= 6.46392 )
								if( bbm <= 4.77896 )
									ret := -0.113281
								if( bbm > 4.77896 )
									ret := -0.646552
							if( bbm > 6.46392 )
								if( Lower_Band <= 561.889 )
									ret := 0.883721 // buy
								if( Lower_Band > 561.889 )
									ret := -0.321429
						if( basis > 580.074 )
							if( Lower_Band <= 580.003 )
								if( bullPower <= -4.74285 )
									ret := -0.375000
								if( bullPower > -4.74285 )
									ret := 0.238160
							if( Lower_Band > 580.003 )
								if( basis <= 701.026 )
									ret := 0.016733
								if( basis > 701.026 )
									ret := -0.593220
				if( Upper_Band > 709.882 )
					if( basis <= 709.925 )
						if( bbp <= -3.91299 )
							if( Lower_Band <= 701.112 )
								if( Upper_Band <= 719.442 )
									ret := 0.944444 // buy
								if( Upper_Band > 719.442 )
									ret := 0.600000
							if( Lower_Band > 701.112 )
								ret := 0.250000
						if( bbp > -3.91299 )
							if( basis <= 706.244 )
								if( Upper_Band <= 711.32 )
									ret := 0.818182 // buy
								if( Upper_Band > 711.32 )
									ret := -0.222222
							if( basis > 706.244 )
								ret := 0.000000
					if( basis > 709.925 )
						ret := -1.000000 // sell
	if( bearPower > -1.41639 )
		if( Lower_Band <= 580.881 )
			if( Lower_Band <= 416.326 )
				if( basis <= 311.522 )
					if( Lower_Band <= 205.197 )
						if( Upper_Band <= 225.493 )
							if( basis <= 193.865 )
								if( bearPower <= 1.74947 )
									ret := 1.000000 // buy
								if( bearPower > 1.74947 )
									ret := -0.750000 // sell
							if( basis > 193.865 )
								if( basis <= 204.638 )
									ret := -0.558824
								if( basis > 204.638 )
									ret := 0.243129
						if( Upper_Band > 225.493 )
							if( bbm <= 4.03517 )
								if( Lower_Band <= 202.16 )
									ret := 0.920000 // buy
								if( Lower_Band > 202.16 )
									ret := 1.000000 // buy
							if( bbm > 4.03517 )
								if( bearPower <= 1.89646 )
									ret := 1.000000 // buy
								if( bearPower > 1.89646 )
									ret := -0.666667
					if( Lower_Band > 205.197 )
						if( bullPower <= 13.6844 )
							if( Lower_Band <= 219.048 )
								if( Lower_Band <= 216.725 )
									ret := 0.001765
								if( Lower_Band > 216.725 )
									ret := -0.276630
							if( Lower_Band > 219.048 )
								if( basis <= 225.136 )
									ret := 0.294551
								if( basis > 225.136 )
									ret := 0.033563
						if( bullPower > 13.6844 )
							if( basis <= 250.09 )
								if( Lower_Band <= 225.311 )
									ret := 0.750000 // buy
								if( Lower_Band > 225.311 )
									ret := -0.750000 // sell
							if( basis > 250.09 )
								if( basis <= 284.927 )
									ret := 0.975000 // buy
								if( basis > 284.927 )
									ret := 0.000000
				if( basis > 311.522 )
					if( bullPower <= 2.67314 )
						if( Lower_Band <= 309.324 )
							if( basis <= 317.8 )
								if( basis <= 314.372 )
									ret := -0.323276
								if( basis > 314.372 )
									ret := -0.850000 // sell
							if( basis > 317.8 )
								ret := 0.857143 // buy
						if( Lower_Band > 309.324 )
							if( basis <= 367.618 )
								if( basis <= 355.763 )
									ret := -0.003305
								if( basis > 355.763 )
									ret := -0.595349
							if( basis > 367.618 )
								if( Lower_Band <= 372.63 )
									ret := 0.587786
								if( Lower_Band > 372.63 )
									ret := 0.028641
					if( bullPower > 2.67314 )
						if( basis <= 322.338 )
							if( Lower_Band <= 315.286 )
								if( Upper_Band <= 318.64 )
									ret := 0.310345
								if( Upper_Band > 318.64 )
									ret := -0.197943
							if( Lower_Band > 315.286 )
								if( Lower_Band <= 317.264 )
									ret := 0.693548
								if( Lower_Band > 317.264 )
									ret := -0.434783
						if( basis > 322.338 )
							if( Lower_Band <= 315.247 )
								if( bbp <= 4.43716 )
									ret := -0.047619
								if( bbp > 4.43716 )
									ret := -0.890411 // sell
							if( Lower_Band > 315.247 )
								if( bullPower <= 18.8518 )
									ret := -0.208760
								if( bullPower > 18.8518 )
									ret := 0.909091 // buy
			if( Lower_Band > 416.326 )
				if( basis <= 500.557 )
					if( Upper_Band <= 474.198 )
						if( bullPower <= 7.59196 )
							if( Upper_Band <= 436.329 )
								if( basis <= 427.722 )
									ret := 0.584416
								if( basis > 427.722 )
									ret := -0.739130 // sell
							if( Upper_Band > 436.329 )
								if( Lower_Band <= 457.763 )
									ret := 0.977941 // buy
								if( Lower_Band > 457.763 )
									ret := 0.185185
						if( bullPower > 7.59196 )
							if( basis <= 442.61 )
								ret := -1.000000 // sell
							if( basis > 442.61 )
								ret := 0.000000
					if( Upper_Band > 474.198 )
						if( basis <= 482.256 )
							if( bullPower <= 6.38931 )
								if( Upper_Band <= 493.52 )
									ret := -0.200000
								if( Upper_Band > 493.52 )
									ret := -0.807692 // sell
							if( bullPower > 6.38931 )
								if( bearPower <= 3.94752 )
									ret := 0.678571
								if( bearPower > 3.94752 )
									ret := -0.636364
						if( basis > 482.256 )
							if( basis <= 496.063 )
								if( Upper_Band <= 490.118 )
									ret := 0.603774
								if( Upper_Band > 490.118 )
									ret := 0.226852
							if( basis > 496.063 )
								if( Upper_Band <= 506.229 )
									ret := 0.466667
								if( Upper_Band > 506.229 )
									ret := 0.877193 // buy
				if( basis > 500.557 )
					if( basis <= 584.517 )
						if( Upper_Band <= 583.657 )
							if( Lower_Band <= 497.811 )
								if( Lower_Band <= 484.348 )
									ret := 1.000000 // buy
								if( Lower_Band > 484.348 )
									ret := -0.547009
							if( Lower_Band > 497.811 )
								if( basis <= 580.212 )
									ret := 0.072022
								if( basis > 580.212 )
									ret := 0.375758
						if( Upper_Band > 583.657 )
							if( basis <= 566.735 )
								if( basis <= 550.49 )
									ret := -1.000000 // sell
								if( basis > 550.49 )
									ret := 0.968750 // buy
							if( basis > 566.735 )
								if( Lower_Band <= 560.366 )
									ret := -0.821429 // sell
								if( Lower_Band > 560.366 )
									ret := -0.105500
					if( basis > 584.517 )
						if( Upper_Band <= 622.101 )
							if( Upper_Band <= 592.794 )
								if( bullPower <= 3.67985 )
									ret := 0.343750
								if( bullPower > 3.67985 )
									ret := -0.518519
							if( Upper_Band > 592.794 )
								if( bbp <= 9.62355 )
									ret := 0.723270 // buy
								if( bbp > 9.62355 )
									ret := 0.205128
						if( Upper_Band > 622.101 )
							ret := -1.000000 // sell
		if( Lower_Band > 580.881 )
			if( Upper_Band <= 639.389 )
				if( basis <= 613.678 )
					if( Lower_Band <= 608.534 )
						if( basis <= 609.703 )
							if( basis <= 594.615 )
								if( Upper_Band <= 596.691 )
									ret := -0.069767
								if( Upper_Band > 596.691 )
									ret := -0.314286
							if( basis > 594.615 )
								if( Upper_Band <= 612.45 )
									ret := -0.034779
								if( Upper_Band > 612.45 )
									ret := 0.310811
						if( basis > 609.703 )
							if( bbm <= 5.37425 )
								if( Lower_Band <= 604.983 )
									ret := -0.737500 // sell
								if( Lower_Band > 604.983 )
									ret := 0.028986
							if( bbm > 5.37425 )
								if( bbm <= 8.00016 )
									ret := 1.000000 // buy
								if( bbm > 8.00016 )
									ret := 0.750000 // buy
					if( Lower_Band > 608.534 )
						if( bbm <= 1.65 )
							ret := 0.000000
						if( bbm > 1.65 )
							if( Lower_Band <= 609.502 )
								if( Upper_Band <= 614.317 )
									ret := 0.500000
								if( Upper_Band > 614.317 )
									ret := 0.944444 // buy
							if( Lower_Band > 609.502 )
								ret := 0.400000
				if( basis > 613.678 )
					if( bullPower <= -0.025252 )
						ret := 1.000000 // buy
					if( bullPower > -0.025252 )
						if( Lower_Band <= 604.245 )
							if( Upper_Band <= 634.914 )
								if( bearPower <= 3.09437 )
									ret := 0.750000 // buy
								if( bearPower > 3.09437 )
									ret := 1.000000 // buy
							if( Upper_Band > 634.914 )
								if( Upper_Band <= 636.621 )
									ret := -0.888889 // sell
								if( Upper_Band > 636.621 )
									ret := 0.000000
						if( Lower_Band > 604.245 )
							if( Upper_Band <= 623.238 )
								if( Upper_Band <= 618.347 )
									ret := -0.130435
								if( Upper_Band > 618.347 )
									ret := -0.756522 // sell
							if( Upper_Band > 623.238 )
								if( basis <= 629.926 )
									ret := -0.192857
								if( basis > 629.926 )
									ret := -0.863636 // sell
			if( Upper_Band > 639.389 )
				if( basis <= 672.231 )
					if( basis <= 644.117 )
						if( Lower_Band <= 620.422 )
							if( basis <= 626.859 )
								if( bbm <= 2.71583 )
									ret := 0.750000 // buy
								if( bbm > 2.71583 )
									ret := 1.000000 // buy
							if( basis > 626.859 )
								if( Upper_Band <= 649.957 )
									ret := 0.500000
								if( Upper_Band > 649.957 )
									ret := 0.250000
						if( Lower_Band > 620.422 )
							if( bearPower <= -0.047201 )
								ret := 0.750000 // buy
							if( bearPower > -0.047201 )
								ret := 1.000000 // buy
					if( basis > 644.117 )
						if( bullPower <= 10.7015 )
							if( basis <= 652.936 )
								if( bbm <= 2.3 )
									ret := 0.888889 // buy
								if( bbm > 2.3 )
									ret := 0.000000
							if( basis > 652.936 )
								if( basis <= 667.868 )
									ret := 0.714286 // buy
								if( basis > 667.868 )
									ret := 1.000000 // buy
						if( bullPower > 10.7015 )
							ret := -0.200000
				if( basis > 672.231 )
					if( Lower_Band <= 694.797 )
						if( bbm <= 1.58186 )
							if( bbm <= 0.761035 )
								if( basis <= 678.913 )
									ret := -1.000000 // sell
								if( basis > 678.913 )
									ret := -0.750000 // sell
							if( bbm > 0.761035 )
								if( bullPower <= 1.89574 )
									ret := -0.294872
								if( bullPower > 1.89574 )
									ret := 0.400000
						if( bbm > 1.58186 )
							if( bbp <= 19.027 )
								if( Upper_Band <= 684.716 )
									ret := -0.071429
								if( Upper_Band > 684.716 )
									ret := 0.564103
							if( bbp > 19.027 )
								ret := -1.000000 // sell
					if( Lower_Band > 694.797 )
						if( bbp <= 4.69174 )
							if( Lower_Band <= 701.993 )
								if( bullPower <= 2.68037 )
									ret := -0.210526
								if( bullPower > 2.68037 )
									ret := -0.785714 // sell
							if( Lower_Band > 701.993 )
								if( basis <= 706.481 )
									ret := 0.750000 // buy
								if( basis > 706.481 )
									ret := 0.250000
						if( bbp > 4.69174 )
							if( basis <= 706.535 )
								if( bearPower <= 1.40101 )
									ret := -1.000000 // sell
								if( bearPower > 1.40101 )
									ret := -0.777778 // sell
							if( basis > 706.535 )
								if( Upper_Band <= 713.098 )
									ret := 0.250000
								if( Upper_Band > 713.098 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_BNBUSDT_15Min_d2629f28(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


