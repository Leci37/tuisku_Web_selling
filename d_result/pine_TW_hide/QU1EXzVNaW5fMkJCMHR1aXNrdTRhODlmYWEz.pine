//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: AMD_5Min_2BB0_4a89faa3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_2BB0_4a89faa3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_4a89faa3(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -1.61827 )
		if( Lower_Band <= 163.887 )
			if( basis <= 167.704 )
				if( bbm <= 2.34812 )
					if( basis <= 107.631 )
						ret := 0.800000 // buy
					if( basis > 107.631 )
						if( basis <= 122.463 )
							if( bbm <= 0.78 )
								ret := -0.666667
							if( bbm > 0.78 )
								if( basis <= 109.919 )
									ret := -0.750000 // sell
								if( basis > 109.919 )
									ret := -1.000000 // sell
						if( basis > 122.463 )
							if( Lower_Band <= 125.269 )
								ret := 1.000000 // buy
							if( Lower_Band > 125.269 )
								if( Lower_Band <= 154.936 )
									ret := -0.611940
								if( Lower_Band > 154.936 )
									ret := 0.133333
				if( bbm > 2.34812 )
					ret := 0.833333 // buy
			if( basis > 167.704 )
				if( bbm <= 1.29854 )
					if( Lower_Band <= 162.779 )
						ret := 1.000000 // buy
					if( Lower_Band > 162.779 )
						if( basis <= 168.63 )
							ret := -0.200000
						if( basis > 168.63 )
							if( Upper_Band <= 174.707 )
								ret := 0.750000 // buy
							if( Upper_Band > 174.707 )
								ret := 1.000000 // buy
				if( bbm > 1.29854 )
					ret := -0.250000
		if( Lower_Band > 163.887 )
			if( Lower_Band <= 170.697 )
				if( Upper_Band <= 171.951 )
					ret := 0.200000
				if( Upper_Band > 171.951 )
					if( bbp <= -4.19186 )
						if( Upper_Band <= 177.038 )
							if( Upper_Band <= 172.547 )
								if( bullPower <= -1.73314 )
									ret := -0.250000
								if( bullPower > -1.73314 )
									ret := -1.000000 // sell
							if( Upper_Band > 172.547 )
								if( bullPower <= -2.37881 )
									ret := -0.750000 // sell
								if( bullPower > -2.37881 )
									ret := -1.000000 // sell
						if( Upper_Band > 177.038 )
							if( Lower_Band <= 165.212 )
								if( bullPower <= -1.84978 )
									ret := -0.500000
								if( bullPower > -1.84978 )
									ret := 0.500000
							if( Lower_Band > 165.212 )
								if( bbp <= -5.3487 )
									ret := -0.666667
								if( bbp > -5.3487 )
									ret := -1.000000 // sell
					if( bbp > -4.19186 )
						ret := -0.250000
			if( Lower_Band > 170.697 )
				if( Lower_Band <= 206.408 )
					if( basis <= 178.182 )
						if( basis <= 176.109 )
							if( basis <= 176.003 )
								if( bbp <= -5.24425 )
									ret := -0.500000
								if( bbp > -5.24425 )
									ret := 0.000000
							if( basis > 176.003 )
								ret := 0.750000 // buy
						if( basis > 176.109 )
							if( bbp <= -4.26995 )
								ret := -1.000000 // sell
							if( bbp > -4.26995 )
								ret := -0.750000 // sell
					if( basis > 178.182 )
						if( bearPower <= -2.88599 )
							if( bbp <= -6.79968 )
								ret := 0.250000
							if( bbp > -6.79968 )
								ret := 1.000000 // buy
						if( bearPower > -2.88599 )
							if( Lower_Band <= 176.439 )
								ret := 0.750000 // buy
							if( Lower_Band > 176.439 )
								if( Lower_Band <= 179.512 )
									ret := -0.500000
								if( Lower_Band > 179.512 )
									ret := 0.111111
				if( Lower_Band > 206.408 )
					if( bullPower <= -2.21383 )
						ret := -0.750000 // sell
					if( bullPower > -2.21383 )
						ret := -1.000000 // sell
	if( bullPower > -1.61827 )
		if( basis <= 178.794 )
			if( Upper_Band <= 179.115 )
				if( Lower_Band <= 96.8665 )
					if( Upper_Band <= 97.0145 )
						if( bearPower <= 0.092805 )
							if( basis <= 96.3607 )
								if( bbm <= 0.1923 )
									ret := -0.014905
								if( bbm > 0.1923 )
									ret := 0.132471
							if( basis > 96.3607 )
								if( bbm <= 0.252687 )
									ret := -0.048193
								if( bbm > 0.252687 )
									ret := -0.760000 // sell
						if( bearPower > 0.092805 )
							if( Upper_Band <= 96.9645 )
								if( bbm <= 0.443504 )
									ret := 0.353508
								if( bbm > 0.443504 )
									ret := 0.007576
							if( Upper_Band > 96.9645 )
								ret := -1.000000 // sell
					if( Upper_Band > 97.0145 )
						if( Upper_Band <= 97.2723 )
							if( bearPower <= 0.03425 )
								if( bbp <= -0.13628 )
									ret := 0.861111 // buy
								if( bbp > -0.13628 )
									ret := 0.624161
							if( bearPower > 0.03425 )
								if( Upper_Band <= 97.1476 )
									ret := -0.031250
								if( Upper_Band > 97.1476 )
									ret := 0.512195
						if( Upper_Band > 97.2723 )
							if( Upper_Band <= 97.5428 )
								if( bbp <= -0.604205 )
									ret := 0.571429
								if( bbp > -0.604205 )
									ret := -0.234568
							if( Upper_Band > 97.5428 )
								if( bbm <= 0.469 )
									ret := 0.128852
								if( bbm > 0.469 )
									ret := 0.611872
				if( Lower_Band > 96.8665 )
					if( Lower_Band <= 99.1892 )
						if( bbp <= 0.974806 )
							if( Lower_Band <= 98.093 )
								if( bullPower <= -0.654861 )
									ret := 0.900000 // buy
								if( bullPower > -0.654861 )
									ret := -0.167241
							if( Lower_Band > 98.093 )
								if( Lower_Band <= 98.9237 )
									ret := -0.882353 // sell
								if( Lower_Band > 98.9237 )
									ret := -0.241379
						if( bbp > 0.974806 )
							if( bbm <= 0.758931 )
								ret := 1.000000 // buy
							if( bbm > 0.758931 )
								ret := 0.750000 // buy
					if( Lower_Band > 99.1892 )
						if( bearPower <= 0.651612 )
							if( bbp <= 1.77581 )
								if( Lower_Band <= 100.641 )
									ret := 0.259301
								if( Lower_Band > 100.641 )
									ret := 0.047061
							if( bbp > 1.77581 )
								if( Upper_Band <= 170.907 )
									ret := -0.256364
								if( Upper_Band > 170.907 )
									ret := 0.139241
						if( bearPower > 0.651612 )
							if( Upper_Band <= 166.251 )
								if( Upper_Band <= 161.565 )
									ret := 0.173913
								if( Upper_Band > 161.565 )
									ret := 0.590426
							if( Upper_Band > 166.251 )
								if( basis <= 167.255 )
									ret := -0.342975
								if( basis > 167.255 )
									ret := 0.280000
			if( Upper_Band > 179.115 )
				if( bullPower <= 0.834873 )
					if( bbp <= -1.73011 )
						if( bearPower <= -2.02239 )
							if( Lower_Band <= 176.034 )
								if( Lower_Band <= 173.741 )
									ret := -0.250000
								if( Lower_Band > 173.741 )
									ret := 0.731707 // buy
							if( Lower_Band > 176.034 )
								if( basis <= 178.655 )
									ret := 0.250000
								if( basis > 178.655 )
									ret := -1.000000 // sell
						if( bearPower > -2.02239 )
							if( bearPower <= -1.42909 )
								if( Lower_Band <= 172.746 )
									ret := 0.500000
								if( Lower_Band > 172.746 )
									ret := 0.960784 // buy
							if( bearPower > -1.42909 )
								if( bullPower <= -0.667487 )
									ret := -0.100000
								if( bullPower > -0.667487 )
									ret := 0.733333 // buy
					if( bbp > -1.73011 )
						if( Upper_Band <= 181.009 )
							if( Lower_Band <= 174.507 )
								if( basis <= 176.087 )
									ret := 0.000000
								if( basis > 176.087 )
									ret := -0.607143
							if( Lower_Band > 174.507 )
								if( bbm <= 0.423293 )
									ret := 0.023392
								if( bbm > 0.423293 )
									ret := 0.477124
						if( Upper_Band > 181.009 )
							if( basis <= 177.73 )
								ret := -0.750000 // sell
							if( basis > 177.73 )
								ret := -1.000000 // sell
				if( bullPower > 0.834873 )
					if( Lower_Band <= 174.936 )
						if( bbm <= 1.48 )
							if( bbp <= 3.58851 )
								if( bullPower <= 1.31874 )
									ret := 1.000000 // buy
								if( bullPower > 1.31874 )
									ret := 0.895833 // buy
							if( bbp > 3.58851 )
								if( basis <= 178.16 )
									ret := 0.333333
								if( basis > 178.16 )
									ret := 1.000000 // buy
						if( bbm > 1.48 )
							if( bbm <= 1.67874 )
								ret := -0.500000
							if( bbm > 1.67874 )
								ret := 1.000000 // buy
					if( Lower_Band > 174.936 )
						if( bearPower <= 1.23445 )
							if( Upper_Band <= 179.301 )
								if( bearPower <= 0.506337 )
									ret := -0.875000 // sell
								if( bearPower > 0.506337 )
									ret := 1.000000 // buy
							if( Upper_Band > 179.301 )
								if( bearPower <= 0.579493 )
									ret := 0.812500 // buy
								if( bearPower > 0.579493 )
									ret := 0.322581
						if( bearPower > 1.23445 )
							if( Upper_Band <= 180.823 )
								if( bearPower <= 1.43065 )
									ret := -0.750000 // sell
								if( bearPower > 1.43065 )
									ret := -1.000000 // sell
							if( Upper_Band > 180.823 )
								ret := 0.500000
		if( basis > 178.794 )
			if( Lower_Band <= 181.65 )
				if( bearPower <= -0.117964 )
					if( bbp <= -2.07955 )
						if( Upper_Band <= 185.153 )
							if( bullPower <= -0.349479 )
								if( bullPower <= -1.50019 )
									ret := 0.600000
								if( bullPower > -1.50019 )
									ret := -0.823077 // sell
							if( bullPower > -0.349479 )
								ret := 1.000000 // buy
						if( Upper_Band > 185.153 )
							if( Lower_Band <= 180.315 )
								if( Lower_Band <= 178.644 )
									ret := 0.500000
								if( Lower_Band > 178.644 )
									ret := -0.833333 // sell
							if( Lower_Band > 180.315 )
								if( bearPower <= -2.28576 )
									ret := 0.250000
								if( bearPower > -2.28576 )
									ret := 0.875000 // buy
					if( bbp > -2.07955 )
						if( bullPower <= -0.120864 )
							if( Lower_Band <= 178.695 )
								if( bbm <= 0.77373 )
									ret := -0.496063
								if( bbm > 0.77373 )
									ret := 0.444444
							if( Lower_Band > 178.695 )
								if( basis <= 181.198 )
									ret := 0.358382
								if( basis > 181.198 )
									ret := -0.078947
						if( bullPower > -0.120864 )
							if( bbm <= 1.22464 )
								if( bbm <= 0.841831 )
									ret := -0.313600
								if( bbm > 0.841831 )
									ret := 0.014184
							if( bbm > 1.22464 )
								if( bullPower <= 1.06684 )
									ret := -0.753247 // sell
								if( bullPower > 1.06684 )
									ret := -0.407407
				if( bearPower > -0.117964 )
					if( Upper_Band <= 184.757 )
						if( bbm <= 0.822674 )
							if( Lower_Band <= 177.86 )
								if( Upper_Band <= 182.611 )
									ret := -0.628571
								if( Upper_Band > 182.611 )
									ret := -0.100000
							if( Lower_Band > 177.86 )
								if( basis <= 182.471 )
									ret := 0.028836
								if( basis > 182.471 )
									ret := -0.659091
						if( bbm > 0.822674 )
							if( basis <= 182.264 )
								if( basis <= 181.761 )
									ret := 0.421687
								if( basis > 181.761 )
									ret := 1.000000 // buy
							if( basis > 182.264 )
								ret := -1.000000 // sell
					if( Upper_Band > 184.757 )
						if( Lower_Band <= 176.485 )
							if( bearPower <= 1.87061 )
								if( Upper_Band <= 186.724 )
									ret := 1.000000 // buy
								if( Upper_Band > 186.724 )
									ret := -0.571429
							if( bearPower > 1.87061 )
								if( Upper_Band <= 186.032 )
									ret := -0.750000 // sell
								if( Upper_Band > 186.032 )
									ret := -1.000000 // sell
						if( Lower_Band > 176.485 )
							if( Upper_Band <= 186.833 )
								if( bearPower <= 1.25877 )
									ret := -1.000000 // sell
								if( bearPower > 1.25877 )
									ret := -0.888889 // sell
							if( Upper_Band > 186.833 )
								if( bearPower <= 1.26162 )
									ret := -0.789474 // sell
								if( bearPower > 1.26162 )
									ret := 0.500000
			if( Lower_Band > 181.65 )
				if( Upper_Band <= 212.696 )
					if( Lower_Band <= 208.879 )
						if( bbp <= 1.24417 )
							if( Upper_Band <= 211.519 )
								if( Lower_Band <= 206.605 )
									ret := 0.085305
								if( Lower_Band > 206.605 )
									ret := -0.392857
							if( Upper_Band > 211.519 )
								if( Lower_Band <= 208.653 )
									ret := 0.783333 // buy
								if( Lower_Band > 208.653 )
									ret := -0.437500
						if( bbp > 1.24417 )
							if( Upper_Band <= 195.637 )
								if( Lower_Band <= 183.522 )
									ret := -0.692308
								if( Lower_Band > 183.522 )
									ret := 0.230159
							if( Upper_Band > 195.637 )
								if( Upper_Band <= 201.271 )
									ret := -0.709091 // sell
								if( Upper_Band > 201.271 )
									ret := -0.203390
					if( Lower_Band > 208.879 )
						if( Upper_Band <= 212.424 )
							if( bullPower <= -0.025307 )
								if( bearPower <= -0.451729 )
									ret := 0.583333
								if( bearPower > -0.451729 )
									ret := -0.222222
							if( bullPower > -0.025307 )
								if( bbm <= 0.504664 )
									ret := 0.595506
								if( bbm > 0.504664 )
									ret := 0.850000 // buy
						if( Upper_Band > 212.424 )
							if( Lower_Band <= 210.451 )
								ret := -0.250000
							if( Lower_Band > 210.451 )
								ret := 0.000000
				if( Upper_Band > 212.696 )
					if( bbp <= 4.81169 )
						if( basis <= 210.926 )
							if( Lower_Band <= 206.208 )
								if( bullPower <= -0.649035 )
									ret := -0.250000
								if( bullPower > -0.649035 )
									ret := -1.000000 // sell
							if( Lower_Band > 206.208 )
								if( bearPower <= 0.510182 )
									ret := 0.425000
								if( bearPower > 0.510182 )
									ret := -1.000000 // sell
						if( basis > 210.926 )
							if( Upper_Band <= 213.134 )
								if( Lower_Band <= 210.641 )
									ret := -0.896552 // sell
								if( Lower_Band > 210.641 )
									ret := 0.200000
							if( Upper_Band > 213.134 )
								if( Upper_Band <= 215.114 )
									ret := -0.271845
								if( Upper_Band > 215.114 )
									ret := -0.897436 // sell
					if( bbp > 4.81169 )
						if( bbp <= 8.21914 )
							ret := 1.000000 // buy
						if( bbp > 8.21914 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_AMD_5Min_4a89faa3(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


