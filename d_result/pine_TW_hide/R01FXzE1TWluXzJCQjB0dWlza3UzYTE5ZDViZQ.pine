//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: GME_15Min_2BB0_3a19d5be Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2BB0_3a19d5be", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_3a19d5be(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.01435 )
		if( basis <= 5.45518 )
			if( bbm <= 0.009986 )
				if( bearPower <= -0.008293 )
					if( Lower_Band <= 3.75285 )
						if( Lower_Band <= 3.30301 )
							if( bearPower <= -0.014747 )
								if( basis <= 3.37493 )
									ret := 0.923077 // buy
								if( basis > 3.37493 )
									ret := 1.000000 // buy
							if( bearPower > -0.014747 )
								ret := 0.500000
						if( Lower_Band > 3.30301 )
							if( bearPower <= -0.077768 )
								if( Lower_Band <= 3.59838 )
									ret := 0.882353 // buy
								if( Lower_Band > 3.59838 )
									ret := -0.500000
							if( bearPower > -0.077768 )
								if( basis <= 3.59882 )
									ret := -0.512821
								if( basis > 3.59882 )
									ret := 0.190476
					if( Lower_Band > 3.75285 )
						if( Upper_Band <= 3.96828 )
							ret := 1.000000 // buy
						if( Upper_Band > 3.96828 )
							if( bearPower <= -0.03586 )
								if( Upper_Band <= 5.38059 )
									ret := 0.653386
								if( Upper_Band > 5.38059 )
									ret := 0.052632
							if( bearPower > -0.03586 )
								if( bearPower <= -0.023149 )
									ret := 0.147887
								if( bearPower > -0.023149 )
									ret := 0.518519
				if( bearPower > -0.008293 )
					if( Lower_Band <= 4.91834 )
						if( Lower_Band <= 3.82331 )
							if( basis <= 3.07893 )
								ret := -0.857143 // sell
							if( basis > 3.07893 )
								if( bbp <= 0.013497 )
									ret := 0.166667
								if( bbp > 0.013497 )
									ret := 0.857143 // buy
						if( Lower_Band > 3.82331 )
							if( basis <= 4.86965 )
								if( Upper_Band <= 4.80268 )
									ret := 0.016461
								if( Upper_Band > 4.80268 )
									ret := 0.791667 // buy
							if( basis > 4.86965 )
								if( basis <= 5.03002 )
									ret := -1.000000 // sell
								if( basis > 5.03002 )
									ret := -0.500000
					if( Lower_Band > 4.91834 )
						if( bbp <= 0.016438 )
							if( Upper_Band <= 5.51675 )
								if( Upper_Band <= 5.4167 )
									ret := 0.375000
								if( Upper_Band > 5.4167 )
									ret := 1.000000 // buy
							if( Upper_Band > 5.51675 )
								ret := 0.000000
						if( bbp > 0.016438 )
							if( bullPower <= 0.010847 )
								ret := 0.666667
							if( bullPower > 0.010847 )
								if( Upper_Band <= 5.40175 )
									ret := 0.857143 // buy
								if( Upper_Band > 5.40175 )
									ret := 1.000000 // buy
			if( bbm > 0.009986 )
				if( bbm <= 0.381651 )
					if( Upper_Band <= 5.42572 )
						if( Lower_Band <= 3.98455 )
							if( basis <= 4.01074 )
								if( bullPower <= 0.094163 )
									ret := 0.173203
								if( bullPower > 0.094163 )
									ret := -0.168421
							if( basis > 4.01074 )
								if( bbm <= 0.025102 )
									ret := 0.089744
								if( bbm > 0.025102 )
									ret := 0.492991
						if( Lower_Band > 3.98455 )
							if( Upper_Band <= 5.25786 )
								if( Lower_Band <= 4.47929 )
									ret := 0.056818
								if( Lower_Band > 4.47929 )
									ret := 0.229319
							if( Upper_Band > 5.25786 )
								if( Lower_Band <= 5.0752 )
									ret := -0.311258
								if( Lower_Band > 5.0752 )
									ret := 0.246377
					if( Upper_Band > 5.42572 )
						if( bullPower <= -0.010431 )
							if( Lower_Band <= 4.86398 )
								if( basis <= 5.15459 )
									ret := 0.875000 // buy
								if( basis > 5.15459 )
									ret := 0.400000
							if( Lower_Band > 4.86398 )
								if( Upper_Band <= 5.54529 )
									ret := 0.285714
								if( Upper_Band > 5.54529 )
									ret := -0.318681
						if( bullPower > -0.010431 )
							if( bbp <= 0.085723 )
								if( Upper_Band <= 5.46217 )
									ret := 0.136364
								if( Upper_Band > 5.46217 )
									ret := 0.540230
							if( bbp > 0.085723 )
								if( Upper_Band <= 5.62441 )
									ret := -0.466667
								if( Upper_Band > 5.62441 )
									ret := 0.600000
				if( bbm > 0.381651 )
					if( Lower_Band <= 4.43768 )
						ret := 0.166667
					if( Lower_Band > 4.43768 )
						ret := -1.000000 // sell
		if( basis > 5.45518 )
			if( bearPower <= -34.5109 )
				if( basis <= 121.016 )
					ret := -0.750000 // sell
				if( basis > 121.016 )
					if( bbp <= -32.2459 )
						if( bullPower <= 6.1537 )
							if( bearPower <= -41.5715 )
								if( Upper_Band <= 359.479 )
									ret := 0.392857
								if( Upper_Band > 359.479 )
									ret := 0.825000 // buy
							if( bearPower > -41.5715 )
								ret := 1.000000 // buy
						if( bullPower > 6.1537 )
							ret := -0.600000
					if( bbp > -32.2459 )
						if( Upper_Band <= 433.722 )
							ret := 0.250000
						if( Upper_Band > 433.722 )
							ret := -1.000000 // sell
			if( bearPower > -34.5109 )
				if( bullPower <= -0.068603 )
					if( basis <= 13.0291 )
						if( bbm <= 0.182772 )
							if( bbm <= 0.029706 )
								if( bbm <= 4e-06 )
									ret := 0.354167
								if( bbm > 4e-06 )
									ret := 0.702899 // buy
							if( bbm > 0.029706 )
								if( bbm <= 0.056049 )
									ret := 0.088235
								if( bbm > 0.056049 )
									ret := 0.305590
						if( bbm > 0.182772 )
							if( bearPower <= -0.470189 )
								if( Lower_Band <= 5.54406 )
									ret := 1.000000 // buy
								if( Lower_Band > 5.54406 )
									ret := -0.549296
							if( bearPower > -0.470189 )
								if( Lower_Band <= 9.60028 )
									ret := -0.207547
								if( Lower_Band > 9.60028 )
									ret := 0.288462
					if( basis > 13.0291 )
						if( bearPower <= -9.80752 )
							if( Lower_Band <= 233.26 )
								if( basis <= 240.938 )
									ret := -0.089450
								if( basis > 240.938 )
									ret := -0.689655
							if( Lower_Band > 233.26 )
								if( Lower_Band <= 297.508 )
									ret := 0.380952
								if( Lower_Band > 297.508 )
									ret := -0.529412
						if( bearPower > -9.80752 )
							if( basis <= 14.1778 )
								if( bullPower <= -0.43186 )
									ret := -0.750000 // sell
								if( bullPower > -0.43186 )
									ret := -0.030252
							if( basis > 14.1778 )
								if( Upper_Band <= 14.5725 )
									ret := 0.698413
								if( Upper_Band > 14.5725 )
									ret := 0.098518
				if( bullPower > -0.068603 )
					if( basis <= 154.167 )
						if( Lower_Band <= 139.935 )
							if( basis <= 140.532 )
								if( Upper_Band <= 134.377 )
									ret := 0.044895
								if( Upper_Band > 134.377 )
									ret := 0.245704
							if( basis > 140.532 )
								if( basis <= 147.329 )
									ret := -0.473684
								if( basis > 147.329 )
									ret := 0.575000
						if( Lower_Band > 139.935 )
							if( bearPower <= -0.480884 )
								if( Upper_Band <= 147.07 )
									ret := 0.780822 // buy
								if( Upper_Band > 147.07 )
									ret := 0.300283
							if( bearPower > -0.480884 )
								if( Lower_Band <= 151.129 )
									ret := -0.069869
								if( Lower_Band > 151.129 )
									ret := 0.437500
					if( basis > 154.167 )
						if( Lower_Band <= 228.059 )
							if( bbp <= -3.74144 )
								if( Lower_Band <= 225.039 )
									ret := -0.493333
								if( Lower_Band > 225.039 )
									ret := 0.714286 // buy
							if( bbp > -3.74144 )
								if( Upper_Band <= 160.445 )
									ret := -0.358974
								if( Upper_Band > 160.445 )
									ret := -0.022365
						if( Lower_Band > 228.059 )
							if( Upper_Band <= 259.621 )
								if( Upper_Band <= 241.353 )
									ret := -0.500000
								if( Upper_Band > 241.353 )
									ret := 0.659091
							if( Upper_Band > 259.621 )
								if( bullPower <= 22.3248 )
									ret := 0.044010
								if( bullPower > 22.3248 )
									ret := -0.947368 // sell
	if( bearPower > 0.01435 )
		if( bbm <= 0.024997 )
			if( basis <= 13.0656 )
				if( Upper_Band <= 3.36907 )
					if( bullPower <= 0.111117 )
						if( bbp <= 0.039511 )
							ret := 0.500000
						if( bbp > 0.039511 )
							if( Lower_Band <= 3.13701 )
								ret := 1.000000 // buy
							if( Lower_Band > 3.13701 )
								ret := 0.800000 // buy
					if( bullPower > 0.111117 )
						ret := 0.250000
				if( Upper_Band > 3.36907 )
					if( bullPower <= 0.032029 )
						if( basis <= 5.96511 )
							if( basis <= 4.96559 )
								if( basis <= 4.37678 )
									ret := 0.176923
								if( basis > 4.37678 )
									ret := -0.263158
							if( basis > 4.96559 )
								if( basis <= 5.2382 )
									ret := 0.956522 // buy
								if( basis > 5.2382 )
									ret := 0.322034
						if( basis > 5.96511 )
							if( Lower_Band <= 9.95948 )
								if( Upper_Band <= 6.16378 )
									ret := -1.000000 // sell
								if( Upper_Band > 6.16378 )
									ret := -0.471698
							if( Lower_Band > 9.95948 )
								if( Upper_Band <= 12.5361 )
									ret := -0.064516
								if( Upper_Band > 12.5361 )
									ret := 0.111111
					if( bullPower > 0.032029 )
						if( Upper_Band <= 9.01749 )
							if( bearPower <= 0.048085 )
								if( Lower_Band <= 3.96105 )
									ret := 0.020408
								if( Lower_Band > 3.96105 )
									ret := -0.339066
							if( bearPower > 0.048085 )
								if( bbp <= 0.426162 )
									ret := -0.529304
								if( bbp > 0.426162 )
									ret := 0.071429
						if( Upper_Band > 9.01749 )
							if( Lower_Band <= 10.3435 )
								if( bbp <= 0.281524 )
									ret := -0.037037
								if( bbp > 0.281524 )
									ret := 0.523810
							if( Lower_Band > 10.3435 )
								if( bullPower <= 0.155527 )
									ret := -0.222628
								if( bullPower > 0.155527 )
									ret := -0.690909
			if( basis > 13.0656 )
				if( BBPower_Color <= 0.5 )
					if( Upper_Band <= 151.345 )
						ret := 1.000000 // buy
					if( Upper_Band > 151.345 )
						if( bbp <= 0.506272 )
							if( bbp <= 0.238742 )
								ret := 1.000000 // buy
							if( bbp > 0.238742 )
								ret := -0.200000
						if( bbp > 0.506272 )
							ret := 1.000000 // buy
				if( BBPower_Color > 0.5 )
					if( Lower_Band <= 13.4116 )
						if( Upper_Band <= 13.6574 )
							if( Lower_Band <= 13.3933 )
								if( basis <= 13.4668 )
									ret := 0.088235
								if( basis > 13.4668 )
									ret := -0.625000
							if( Lower_Band > 13.3933 )
								ret := 1.000000 // buy
						if( Upper_Band > 13.6574 )
							if( Upper_Band <= 14.0219 )
								if( basis <= 13.5477 )
									ret := 0.739130 // buy
								if( basis > 13.5477 )
									ret := 0.000000
							if( Upper_Band > 14.0219 )
								ret := 0.000000
					if( Lower_Band > 13.4116 )
						if( Lower_Band <= 16.451 )
							if( bbp <= 0.194563 )
								if( Upper_Band <= 16.5965 )
									ret := -0.063391
								if( Upper_Band > 16.5965 )
									ret := -0.555556
							if( bbp > 0.194563 )
								if( bullPower <= 0.134392 )
									ret := -0.333333
								if( bullPower > 0.134392 )
									ret := -0.642857
						if( Lower_Band > 16.451 )
							if( Upper_Band <= 18.8278 )
								if( bearPower <= 0.073043 )
									ret := 0.166008
								if( bearPower > 0.073043 )
									ret := -0.192308
							if( Upper_Band > 18.8278 )
								if( Lower_Band <= 21.5495 )
									ret := -0.206823
								if( Lower_Band > 21.5495 )
									ret := -0.061661
		if( bbm > 0.024997 )
			if( bearPower <= 9.96302 )
				if( bbp <= 2.2159 )
					if( bbp <= 0.179731 )
						if( basis <= 4.04193 )
							if( basis <= 3.95613 )
								if( Upper_Band <= 4.12414 )
									ret := 0.205323
								if( Upper_Band > 4.12414 )
									ret := -0.750000 // sell
							if( basis > 3.95613 )
								if( bearPower <= 0.054733 )
									ret := 0.733333 // buy
								if( bearPower > 0.054733 )
									ret := 0.000000
						if( basis > 4.04193 )
							if( basis <= 4.09877 )
								if( bearPower <= 0.028558 )
									ret := -0.344828
								if( bearPower > 0.028558 )
									ret := -0.866667 // sell
							if( basis > 4.09877 )
								if( basis <= 4.12126 )
									ret := 0.833333 // buy
								if( basis > 4.12126 )
									ret := 0.024703
					if( bbp > 0.179731 )
						if( basis <= 4.9319 )
							if( bbp <= 0.457096 )
								if( Lower_Band <= 4.51675 )
									ret := -0.193023
								if( Lower_Band > 4.51675 )
									ret := -0.979167 // sell
							if( bbp > 0.457096 )
								if( bbm <= 0.192724 )
									ret := -0.722222 // sell
								if( bbm > 0.192724 )
									ret := -1.000000 // sell
						if( basis > 4.9319 )
							if( basis <= 11.4706 )
								if( Lower_Band <= 4.51669 )
									ret := -0.950000 // sell
								if( Lower_Band > 4.51669 )
									ret := 0.126407
							if( basis > 11.4706 )
								if( basis <= 12.8454 )
									ret := -0.298405
								if( basis > 12.8454 )
									ret := -0.017371
				if( bbp > 2.2159 )
					if( Upper_Band <= 123.532 )
						if( bbm <= 4.01651 )
							if( basis <= 96.3333 )
								if( Lower_Band <= 48.8624 )
									ret := 0.201705
								if( Lower_Band > 48.8624 )
									ret := 0.517150
							if( basis > 96.3333 )
								if( Lower_Band <= 99.3618 )
									ret := -0.095652
								if( Lower_Band > 99.3618 )
									ret := 0.226619
						if( bbm > 4.01651 )
							if( Upper_Band <= 114.896 )
								if( bbp <= 21.4127 )
									ret := -0.386598
								if( bbp > 21.4127 )
									ret := 0.333333
							if( Upper_Band > 114.896 )
								if( Lower_Band <= 62.1391 )
									ret := -0.750000 // sell
								if( Lower_Band > 62.1391 )
									ret := 0.851852 // buy
					if( Upper_Band > 123.532 )
						if( bearPower <= 1.08794 )
							if( basis <= 208.989 )
								if( Upper_Band <= 206.609 )
									ret := 0.078642
								if( Upper_Band > 206.609 )
									ret := -0.301205
							if( basis > 208.989 )
								if( basis <= 213.769 )
									ret := 0.848485 // buy
								if( basis > 213.769 )
									ret := 0.225296
						if( bearPower > 1.08794 )
							if( Lower_Band <= 83.8335 )
								if( basis <= 117.604 )
									ret := 1.000000 // buy
								if( basis > 117.604 )
									ret := 0.500000
							if( Lower_Band > 83.8335 )
								if( Upper_Band <= 368.15 )
									ret := -0.037490
								if( Upper_Band > 368.15 )
									ret := -0.866667 // sell
			if( bearPower > 9.96302 )
				if( basis <= 252.132 )
					if( Upper_Band <= 235.735 )
						if( Upper_Band <= 197.805 )
							if( Lower_Band <= 70.3036 )
								if( Upper_Band <= 75.4104 )
									ret := -1.000000 // sell
								if( Upper_Band > 75.4104 )
									ret := 0.435897
							if( Lower_Band > 70.3036 )
								if( Upper_Band <= 188.908 )
									ret := -0.964286 // sell
								if( Upper_Band > 188.908 )
									ret := 0.600000
						if( Upper_Band > 197.805 )
							ret := -1.000000 // sell
					if( Upper_Band > 235.735 )
						if( bbp <= 98.0853 )
							if( Lower_Band <= 200.642 )
								ret := 1.000000 // buy
							if( Lower_Band > 200.642 )
								ret := 0.750000 // buy
						if( bbp > 98.0853 )
							ret := -1.000000 // sell
				if( basis > 252.132 )
					if( Upper_Band <= 427.706 )
						if( basis <= 311.287 )
							if( Upper_Band <= 390.856 )
								ret := -1.000000 // sell
							if( Upper_Band > 390.856 )
								ret := -0.750000 // sell
						if( basis > 311.287 )
							ret := -0.500000
					if( Upper_Band > 427.706 )
						if( bbm <= 28.415 )
							ret := 0.833333 // buy
						if( bbm > 28.415 )
							if( Upper_Band <= 498.296 )
								ret := 0.000000
							if( Upper_Band > 498.296 )
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
float op_operation = decision_tree_0_GME_15Min_3a19d5be(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


