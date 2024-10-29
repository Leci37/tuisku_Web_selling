//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: LINKUSDT_15Min_2BB0_46c2f1a5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_15Min_2BB0_46c2f1a5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_15Min_46c2f1a5(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Lower_Band <= 6.84688 )
		if( bearPower <= -0.070717 )
			if( Lower_Band <= 6.35489 )
				if( bbp <= -0.598962 )
					if( bearPower <= -0.55409 )
						ret := 0.692308
					if( bearPower > -0.55409 )
						ret := 1.000000 // buy
				if( bbp > -0.598962 )
					if( Lower_Band <= 6.07694 )
						if( bearPower <= -0.102816 )
							if( basis <= 5.95766 )
								if( bbm <= 0.062862 )
									ret := -0.529412
								if( bbm > 0.062862 )
									ret := 0.290123
							if( basis > 5.95766 )
								if( Lower_Band <= 5.77696 )
									ret := 0.195122
								if( Lower_Band > 5.77696 )
									ret := 0.768489 // buy
						if( bearPower > -0.102816 )
							if( basis <= 5.87427 )
								if( bbp <= -0.057859 )
									ret := 0.622642
								if( bbp > -0.057859 )
									ret := 0.120000
							if( basis > 5.87427 )
								if( basis <= 5.98793 )
									ret := -0.360000
								if( basis > 5.98793 )
									ret := 0.254054
					if( Lower_Band > 6.07694 )
						if( BBPower_Color <= 0.5 )
							if( Lower_Band <= 6.16258 )
								if( basis <= 6.1732 )
									ret := -0.785714 // sell
								if( basis > 6.1732 )
									ret := -0.123711
							if( Lower_Band > 6.16258 )
								if( bullPower <= -0.097255 )
									ret := -0.095890
								if( bullPower > -0.097255 )
									ret := 0.381703
						if( BBPower_Color > 0.5 )
							ret := 1.000000 // buy
			if( Lower_Band > 6.35489 )
				if( basis <= 7.15221 )
					if( Lower_Band <= 6.44621 )
						if( basis <= 6.45435 )
							if( bbp <= -0.091719 )
								ret := 1.000000 // buy
							if( bbp > -0.091719 )
								ret := 0.777778 // buy
						if( basis > 6.45435 )
							if( bearPower <= -0.224351 )
								ret := 0.500000
							if( bearPower > -0.224351 )
								if( Upper_Band <= 6.80039 )
									ret := -0.179894
								if( Upper_Band > 6.80039 )
									ret := -0.567568
					if( Lower_Band > 6.44621 )
						if( bbm <= 0.046835 )
							if( Upper_Band <= 7.26575 )
								if( basis <= 6.98093 )
									ret := 0.401015
								if( basis > 6.98093 )
									ret := 0.909091 // buy
							if( Upper_Band > 7.26575 )
								if( Upper_Band <= 7.3085 )
									ret := -0.611111
								if( Upper_Band > 7.3085 )
									ret := 0.071429
						if( bbm > 0.046835 )
							if( Lower_Band <= 6.81854 )
								if( basis <= 6.97746 )
									ret := 0.128778
								if( basis > 6.97746 )
									ret := -0.309524
							if( Lower_Band > 6.81854 )
								if( bbp <= -0.231538 )
									ret := 0.279070
								if( bbp > -0.231538 )
									ret := -0.422535
				if( basis > 7.15221 )
					if( bullPower <= -0.090248 )
						if( Upper_Band <= 7.65666 )
							ret := 1.000000 // buy
						if( Upper_Band > 7.65666 )
							ret := 0.466667
					if( bullPower > -0.090248 )
						ret := 0.066667
		if( bearPower > -0.070717 )
			if( Upper_Band <= 6.86648 )
				if( Lower_Band <= 5.83576 )
					if( Lower_Band <= 5.78333 )
						if( bearPower <= 0.01043 )
							if( bbp <= -0.07906 )
								if( bbm <= 0.033444 )
									ret := 0.315789
								if( bbm > 0.033444 )
									ret := 0.916667 // buy
							if( bbp > -0.07906 )
								if( bearPower <= -0.051283 )
									ret := -0.189189
								if( bearPower > -0.051283 )
									ret := 0.028372
						if( bearPower > 0.01043 )
							if( bearPower <= 0.149405 )
								if( Upper_Band <= 5.45509 )
									ret := -0.088889
								if( Upper_Band > 5.45509 )
									ret := 0.338346
							if( bearPower > 0.149405 )
								if( Lower_Band <= 5.31871 )
									ret := -0.250000
								if( Lower_Band > 5.31871 )
									ret := -0.785714 // sell
					if( Lower_Band > 5.78333 )
						if( Upper_Band <= 6.17559 )
							if( bbm <= 0.030166 )
								if( bullPower <= 0.005956 )
									ret := -0.231884
								if( bullPower > 0.005956 )
									ret := 0.582677
							if( bbm > 0.030166 )
								if( Lower_Band <= 5.80205 )
									ret := 0.989796 // buy
								if( Lower_Band > 5.80205 )
									ret := 0.620253
						if( Upper_Band > 6.17559 )
							if( bbm <= 0.036054 )
								ret := 0.000000
							if( bbm > 0.036054 )
								if( bearPower <= 0.023105 )
									ret := -0.227273
								if( bearPower > 0.023105 )
									ret := -0.800000 // sell
				if( Lower_Band > 5.83576 )
					if( bbp <= 0.125268 )
						if( bbm <= 0.079541 )
							if( bbm <= 0.052007 )
								if( bullPower <= -0.039137 )
									ret := -0.702703 // sell
								if( bullPower > -0.039137 )
									ret := -0.018468
							if( bbm > 0.052007 )
								if( Upper_Band <= 6.82564 )
									ret := 0.132278
								if( Upper_Band > 6.82564 )
									ret := -0.328671
						if( bbm > 0.079541 )
							if( bbm <= 0.140328 )
								if( Lower_Band <= 5.94801 )
									ret := 0.310345
								if( Lower_Band > 5.94801 )
									ret := -0.295050
							if( bbm > 0.140328 )
								if( bearPower <= -0.035959 )
									ret := 0.727273 // buy
								if( bearPower > -0.035959 )
									ret := 0.083333
					if( bbp > 0.125268 )
						if( bbp <= 0.391331 )
							if( Upper_Band <= 6.55444 )
								if( Upper_Band <= 6.3495 )
									ret := 0.357143
								if( Upper_Band > 6.3495 )
									ret := -0.349558
							if( Upper_Band > 6.55444 )
								if( Lower_Band <= 6.37317 )
									ret := 0.511261
								if( Lower_Band > 6.37317 )
									ret := 0.010204
						if( bbp > 0.391331 )
							if( bbm <= 0.133235 )
								ret := -0.941176 // sell
							if( bbm > 0.133235 )
								ret := -0.750000 // sell
			if( Upper_Band > 6.86648 )
				if( Lower_Band <= 6.82823 )
					if( bearPower <= 0.025656 )
						if( bullPower <= 0.142122 )
							if( basis <= 7.0159 )
								if( basis <= 6.75122 )
									ret := -0.393548
								if( basis > 6.75122 )
									ret := 0.182324
							if( basis > 7.0159 )
								if( BBPower_Color <= 0.5 )
									ret := -0.867925 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.378378
						if( bullPower > 0.142122 )
							if( Lower_Band <= 6.65798 )
								ret := 1.000000 // buy
							if( Lower_Band > 6.65798 )
								ret := 0.625000
					if( bearPower > 0.025656 )
						if( Upper_Band <= 7.00749 )
							if( Lower_Band <= 6.76836 )
								if( bbp <= 0.329035 )
									ret := -0.390887
								if( bbp > 0.329035 )
									ret := 0.385714
							if( Lower_Band > 6.76836 )
								if( bullPower <= 0.095843 )
									ret := 0.149123
								if( bullPower > 0.095843 )
									ret := -0.583333
						if( Upper_Band > 7.00749 )
							if( Lower_Band <= 6.23738 )
								if( bearPower <= 0.164953 )
									ret := 0.941176 // buy
								if( bearPower > 0.164953 )
									ret := 0.000000
							if( Lower_Band > 6.23738 )
								if( bearPower <= 0.205165 )
									ret := 0.058154
								if( bearPower > 0.205165 )
									ret := 0.660377
				if( Lower_Band > 6.82823 )
					if( bbp <= 0.306845 )
						if( Upper_Band <= 7.09115 )
							if( bearPower <= -0.030429 )
								if( basis <= 6.94224 )
									ret := 0.595745
								if( basis > 6.94224 )
									ret := 1.000000 // buy
							if( bearPower > -0.030429 )
								if( Lower_Band <= 6.8456 )
									ret := 0.410926
								if( Lower_Band > 6.8456 )
									ret := -0.074074
						if( Upper_Band > 7.09115 )
							if( Lower_Band <= 6.83141 )
								if( bbm <= 0.04853 )
									ret := 0.857143 // buy
								if( bbm > 0.04853 )
									ret := -0.090909
							if( Lower_Band > 6.83141 )
								if( basis <= 6.97761 )
									ret := -0.555556
								if( basis > 6.97761 )
									ret := 0.094737
					if( bbp > 0.306845 )
						ret := -1.000000 // sell
	if( Lower_Band > 6.84688 )
		if( Lower_Band <= 20.2736 )
			if( Lower_Band <= 9.06732 )
				if( Upper_Band <= 9.38097 )
					if( basis <= 8.67427 )
						if( bearPower <= -0.06496 )
							if( bbp <= -0.602685 )
								if( Upper_Band <= 9.00581 )
									ret := 0.500000
								if( Upper_Band > 9.00581 )
									ret := 1.000000 // buy
							if( bbp > -0.602685 )
								if( bullPower <= -0.136161 )
									ret := -0.300000
								if( bullPower > -0.136161 )
									ret := 0.071104
						if( bearPower > -0.06496 )
							if( bbp <= 0.128938 )
								if( Upper_Band <= 7.06398 )
									ret := -0.140427
								if( Upper_Band > 7.06398 )
									ret := -0.035934
							if( bbp > 0.128938 )
								if( Lower_Band <= 8.14132 )
									ret := -0.194310
								if( Lower_Band > 8.14132 )
									ret := 0.186312
					if( basis > 8.67427 )
						if( basis <= 8.88831 )
							if( bearPower <= -0.087519 )
								if( basis <= 8.86676 )
									ret := 0.142180
								if( basis > 8.86676 )
									ret := -0.766667 // sell
							if( bearPower > -0.087519 )
								if( Lower_Band <= 8.64911 )
									ret := -0.643182
								if( Lower_Band > 8.64911 )
									ret := -0.283019
						if( basis > 8.88831 )
							if( basis <= 9.17638 )
								if( bearPower <= -0.170401 )
									ret := -0.489796
								if( bearPower > -0.170401 )
									ret := 0.146520
							if( basis > 9.17638 )
								if( Lower_Band <= 9.03208 )
									ret := -1.000000 // sell
								if( Lower_Band > 9.03208 )
									ret := -0.454545
				if( Upper_Band > 9.38097 )
					if( bearPower <= 0.277924 )
						if( bbm <= 0.595797 )
							if( bearPower <= -0.048737 )
								if( bbp <= -0.183657 )
									ret := -0.614815
								if( bbp > -0.183657 )
									ret := -0.966667 // sell
							if( bearPower > -0.048737 )
								if( bbp <= 0.283614 )
									ret := -0.343284
								if( bbp > 0.283614 )
									ret := -0.818182 // sell
						if( bbm > 0.595797 )
							ret := 0.846154 // buy
					if( bearPower > 0.277924 )
						ret := 1.000000 // buy
			if( Lower_Band > 9.06732 )
				if( bearPower <= -0.383937 )
					if( basis <= 10.977 )
						if( Upper_Band <= 11.538 )
							ret := 0.666667
						if( Upper_Band > 11.538 )
							ret := -0.857143 // sell
					if( basis > 10.977 )
						if( bbp <= -0.634659 )
							if( Upper_Band <= 20.1057 )
								if( basis <= 18.5098 )
									ret := 0.621818
								if( basis > 18.5098 )
									ret := 0.882353 // buy
							if( Upper_Band > 20.1057 )
								if( Upper_Band <= 21.6286 )
									ret := 0.138462
								if( Upper_Band > 21.6286 )
									ret := 0.928571 // buy
						if( bbp > -0.634659 )
							if( basis <= 20.1874 )
								if( basis <= 19.3668 )
									ret := 0.316384
								if( basis > 19.3668 )
									ret := -0.576923
							if( basis > 20.1874 )
								if( bearPower <= -0.400422 )
									ret := 0.444444
								if( bearPower > -0.400422 )
									ret := 1.000000 // buy
				if( bearPower > -0.383937 )
					if( bbp <= -0.117455 )
						if( bbm <= 0.197208 )
							if( basis <= 16.3467 )
								if( Lower_Band <= 16.0791 )
									ret := 0.058193
								if( Lower_Band > 16.0791 )
									ret := -0.797297 // sell
							if( basis > 16.3467 )
								if( Lower_Band <= 16.5426 )
									ret := 0.630000
								if( Lower_Band > 16.5426 )
									ret := 0.145546
						if( bbm > 0.197208 )
							if( bullPower <= -0.139196 )
								if( Lower_Band <= 13.8756 )
									ret := 0.052632
								if( Lower_Band > 13.8756 )
									ret := -0.648649
							if( bullPower > -0.139196 )
								if( basis <= 14.9401 )
									ret := 0.083582
								if( basis > 14.9401 )
									ret := -0.103321
					if( bbp > -0.117455 )
						if( basis <= 20.0252 )
							if( bbp <= -0.080418 )
								if( bearPower <= -0.126571 )
									ret := -0.481229
								if( bearPower > -0.126571 )
									ret := -0.066415
							if( bbp > -0.080418 )
								if( basis <= 19.7678 )
									ret := -0.006485
								if( basis > 19.7678 )
									ret := 0.226601
						if( basis > 20.0252 )
							if( Lower_Band <= 19.9841 )
								if( Lower_Band <= 19.8054 )
									ret := -0.308411
								if( Lower_Band > 19.8054 )
									ret := -0.538117
							if( Lower_Band > 19.9841 )
								if( bullPower <= 0.058162 )
									ret := 0.376712
								if( bullPower > 0.058162 )
									ret := -0.286174
		if( Lower_Band > 20.2736 )
			if( basis <= 21.0152 )
				if( bbm <= 0.093787 )
					if( Upper_Band <= 21.0459 )
						if( Lower_Band <= 20.4228 )
							if( basis <= 20.5036 )
								ret := 0.100000
							if( basis > 20.5036 )
								ret := -0.368421
						if( Lower_Band > 20.4228 )
							if( bbm <= 0.075879 )
								if( Lower_Band <= 20.4791 )
									ret := 0.181818
								if( Lower_Band > 20.4791 )
									ret := -0.153846
							if( bbm > 0.075879 )
								ret := 0.714286 // buy
					if( Upper_Band > 21.0459 )
						if( Upper_Band <= 21.2742 )
							ret := -1.000000 // sell
						if( Upper_Band > 21.2742 )
							ret := -0.833333 // sell
				if( bbm > 0.093787 )
					if( bullPower <= 0.027706 )
						if( bearPower <= -0.098783 )
							if( bbp <= -0.147654 )
								if( bbm <= 0.107723 )
									ret := -0.960000 // sell
								if( bbm > 0.107723 )
									ret := -0.775510 // sell
							if( bbp > -0.147654 )
								if( bullPower <= 0.002751 )
									ret := -0.823529 // sell
								if( bullPower > 0.002751 )
									ret := -1.000000 // sell
						if( bearPower > -0.098783 )
							ret := -0.454545
					if( bullPower > 0.027706 )
						if( Upper_Band <= 20.699 )
							if( bbm <= 0.105646 )
								ret := -0.400000
							if( bbm > 0.105646 )
								if( Upper_Band <= 20.67 )
									ret := 0.363636
								if( Upper_Band > 20.67 )
									ret := 0.846154 // buy
						if( Upper_Band > 20.699 )
							if( Upper_Band <= 20.9359 )
								if( bbm <= 0.108614 )
									ret := -0.681818
								if( bbm > 0.108614 )
									ret := -0.907895 // sell
							if( Upper_Band > 20.9359 )
								if( bearPower <= -0.054442 )
									ret := 0.833333 // buy
								if( bearPower > -0.054442 )
									ret := -0.395349
			if( basis > 21.0152 )
				if( basis <= 21.1004 )
					if( bbp <= -0.044193 )
						ret := 0.583333
					if( bbp > -0.044193 )
						ret := 0.533333
				if( basis > 21.1004 )
					if( Lower_Band <= 20.778 )
						if( bearPower <= -0.271034 )
							ret := -0.400000
						if( bearPower > -0.271034 )
							ret := -1.000000 // sell
					if( Lower_Band > 20.778 )
						if( bbm <= 0.140293 )
							if( bearPower <= -0.093145 )
								if( bbm <= 0.09645 )
									ret := 0.333333
								if( bbm > 0.09645 )
									ret := -0.216216
							if( bearPower > -0.093145 )
								if( basis <= 21.3388 )
									ret := -0.635135
								if( basis > 21.3388 )
									ret := -1.000000 // sell
						if( bbm > 0.140293 )
							if( Upper_Band <= 21.5235 )
								if( bearPower <= -0.069174 )
									ret := -0.763158 // sell
								if( bearPower > -0.069174 )
									ret := -0.083333
							if( Upper_Band > 21.5235 )
								if( bbp <= 0.090419 )
									ret := 0.657534
								if( bbp > 0.090419 )
									ret := 0.300000
	
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
float op_operation = decision_tree_0_LINKUSDT_15Min_46c2f1a5(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


