//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: NVDA_5Min_2BB0_8135d1d1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_2BB0_8135d1d1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_8135d1d1(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbm <= 3.54799 )
		if( bearPower <= -0.025434 )
			if( Lower_Band <= 956.902 )
				if( basis <= 947.168 )
					if( bearPower <= -1.75989 )
						if( Lower_Band <= 402.152 )
							if( bearPower <= -3.33082 )
								if( basis <= 274.357 )
									ret := -0.214286
								if( basis > 274.357 )
									ret := 0.693750
							if( bearPower > -3.33082 )
								if( Lower_Band <= 99.272 )
									ret := -0.698113
								if( Lower_Band > 99.272 )
									ret := 0.139251
						if( Lower_Band > 402.152 )
							if( Lower_Band <= 408.418 )
								if( bbm <= 0.815648 )
									ret := 0.750000 // buy
								if( bbm > 0.815648 )
									ret := -0.355422
							if( Lower_Band > 408.418 )
								if( bbp <= -5.89559 )
									ret := -0.057618
								if( bbp > -5.89559 )
									ret := 0.044881
					if( bearPower > -1.75989 )
						if( basis <= 940.279 )
							if( bbm <= 0.337017 )
								if( Lower_Band <= 97.4075 )
									ret := 0.939394 // buy
								if( Lower_Band > 97.4075 )
									ret := 0.010156
							if( bbm > 0.337017 )
								if( bearPower <= -0.130689 )
									ret := -0.050931
								if( bearPower > -0.130689 )
									ret := 0.020134
						if( basis > 940.279 )
							if( bbp <= 0.463135 )
								if( bbm <= 2.07982 )
									ret := 0.590000
								if( bbm > 2.07982 )
									ret := -0.190476
							if( bbp > 0.463135 )
								if( Lower_Band <= 942.174 )
									ret := 0.000000
								if( Lower_Band > 942.174 )
									ret := -0.800000 // sell
				if( basis > 947.168 )
					if( bbm <= 1.37387 )
						if( bbp <= -2.84816 )
							if( bbp <= -3.46276 )
								ret := -0.363636
							if( bbp > -3.46276 )
								ret := -0.846154 // sell
						if( bbp > -2.84816 )
							if( Upper_Band <= 951.425 )
								if( Upper_Band <= 950.25 )
									ret := 0.000000
								if( Upper_Band > 950.25 )
									ret := 0.891892 // buy
							if( Upper_Band > 951.425 )
								if( Upper_Band <= 951.697 )
									ret := -0.454545
								if( Upper_Band > 951.697 )
									ret := -0.090226
					if( bbm > 1.37387 )
						if( bearPower <= -5.48886 )
							ret := 0.666667
						if( bearPower > -5.48886 )
							if( Upper_Band <= 951.19 )
								ret := 0.916667 // buy
							if( Upper_Band > 951.19 )
								if( basis <= 949.045 )
									ret := -0.860870 // sell
								if( basis > 949.045 )
									ret := -0.336493
			if( Lower_Band > 956.902 )
				if( bbm <= 0.821751 )
					if( Lower_Band <= 1203.7 )
						if( basis <= 1191.99 )
							if( Upper_Band <= 1158.88 )
								if( Upper_Band <= 1037.86 )
									ret := -0.400000
								if( Upper_Band > 1037.86 )
									ret := -0.064516
							if( Upper_Band > 1158.88 )
								ret := -0.526316
						if( basis > 1191.99 )
							ret := 0.500000
					if( Lower_Band > 1203.7 )
						if( Lower_Band <= 1210.14 )
							ret := -0.916667 // sell
						if( Lower_Band > 1210.14 )
							ret := -1.000000 // sell
				if( bbm > 0.821751 )
					if( Lower_Band <= 1128.09 )
						if( bullPower <= -1.07134 )
							if( Upper_Band <= 1112.21 )
								if( bullPower <= -1.75345 )
									ret := 0.937500 // buy
								if( bullPower > -1.75345 )
									ret := 1.000000 // buy
							if( Upper_Band > 1112.21 )
								ret := 0.600000
						if( bullPower > -1.07134 )
							if( basis <= 1129.92 )
								if( bbm <= 1.00546 )
									ret := -0.166667
								if( bbm > 1.00546 )
									ret := 0.402778
							if( basis > 1129.92 )
								if( bullPower <= 0.193829 )
									ret := 1.000000 // buy
								if( bullPower > 0.193829 )
									ret := 0.655172
					if( Lower_Band > 1128.09 )
						if( Lower_Band <= 1210.39 )
							if( bullPower <= -0.749052 )
								if( bullPower <= -1.33427 )
									ret := -0.111111
								if( bullPower > -1.33427 )
									ret := -0.758621 // sell
							if( bullPower > -0.749052 )
								if( bullPower <= 1.76882 )
									ret := 0.180617
								if( bullPower > 1.76882 )
									ret := -0.138462
						if( Lower_Band > 1210.39 )
							if( Lower_Band <= 1234.49 )
								if( Upper_Band <= 1246.28 )
									ret := 0.967742 // buy
								if( Upper_Band > 1246.28 )
									ret := 0.800000 // buy
							if( Lower_Band > 1234.49 )
								ret := -0.538462
		if( bearPower > -0.025434 )
			if( bbm <= 1.81242 )
				if( Upper_Band <= 279.583 )
					if( bullPower <= 0.491699 )
						if( bearPower <= 0.146084 )
							if( Upper_Band <= 105.869 )
								if( basis <= 100.384 )
									ret := -0.592593
								if( basis > 100.384 )
									ret := 0.640625
							if( Upper_Band > 105.869 )
								if( bullPower <= 0.213304 )
									ret := 0.112589
								if( bullPower > 0.213304 )
									ret := -0.037802
						if( bearPower > 0.146084 )
							if( Lower_Band <= 120.438 )
								if( bearPower <= 0.183329 )
									ret := 0.219298
								if( bearPower > 0.183329 )
									ret := -0.137441
							if( Lower_Band > 120.438 )
								if( bullPower <= 0.433477 )
									ret := 0.249292
								if( bullPower > 0.433477 )
									ret := 0.477273
					if( bullPower > 0.491699 )
						if( Upper_Band <= 129.259 )
							if( Lower_Band <= 123.718 )
								if( Lower_Band <= 121.239 )
									ret := -0.038102
								if( Lower_Band > 121.239 )
									ret := -0.403315
							if( Lower_Band > 123.718 )
								if( Upper_Band <= 128.205 )
									ret := 0.553097
								if( Upper_Band > 128.205 )
									ret := 0.049020
						if( Upper_Band > 129.259 )
							if( bearPower <= 0.559047 )
								if( bbm <= 0.68847 )
									ret := -0.272868
								if( bbm > 0.68847 )
									ret := 0.165605
							if( bearPower > 0.559047 )
								if( Lower_Band <= 134.953 )
									ret := -0.823944 // sell
								if( Lower_Band > 134.953 )
									ret := -0.281250
				if( Upper_Band > 279.583 )
					if( bullPower <= 0.336532 )
						if( Upper_Band <= 281.071 )
							ret := -0.750000 // sell
						if( Upper_Band > 281.071 )
							if( Upper_Band <= 318.266 )
								if( basis <= 314.89 )
									ret := 0.102459
								if( basis > 314.89 )
									ret := 0.500000
							if( Upper_Band > 318.266 )
								if( Upper_Band <= 318.653 )
									ret := -1.000000 // sell
								if( Upper_Band > 318.653 )
									ret := -0.042972
					if( bullPower > 0.336532 )
						if( bearPower <= 1.09452 )
							if( bearPower <= -0.01732 )
								if( Lower_Band <= 490.25 )
									ret := 0.217822
								if( Lower_Band > 490.25 )
									ret := 0.627451
							if( bearPower > -0.01732 )
								if( bbp <= 3.66316 )
									ret := 0.069423
								if( bbp > 3.66316 )
									ret := -0.424242
						if( bearPower > 1.09452 )
							if( bbp <= 9.61446 )
								if( Upper_Band <= 283.786 )
									ret := 0.939394 // buy
								if( Upper_Band > 283.786 )
									ret := 0.134347
							if( bbp > 9.61446 )
								if( Upper_Band <= 1217.13 )
									ret := -0.041237
								if( Upper_Band > 1217.13 )
									ret := -1.000000 // sell
			if( bbm > 1.81242 )
				if( Upper_Band <= 932.919 )
					if( Upper_Band <= 380.843 )
						if( Lower_Band <= 191.617 )
							ret := 0.352941
						if( Lower_Band > 191.617 )
							ret := 0.947368 // buy
					if( Upper_Band > 380.843 )
						if( bearPower <= 0.532585 )
							if( Lower_Band <= 908.164 )
								if( bbp <= 1.91398 )
									ret := -0.714286 // sell
								if( bbp > 1.91398 )
									ret := -0.191930
							if( Lower_Band > 908.164 )
								if( basis <= 918.959 )
									ret := -1.000000 // sell
								if( basis > 918.959 )
									ret := 0.090909
						if( bearPower > 0.532585 )
							if( Lower_Band <= 398.761 )
								if( bearPower <= 5.83714 )
									ret := -0.555556
								if( bearPower > 5.83714 )
									ret := 0.230769
							if( Lower_Band > 398.761 )
								if( Upper_Band <= 421.736 )
									ret := 0.526718
								if( Upper_Band > 421.736 )
									ret := -0.040428
				if( Upper_Band > 932.919 )
					if( basis <= 942.973 )
						if( bearPower <= 2.31718 )
							if( bbm <= 2.26369 )
								ret := 0.933333 // buy
							if( bbm > 2.26369 )
								if( Upper_Band <= 943.446 )
									ret := 0.785714 // buy
								if( Upper_Band > 943.446 )
									ret := -0.320000
						if( bearPower > 2.31718 )
							if( bbp <= 9.61702 )
								if( bbm <= 2.18921 )
									ret := 0.909091 // buy
								if( bbm > 2.18921 )
									ret := 1.000000 // buy
							if( bbp > 9.61702 )
								if( basis <= 929.648 )
									ret := 0.666667
								if( basis > 929.648 )
									ret := 0.888889 // buy
					if( basis > 942.973 )
						if( basis <= 1038.4 )
							if( bbm <= 3.1184 )
								if( Lower_Band <= 950.918 )
									ret := -0.229508
								if( Lower_Band > 950.918 )
									ret := -0.692308
							if( bbm > 3.1184 )
								ret := -1.000000 // sell
						if( basis > 1038.4 )
							if( bbp <= 9.26055 )
								if( bearPower <= 0.976093 )
									ret := 0.403226
								if( bearPower > 0.976093 )
									ret := 0.150943
							if( bbp > 9.26055 )
								if( Lower_Band <= 1195.18 )
									ret := -0.367521
								if( Lower_Band > 1195.18 )
									ret := 0.583333
	if( bbm > 3.54799 )
		if( bullPower <= 17.1134 )
			if( bearPower <= -9.72258 )
				if( bearPower <= -12.5607 )
					if( Upper_Band <= 484.001 )
						if( Lower_Band <= 384.993 )
							ret := 0.714286 // buy
						if( Lower_Band > 384.993 )
							ret := 1.000000 // buy
					if( Upper_Band > 484.001 )
						if( Upper_Band <= 1149.12 )
							if( bullPower <= -12.0469 )
								if( bearPower <= -22.716 )
									ret := -0.966667 // sell
								if( bearPower > -22.716 )
									ret := -0.636364
							if( bullPower > -12.0469 )
								if( bbp <= -20.4594 )
									ret := 0.072917
								if( bbp > -20.4594 )
									ret := -0.519231
						if( Upper_Band > 1149.12 )
							if( Upper_Band <= 1262 )
								if( bbm <= 14.9112 )
									ret := 0.692308
								if( bbm > 14.9112 )
									ret := -0.533333
							if( Upper_Band > 1262 )
								ret := 0.947368 // buy
				if( bearPower > -12.5607 )
					if( bbp <= -15.6815 )
						if( bearPower <= -12.0082 )
							if( bbp <= -17.5643 )
								if( basis <= 906.522 )
									ret := 0.897436 // buy
								if( basis > 906.522 )
									ret := 0.652174
							if( bbp > -17.5643 )
								ret := 0.250000
						if( bearPower > -12.0082 )
							if( Lower_Band <= 849.323 )
								if( Lower_Band <= 704.503 )
									ret := 0.200000
								if( Lower_Band > 704.503 )
									ret := 0.956522 // buy
							if( Lower_Band > 849.323 )
								if( bbm <= 4.07936 )
									ret := -0.900000 // sell
								if( bbm > 4.07936 )
									ret := 0.272727
					if( bbp > -15.6815 )
						if( bullPower <= -5.19127 )
							if( bearPower <= -10.0484 )
								ret := -1.000000 // sell
							if( bearPower > -10.0484 )
								ret := 0.062500
						if( bullPower > -5.19127 )
							if( Upper_Band <= 600.227 )
								ret := -0.526316
							if( Upper_Band > 600.227 )
								if( Upper_Band <= 731.239 )
									ret := 1.000000 // buy
								if( Upper_Band > 731.239 )
									ret := 0.133663
			if( bearPower > -9.72258 )
				if( basis <= 866.321 )
					if( bullPower <= -5.34791 )
						if( bearPower <= -9.60335 )
							ret := -0.272727
						if( bearPower > -9.60335 )
							ret := -1.000000 // sell
					if( bullPower > -5.34791 )
						if( basis <= 846.218 )
							if( basis <= 823.627 )
								if( Lower_Band <= 802.107 )
									ret := -0.063725
								if( Lower_Band > 802.107 )
									ret := 0.609375
							if( basis > 823.627 )
								if( bearPower <= -2.41557 )
									ret := -0.656410
								if( bearPower > -2.41557 )
									ret := 0.065217
						if( basis > 846.218 )
							if( bearPower <= 5.23426 )
								if( bullPower <= 4.91094 )
									ret := 0.015504
								if( bullPower > 4.91094 )
									ret := 0.473333
							if( bearPower > 5.23426 )
								ret := 1.000000 // buy
				if( basis > 866.321 )
					if( basis <= 1154.64 )
						if( Upper_Band <= 1151.04 )
							if( Upper_Band <= 1142.4 )
								if( Lower_Band <= 862.452 )
									ret := -0.430921
								if( Lower_Band > 862.452 )
									ret := -0.138035
							if( Upper_Band > 1142.4 )
								if( bearPower <= -5.45933 )
									ret := 0.878788 // buy
								if( bearPower > -5.45933 )
									ret := 0.099010
						if( Upper_Band > 1151.04 )
							if( bearPower <= -5.89864 )
								if( bbp <= -11.6372 )
									ret := -1.000000 // sell
								if( bbp > -11.6372 )
									ret := 0.833333 // buy
							if( bearPower > -5.89864 )
								if( bullPower <= 0.300942 )
									ret := -0.930233 // sell
								if( bullPower > 0.300942 )
									ret := -0.843478 // sell
					if( basis > 1154.64 )
						if( Upper_Band <= 1251.35 )
							if( basis <= 1206.01 )
								if( Lower_Band <= 1177.86 )
									ret := 0.794118 // buy
								if( Lower_Band > 1177.86 )
									ret := 0.382609
							if( basis > 1206.01 )
								if( bbp <= -7.32363 )
									ret := 0.818182 // buy
								if( bbp > -7.32363 )
									ret := -0.223529
						if( Upper_Band > 1251.35 )
							if( Lower_Band <= 1233.22 )
								if( Lower_Band <= 1183.38 )
									ret := -0.750000 // sell
								if( Lower_Band > 1183.38 )
									ret := -0.961538 // sell
							if( Lower_Band > 1233.22 )
								ret := -0.500000
		if( bullPower > 17.1134 )
			if( Upper_Band <= 405.614 )
				ret := 1.000000 // buy
			if( Upper_Band > 405.614 )
				if( basis <= 475.309 )
					ret := -0.642857
				if( basis > 475.309 )
					if( basis <= 691.889 )
						ret := 1.000000 // buy
					if( basis > 691.889 )
						if( bbp <= 38.4236 )
							if( Upper_Band <= 1018.4 )
								if( basis <= 843.528 )
									ret := 0.444444
								if( basis > 843.528 )
									ret := 1.000000 // buy
							if( Upper_Band > 1018.4 )
								ret := -0.300000
						if( bbp > 38.4236 )
							if( basis <= 826.145 )
								ret := -1.000000 // sell
							if( basis > 826.145 )
								ret := 0.076923
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NVDA_5Min_8135d1d1(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


