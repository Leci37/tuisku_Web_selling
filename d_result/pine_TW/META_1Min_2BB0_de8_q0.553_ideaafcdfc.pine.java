//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: META_1Min_2BB0_eaafcdfc Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_2BB0_eaafcdfc", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_eaafcdfc(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.569875 )
		if( basis <= 432.111 )
			if( Upper_Band <= 432.305 )
				if( basis <= 430.034 )
					if( basis <= 423.99 )
						if( bbm <= 0.42565 )
							ret := -0.750000 // sell
						if( bbm > 0.42565 )
							if( basis <= 415.988 )
								ret := -0.250000
							if( basis > 415.988 )
								if( Lower_Band <= 413.967 )
									ret := 0.909091 // buy
								if( Lower_Band > 413.967 )
									ret := 0.416667
					if( basis > 423.99 )
						if( bearPower <= -0.667608 )
							if( bullPower <= -0.835246 )
								if( bearPower <= -1.68287 )
									ret := 0.857143 // buy
								if( bearPower > -1.68287 )
									ret := 1.000000 // buy
							if( bullPower > -0.835246 )
								if( bearPower <= -0.754197 )
									ret := 0.529412
								if( bearPower > -0.754197 )
									ret := 1.000000 // buy
						if( bearPower > -0.667608 )
							ret := 0.000000
				if( basis > 430.034 )
					if( Upper_Band <= 431.814 )
						ret := -1.000000 // sell
					if( Upper_Band > 431.814 )
						if( basis <= 430.851 )
							ret := 0.400000
						if( basis > 430.851 )
							ret := -1.000000 // sell
			if( Upper_Band > 432.305 )
				if( bbp <= -1.8179 )
					if( basis <= 431.419 )
						ret := 1.000000 // buy
					if( basis > 431.419 )
						if( Lower_Band <= 426.952 )
							ret := 1.000000 // buy
						if( Lower_Band > 426.952 )
							ret := 0.600000
				if( bbp > -1.8179 )
					ret := 0.750000 // buy
		if( basis > 432.111 )
			if( basis <= 491.956 )
				if( basis <= 478.105 )
					if( basis <= 465.966 )
						if( bbm <= 0.206916 )
							if( basis <= 458.779 )
								if( bearPower <= -1.04267 )
									ret := 0.863636 // buy
								if( bearPower > -1.04267 )
									ret := 0.604167
							if( basis > 458.779 )
								if( Upper_Band <= 463.899 )
									ret := -0.909091 // sell
								if( Upper_Band > 463.899 )
									ret := 0.360360
						if( bbm > 0.206916 )
							if( basis <= 462.74 )
								if( Upper_Band <= 435.333 )
									ret := -0.807692 // sell
								if( Upper_Band > 435.333 )
									ret := 0.029932
							if( basis > 462.74 )
								if( bbm <= 1.06181 )
									ret := -0.208054
								if( bbm > 1.06181 )
									ret := -0.829787 // sell
					if( basis > 465.966 )
						if( Lower_Band <= 474.973 )
							if( bearPower <= -3.78124 )
								if( bbm <= 5.29423 )
									ret := -0.866667 // sell
								if( bbm > 5.29423 )
									ret := 0.500000
							if( bearPower > -3.78124 )
								if( Lower_Band <= 464.422 )
									ret := 0.928571 // buy
								if( Lower_Band > 464.422 )
									ret := 0.322388
						if( Lower_Band > 474.973 )
							if( bullPower <= -0.686819 )
								if( basis <= 477.916 )
									ret := -0.740741 // sell
								if( basis > 477.916 )
									ret := 0.000000
							if( bullPower > -0.686819 )
								if( Upper_Band <= 478.454 )
									ret := 0.714286 // buy
								if( Upper_Band > 478.454 )
									ret := 0.000000
				if( basis > 478.105 )
					if( Lower_Band <= 475.983 )
						if( bbp <= -59.5399 )
							ret := -0.600000
						if( bbp > -59.5399 )
							if( basis <= 481.427 )
								if( basis <= 480.306 )
									ret := 0.727273 // buy
								if( basis > 480.306 )
									ret := -0.833333 // sell
							if( basis > 481.427 )
								if( Lower_Band <= 473.846 )
									ret := 1.000000 // buy
								if( Lower_Band > 473.846 )
									ret := 0.857143 // buy
					if( Lower_Band > 475.983 )
						if( Upper_Band <= 489.531 )
							if( Upper_Band <= 481.278 )
								if( bbp <= -1.97936 )
									ret := -0.820000 // sell
								if( bbp > -1.97936 )
									ret := -0.266667
							if( Upper_Band > 481.278 )
								if( basis <= 480.838 )
									ret := 0.360656
								if( basis > 480.838 )
									ret := -0.290698
						if( Upper_Band > 489.531 )
							if( Lower_Band <= 488.471 )
								if( Upper_Band <= 493.753 )
									ret := 0.417476
								if( Upper_Band > 493.753 )
									ret := -0.283333
							if( Lower_Band > 488.471 )
								if( bbp <= -1.88419 )
									ret := -0.774194 // sell
								if( bbp > -1.88419 )
									ret := -0.285714
			if( basis > 491.956 )
				if( basis <= 498.817 )
					if( Upper_Band <= 501.057 )
						if( bullPower <= -0.910692 )
							if( basis <= 493.851 )
								if( bearPower <= -1.89071 )
									ret := -0.666667
								if( bearPower > -1.89071 )
									ret := 0.888889 // buy
							if( basis > 493.851 )
								if( basis <= 498.501 )
									ret := 0.910615 // buy
								if( basis > 498.501 )
									ret := 0.000000
						if( bullPower > -0.910692 )
							if( basis <= 497.625 )
								if( Upper_Band <= 497.748 )
									ret := 0.507576
								if( Upper_Band > 497.748 )
									ret := -0.134615
							if( basis > 497.625 )
								if( Lower_Band <= 496.512 )
									ret := 0.918919 // buy
								if( Lower_Band > 496.512 )
									ret := 0.588235
					if( Upper_Band > 501.057 )
						if( Lower_Band <= 491.064 )
							if( basis <= 495.356 )
								if( Lower_Band <= 485.803 )
									ret := 1.000000 // buy
								if( Lower_Band > 485.803 )
									ret := 0.000000
							if( basis > 495.356 )
								ret := 1.000000 // buy
						if( Lower_Band > 491.064 )
							if( Lower_Band <= 493.115 )
								if( basis <= 498.217 )
									ret := -1.000000 // sell
								if( basis > 498.217 )
									ret := 0.600000
							if( Lower_Band > 493.115 )
								if( Upper_Band <= 501.576 )
									ret := 0.076923
								if( Upper_Band > 501.576 )
									ret := 0.846154 // buy
				if( basis > 498.817 )
					if( basis <= 505.291 )
						if( Upper_Band <= 506.3 )
							if( basis <= 501.755 )
								if( bbm <= 1.33063 )
									ret := -0.248927
								if( bbm > 1.33063 )
									ret := 0.432432
							if( basis > 501.755 )
								if( Lower_Band <= 502.117 )
									ret := 0.568807
								if( Lower_Band > 502.117 )
									ret := 0.037037
						if( Upper_Band > 506.3 )
							if( Lower_Band <= 503.121 )
								if( bbp <= -5.64413 )
									ret := -0.891892 // sell
								if( bbp > -5.64413 )
									ret := -0.008547
							if( Lower_Band > 503.121 )
								if( basis <= 505.061 )
									ret := -1.000000 // sell
								if( basis > 505.061 )
									ret := -0.823529 // sell
					if( basis > 505.291 )
						if( basis <= 506.909 )
							if( Upper_Band <= 506.78 )
								if( Upper_Band <= 506.67 )
									ret := -0.875000 // sell
								if( Upper_Band > 506.67 )
									ret := -0.200000
							if( Upper_Band > 506.78 )
								if( bbp <= -2.13703 )
									ret := 0.839286 // buy
								if( bbp > -2.13703 )
									ret := 0.507246
						if( basis > 506.909 )
							if( bearPower <= -1.92168 )
								if( bbm <= 2.15509 )
									ret := 0.032168
								if( bbm > 2.15509 )
									ret := 0.716981 // buy
							if( bearPower > -1.92168 )
								if( bbp <= -1.93591 )
									ret := 0.317168
								if( bbp > -1.93591 )
									ret := 0.148794
	if( bullPower > -0.569875 )
		if( bullPower <= 0.880892 )
			if( Upper_Band <= 467.445 )
				if( basis <= 420.476 )
					if( Upper_Band <= 423.371 )
						if( Upper_Band <= 420.38 )
							if( bearPower <= -0.672186 )
								if( bearPower <= -2.23959 )
									ret := 1.000000 // buy
								if( bearPower > -2.23959 )
									ret := -0.416667
							if( bearPower > -0.672186 )
								if( Upper_Band <= 419.493 )
									ret := 0.651163
								if( Upper_Band > 419.493 )
									ret := -0.578947
						if( Upper_Band > 420.38 )
							if( Upper_Band <= 422.673 )
								if( bearPower <= -2.58638 )
									ret := 0.666667
								if( bearPower > -2.58638 )
									ret := 0.979592 // buy
							if( Upper_Band > 422.673 )
								ret := 0.500000
					if( Upper_Band > 423.371 )
						ret := -1.000000 // sell
				if( basis > 420.476 )
					if( basis <= 428.17 )
						if( Upper_Band <= 429.757 )
							if( bullPower <= 0.104377 )
								if( bbm <= 0.074393 )
									ret := 0.041667
								if( bbm > 0.074393 )
									ret := -0.428571
							if( bullPower > 0.104377 )
								if( bullPower <= 0.528021 )
									ret := -0.681416
								if( bullPower > 0.528021 )
									ret := 0.173913
						if( Upper_Band > 429.757 )
							if( bullPower <= 0.565217 )
								if( Upper_Band <= 429.777 )
									ret := 0.750000 // buy
								if( Upper_Band > 429.777 )
									ret := 1.000000 // buy
							if( bullPower > 0.565217 )
								if( basis <= 427.759 )
									ret := -0.428571
								if( basis > 427.759 )
									ret := 0.750000 // buy
					if( basis > 428.17 )
						if( Upper_Band <= 436.565 )
							if( bbm <= 0.820181 )
								if( Lower_Band <= 430.58 )
									ret := 0.263959
								if( Lower_Band > 430.58 )
									ret := 0.007590
							if( bbm > 0.820181 )
								if( bbm <= 2.13053 )
									ret := 0.572816
								if( bbm > 2.13053 )
									ret := -1.000000 // sell
						if( Upper_Band > 436.565 )
							if( Lower_Band <= 431.324 )
								ret := -1.000000 // sell
							if( Lower_Band > 431.324 )
								if( bullPower <= 0.051604 )
									ret := 0.153130
								if( bullPower > 0.051604 )
									ret := 0.074486
			if( Upper_Band > 467.445 )
				if( basis <= 596.199 )
					if( basis <= 466.088 )
						if( Upper_Band <= 468.246 )
							if( bbm <= 0.534596 )
								if( bbp <= 0.89788 )
									ret := 0.076923
								if( bbp > 0.89788 )
									ret := -0.526316
							if( bbm > 0.534596 )
								if( bullPower <= -0.393993 )
									ret := 0.250000
								if( bullPower > -0.393993 )
									ret := -0.852941 // sell
						if( Upper_Band > 468.246 )
							if( basis <= 465.776 )
								if( bearPower <= 0.17491 )
									ret := 0.909091 // buy
								if( bearPower > 0.17491 )
									ret := -0.250000
							if( basis > 465.776 )
								if( bullPower <= 0.442185 )
									ret := -0.750000 // sell
								if( bullPower > 0.442185 )
									ret := 0.000000
					if( basis > 466.088 )
						if( Lower_Band <= 465.29 )
							if( bbm <= 0.29855 )
								if( basis <= 467.291 )
									ret := -0.048780
								if( basis > 467.291 )
									ret := 0.750000 // buy
							if( bbm > 0.29855 )
								if( Upper_Band <= 472.054 )
									ret := 0.613095
								if( Upper_Band > 472.054 )
									ret := 0.000000
						if( Lower_Band > 465.29 )
							if( bbm <= 2.21263 )
								if( bearPower <= -0.31662 )
									ret := 0.023110
								if( bearPower > -0.31662 )
									ret := 0.048948
							if( bbm > 2.21263 )
								if( Lower_Band <= 472.632 )
									ret := 0.812500 // buy
								if( Lower_Band > 472.632 )
									ret := 0.237288
				if( basis > 596.199 )
					if( Lower_Band <= 596.275 )
						if( Upper_Band <= 597.868 )
							if( bullPower <= -0.056694 )
								if( bbp <= -1.40718 )
									ret := -0.750000 // sell
								if( bbp > -1.40718 )
									ret := -0.500000
							if( bullPower > -0.056694 )
								if( Upper_Band <= 597.713 )
									ret := -0.800000 // sell
								if( Upper_Band > 597.713 )
									ret := -1.000000 // sell
						if( Upper_Band > 597.868 )
							if( Upper_Band <= 600.003 )
								if( Upper_Band <= 598.006 )
									ret := -0.666667
								if( Upper_Band > 598.006 )
									ret := 0.272727
							if( Upper_Band > 600.003 )
								if( bearPower <= -2.02336 )
									ret := -0.200000
								if( bearPower > -2.02336 )
									ret := -0.888889 // sell
					if( Lower_Band > 596.275 )
						if( bearPower <= 0.052643 )
							ret := 0.000000
						if( bearPower > 0.052643 )
							ret := -0.250000
		if( bullPower > 0.880892 )
			if( bbp <= 4.57425 )
				if( Lower_Band <= 410.321 )
					if( basis <= 420.345 )
						if( Upper_Band <= 415.977 )
							ret := -0.750000 // sell
						if( Upper_Band > 415.977 )
							ret := -1.000000 // sell
					if( basis > 420.345 )
						ret := -0.500000
				if( Lower_Band > 410.321 )
					if( Upper_Band <= 440.276 )
						if( Lower_Band <= 429.02 )
							if( bbm <= 2.78398 )
								if( basis <= 429.95 )
									ret := 0.148276
								if( basis > 429.95 )
									ret := -0.508197
							if( bbm > 2.78398 )
								if( bbp <= 3.09291 )
									ret := -1.000000 // sell
								if( bbp > 3.09291 )
									ret := -0.500000
						if( Lower_Band > 429.02 )
							if( bearPower <= 0.379788 )
								if( Lower_Band <= 437.579 )
									ret := 0.626943
								if( Lower_Band > 437.579 )
									ret := -0.400000
							if( bearPower > 0.379788 )
								if( Lower_Band <= 433.644 )
									ret := 0.255556
								if( Lower_Band > 433.644 )
									ret := -0.469697
					if( Upper_Band > 440.276 )
						if( Lower_Band <= 437.27 )
							if( basis <= 437.342 )
								if( bearPower <= 0.088161 )
									ret := 0.000000
								if( bearPower > 0.088161 )
									ret := 0.833333 // buy
							if( basis > 437.342 )
								if( bbm <= 0.985743 )
									ret := -0.170213
								if( bbm > 0.985743 )
									ret := -0.944444 // sell
						if( Lower_Band > 437.27 )
							if( Lower_Band <= 567.426 )
								if( bearPower <= 1.35197 )
									ret := -0.044799
								if( bearPower > 1.35197 )
									ret := -0.216590
							if( Lower_Band > 567.426 )
								if( basis <= 573.296 )
									ret := 0.472826
								if( basis > 573.296 )
									ret := -0.017513
			if( bbp > 4.57425 )
				if( basis <= 574.754 )
					if( bearPower <= 4.5027 )
						if( Upper_Band <= 428.229 )
							if( bullPower <= 4.0873 )
								if( bbp <= 5.10379 )
									ret := 0.750000 // buy
								if( bbp > 5.10379 )
									ret := 1.000000 // buy
							if( bullPower > 4.0873 )
								if( Lower_Band <= 415.442 )
									ret := 0.750000 // buy
								if( Lower_Band > 415.442 )
									ret := 0.500000
						if( Upper_Band > 428.229 )
							if( Lower_Band <= 415.202 )
								ret := -1.000000 // sell
							if( Lower_Band > 415.202 )
								if( bearPower <= 3.3669 )
									ret := 0.158348
								if( bearPower > 3.3669 )
									ret := 0.597222
					if( bearPower > 4.5027 )
						if( bbm <= 3.40944 )
							ret := -0.500000
						if( bbm > 3.40944 )
							ret := -1.000000 // sell
				if( basis > 574.754 )
					ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_META_1Min_eaafcdfc(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


