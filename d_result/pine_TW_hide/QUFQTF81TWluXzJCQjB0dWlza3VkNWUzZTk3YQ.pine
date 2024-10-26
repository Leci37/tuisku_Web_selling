//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: AAPL_5Min_2BB0_d5e3e97a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_2BB0_d5e3e97a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_d5e3e97a(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= 0.207795 )
		if( Lower_Band <= 163.45 )
			if( basis <= 164.036 )
				if( Upper_Band <= 164.213 )
					if( Lower_Band <= 162.663 )
						ret := -0.250000
					if( Lower_Band > 162.663 )
						if( Lower_Band <= 163.296 )
							if( basis <= 163.689 )
								if( bullPower <= 0.52913 )
									ret := 1.000000 // buy
								if( bullPower > 0.52913 )
									ret := 0.750000 // buy
							if( basis > 163.689 )
								ret := 0.500000
						if( Lower_Band > 163.296 )
							if( bullPower <= 0.110254 )
								ret := 0.333333
							if( bullPower > 0.110254 )
								ret := 1.000000 // buy
				if( Upper_Band > 164.213 )
					if( bearPower <= 0.085782 )
						if( bbp <= 0.177722 )
							if( bullPower <= 0.081291 )
								if( Lower_Band <= 163.038 )
									ret := 0.250000
								if( Lower_Band > 163.038 )
									ret := 0.000000
							if( bullPower > 0.081291 )
								if( bbm <= 0.33495 )
									ret := -0.800000 // sell
								if( bbm > 0.33495 )
									ret := 0.000000
						if( bbp > 0.177722 )
							ret := 0.500000
					if( bearPower > 0.085782 )
						ret := -0.600000
			if( basis > 164.036 )
				if( bbm <= 0.513672 )
					if( Lower_Band <= 163.205 )
						ret := 1.000000 // buy
					if( Lower_Band > 163.205 )
						if( bearPower <= 0.147802 )
							ret := 0.500000
						if( bearPower > 0.147802 )
							ret := 1.000000 // buy
				if( bbm > 0.513672 )
					ret := 0.500000
		if( Lower_Band > 163.45 )
			if( Upper_Band <= 169.989 )
				if( bearPower <= -0.23924 )
					if( Upper_Band <= 165.668 )
						if( bearPower <= -0.285529 )
							if( basis <= 164.835 )
								if( bullPower <= 0.206688 )
									ret := -0.754386 // sell
								if( bullPower > 0.206688 )
									ret := 0.750000 // buy
							if( basis > 164.835 )
								if( basis <= 164.926 )
									ret := 0.714286 // buy
								if( basis > 164.926 )
									ret := 0.050000
						if( bearPower > -0.285529 )
							if( basis <= 165.118 )
								if( Upper_Band <= 164.527 )
									ret := -0.750000 // sell
								if( Upper_Band > 164.527 )
									ret := 0.575000
							if( basis > 165.118 )
								ret := -0.750000 // sell
					if( Upper_Band > 165.668 )
						if( Lower_Band <= 168.941 )
							if( bbp <= -1.13323 )
								if( bullPower <= -0.388437 )
									ret := -0.612903
								if( bullPower > -0.388437 )
									ret := 0.307692
							if( bbp > -1.13323 )
								if( basis <= 168.341 )
									ret := 0.395492
								if( basis > 168.341 )
									ret := 0.611111
						if( Lower_Band > 168.941 )
							if( basis <= 169.392 )
								if( Lower_Band <= 168.987 )
									ret := -1.000000 // sell
								if( Lower_Band > 168.987 )
									ret := -0.714286 // sell
							if( basis > 169.392 )
								if( bbm <= 0.475081 )
									ret := 0.074074
								if( bbm > 0.475081 )
									ret := 0.823529 // buy
				if( bearPower > -0.23924 )
					if( Lower_Band <= 168.632 )
						if( bbm <= 0.830218 )
							if( Upper_Band <= 165.25 )
								if( Lower_Band <= 164.215 )
									ret := 0.083333
								if( Lower_Band > 164.215 )
									ret := 0.372549
							if( Upper_Band > 165.25 )
								if( bullPower <= 0.758982 )
									ret := 0.031906
								if( bullPower > 0.758982 )
									ret := -1.000000 // sell
						if( bbm > 0.830218 )
							if( Upper_Band <= 167.665 )
								ret := 0.333333
							if( Upper_Band > 167.665 )
								if( bbm <= 0.892516 )
									ret := 0.750000 // buy
								if( bbm > 0.892516 )
									ret := 1.000000 // buy
					if( Lower_Band > 168.632 )
						if( Lower_Band <= 168.81 )
							if( bbp <= 0.477623 )
								if( basis <= 169.191 )
									ret := 0.305556
								if( basis > 169.191 )
									ret := 0.875000 // buy
							if( bbp > 0.477623 )
								ret := -0.571429
						if( Lower_Band > 168.81 )
							if( basis <= 169.155 )
								if( Upper_Band <= 169.32 )
									ret := 0.135802
								if( Upper_Band > 169.32 )
									ret := 0.538462
							if( basis > 169.155 )
								if( Upper_Band <= 169.763 )
									ret := -0.097484
								if( Upper_Band > 169.763 )
									ret := 0.250689
			if( Upper_Band > 169.989 )
				if( Lower_Band <= 169.737 )
					if( Upper_Band <= 171.398 )
						if( basis <= 169.992 )
							if( basis <= 169.322 )
								if( Upper_Band <= 170.369 )
									ret := -0.288288
								if( Upper_Band > 170.369 )
									ret := -0.818182 // sell
							if( basis > 169.322 )
								if( Upper_Band <= 171.138 )
									ret := 0.005430
								if( Upper_Band > 171.138 )
									ret := -0.823529 // sell
						if( basis > 169.992 )
							if( Lower_Band <= 169.444 )
								if( Lower_Band <= 169.233 )
									ret := -0.648649
								if( Lower_Band > 169.233 )
									ret := 0.084906
							if( Lower_Band > 169.444 )
								if( bullPower <= 0.221639 )
									ret := -0.280488
								if( bullPower > 0.221639 )
									ret := -0.784314 // sell
					if( Upper_Band > 171.398 )
						if( bearPower <= -0.073299 )
							if( bullPower <= -0.633733 )
								if( Upper_Band <= 176.757 )
									ret := -0.419355
								if( Upper_Band > 176.757 )
									ret := 1.000000 // buy
							if( bullPower > -0.633733 )
								if( bearPower <= -0.861483 )
									ret := 0.880000 // buy
								if( bearPower > -0.861483 )
									ret := 0.428571
						if( bearPower > -0.073299 )
							if( Lower_Band <= 169.49 )
								if( Lower_Band <= 169.01 )
									ret := 0.666667
								if( Lower_Band > 169.01 )
									ret := 0.000000
							if( Lower_Band > 169.49 )
								if( Upper_Band <= 171.565 )
									ret := 0.000000
								if( Upper_Band > 171.565 )
									ret := -0.739130 // sell
				if( Lower_Band > 169.737 )
					if( Upper_Band <= 235.945 )
						if( Upper_Band <= 232.475 )
							if( bbm <= 0.060013 )
								if( basis <= 223.216 )
									ret := 0.002505
								if( basis > 223.216 )
									ret := 0.099128
							if( bbm > 0.060013 )
								if( Upper_Band <= 172.785 )
									ret := 0.165132
								if( Upper_Band > 172.785 )
									ret := 0.057245
						if( Upper_Band > 232.475 )
							if( Lower_Band <= 231.811 )
								if( bbm <= 0.202233 )
									ret := 0.000000
								if( bbm > 0.202233 )
									ret := -0.540773
							if( Lower_Band > 231.811 )
								if( basis <= 233.958 )
									ret := 0.092486
								if( basis > 233.958 )
									ret := -0.206226
					if( Upper_Band > 235.945 )
						if( bbp <= 0.563955 )
							if( Lower_Band <= 233.952 )
								if( bullPower <= -1.74489 )
									ret := 0.500000
								if( bullPower > -1.74489 )
									ret := 0.833333 // buy
							if( Lower_Band > 233.952 )
								if( bbp <= -0.188269 )
									ret := 0.785714 // buy
								if( bbp > -0.188269 )
									ret := -0.600000
						if( bbp > 0.563955 )
							if( basis <= 234.962 )
								ret := -0.250000
							if( basis > 234.962 )
								ret := -1.000000 // sell
	if( bearPower > 0.207795 )
		if( Upper_Band <= 196.649 )
			if( bbp <= 0.676428 )
				if( Lower_Band <= 167.205 )
					if( Upper_Band <= 166.657 )
						if( basis <= 165.494 )
							if( Upper_Band <= 165.646 )
								ret := 0.000000
							if( Upper_Band > 165.646 )
								ret := 0.428571
						if( basis > 165.494 )
							ret := -0.750000 // sell
					if( Upper_Band > 166.657 )
						if( bbm <= 0.131012 )
							if( Lower_Band <= 166.373 )
								ret := 0.750000 // buy
							if( Lower_Band > 166.373 )
								ret := 0.333333
						if( bbm > 0.131012 )
							if( basis <= 166.205 )
								ret := 0.500000
							if( basis > 166.205 )
								ret := 1.000000 // buy
				if( Lower_Band > 167.205 )
					if( Lower_Band <= 170.022 )
						if( Lower_Band <= 169.131 )
							if( bbp <= 0.606457 )
								if( bullPower <= 0.358476 )
									ret := 0.000000
								if( bullPower > 0.358476 )
									ret := 0.500000
							if( bbp > 0.606457 )
								if( bbp <= 0.64935 )
									ret := -0.533333
								if( bbp > 0.64935 )
									ret := 0.142857
						if( Lower_Band > 169.131 )
							if( bbm <= 0.015 )
								ret := -0.200000
							if( bbm > 0.015 )
								if( Lower_Band <= 169.262 )
									ret := -0.555556
								if( Lower_Band > 169.262 )
									ret := -0.894737 // sell
					if( Lower_Band > 170.022 )
						if( Upper_Band <= 194.766 )
							if( Upper_Band <= 190.876 )
								if( bbm <= 0.181742 )
									ret := -0.014768
								if( bbm > 0.181742 )
									ret := 0.238095
							if( Upper_Band > 190.876 )
								if( basis <= 191.069 )
									ret := 0.588235
								if( basis > 191.069 )
									ret := 0.046512
						if( Upper_Band > 194.766 )
							if( Lower_Band <= 194.283 )
								if( bbm <= 0.035 )
									ret := 0.000000
								if( bbm > 0.035 )
									ret := -0.787879 // sell
							if( Lower_Band > 194.283 )
								if( basis <= 195.377 )
									ret := 0.625000
								if( basis > 195.377 )
									ret := -0.200000
			if( bbp > 0.676428 )
				if( basis <= 193.359 )
					if( Lower_Band <= 175.945 )
						if( Upper_Band <= 176.972 )
							if( Upper_Band <= 174.571 )
								if( Lower_Band <= 172.18 )
									ret := -0.162815
								if( Lower_Band > 172.18 )
									ret := -0.694444
							if( Upper_Band > 174.571 )
								if( Lower_Band <= 173.988 )
									ret := 0.237668
								if( Lower_Band > 173.988 )
									ret := -0.360825
						if( Upper_Band > 176.972 )
							if( Upper_Band <= 177.426 )
								if( bbm <= 0.348641 )
									ret := -0.962963 // sell
								if( bbm > 0.348641 )
									ret := -0.615385
							if( Upper_Band > 177.426 )
								if( bbm <= 1.45498 )
									ret := -0.522727
								if( bbm > 1.45498 )
									ret := 0.750000 // buy
					if( Lower_Band > 175.945 )
						if( basis <= 182.132 )
							if( bbm <= 0.2904 )
								if( Lower_Band <= 177.526 )
									ret := 0.248276
								if( Lower_Band > 177.526 )
									ret := -0.183036
							if( bbm > 0.2904 )
								if( basis <= 181.3 )
									ret := 0.219298
								if( basis > 181.3 )
									ret := 0.746479 // buy
						if( basis > 182.132 )
							if( bearPower <= 0.912655 )
								if( basis <= 187.134 )
									ret := -0.384201
								if( basis > 187.134 )
									ret := -0.010830
							if( bearPower > 0.912655 )
								if( Upper_Band <= 193.985 )
									ret := 0.777778 // buy
								if( Upper_Band > 193.985 )
									ret := -0.230769
				if( basis > 193.359 )
					if( bearPower <= 1.8204 )
						if( Lower_Band <= 194.278 )
							if( Upper_Band <= 194.795 )
								if( bbm <= 0.312242 )
									ret := 0.062500
								if( bbm > 0.312242 )
									ret := -0.692308
							if( Upper_Band > 194.795 )
								if( bbm <= 0.2206 )
									ret := -0.560976
								if( bbm > 0.2206 )
									ret := -0.850000 // sell
						if( Lower_Band > 194.278 )
							if( Upper_Band <= 196.186 )
								if( bullPower <= 0.553778 )
									ret := 0.250000
								if( bullPower > 0.553778 )
									ret := 0.750000 // buy
							if( Upper_Band > 196.186 )
								if( basis <= 195.851 )
									ret := -0.818182 // sell
								if( basis > 195.851 )
									ret := 0.250000
					if( bearPower > 1.8204 )
						ret := 1.000000 // buy
		if( Upper_Band > 196.649 )
			if( Lower_Band <= 192.715 )
				if( Lower_Band <= 192.115 )
					ret := 1.000000 // buy
				if( Lower_Band > 192.115 )
					if( bullPower <= 3.47097 )
						ret := 0.000000
					if( bullPower > 3.47097 )
						ret := 1.000000 // buy
			if( Lower_Band > 192.715 )
				if( Lower_Band <= 207.324 )
					if( basis <= 206.696 )
						if( Upper_Band <= 205.32 )
							if( Upper_Band <= 201.216 )
								if( basis <= 197.022 )
									ret := 0.074074
								if( basis > 197.022 )
									ret := -0.480000
							if( Upper_Band > 201.216 )
								if( bbp <= 3.68909 )
									ret := 0.965517 // buy
								if( bbp > 3.68909 )
									ret := -0.714286 // sell
						if( Upper_Band > 205.32 )
							if( basis <= 204.781 )
								if( Lower_Band <= 196.507 )
									ret := -0.200000
								if( Lower_Band > 196.507 )
									ret := -0.880000 // sell
							if( basis > 204.781 )
								if( bbp <= 2.65151 )
									ret := 0.175000
								if( bbp > 2.65151 )
									ret := -0.750000 // sell
					if( basis > 206.696 )
						if( Upper_Band <= 208.239 )
							if( basis <= 207.487 )
								ret := 0.000000
							if( basis > 207.487 )
								ret := -1.000000 // sell
						if( Upper_Band > 208.239 )
							if( bbm <= 1.12489 )
								if( basis <= 209.776 )
									ret := 0.622642
								if( basis > 209.776 )
									ret := 0.972222 // buy
							if( bbm > 1.12489 )
								if( Lower_Band <= 204.737 )
									ret := 0.576923
								if( Lower_Band > 204.737 )
									ret := -0.818182 // sell
				if( Lower_Band > 207.324 )
					if( bearPower <= 0.312912 )
						if( Upper_Band <= 230.637 )
							if( basis <= 226.542 )
								if( bbm <= 0.251095 )
									ret := -0.206897
								if( bbm > 0.251095 )
									ret := 0.127027
							if( basis > 226.542 )
								if( bullPower <= 0.506329 )
									ret := 0.000000
								if( bullPower > 0.506329 )
									ret := -0.690000
						if( Upper_Band > 230.637 )
							if( Upper_Band <= 232.3 )
								if( Lower_Band <= 229.545 )
									ret := 0.725000 // buy
								if( Lower_Band > 229.545 )
									ret := 0.294118
							if( Upper_Band > 232.3 )
								if( bullPower <= 0.569451 )
									ret := 0.411765
								if( bullPower > 0.569451 )
									ret := -0.642857
					if( bearPower > 0.312912 )
						if( Lower_Band <= 213.841 )
							if( Upper_Band <= 218.957 )
								if( bullPower <= 0.501661 )
									ret := 0.647059
								if( bullPower > 0.501661 )
									ret := -0.454955
							if( Upper_Band > 218.957 )
								if( bullPower <= 2.72064 )
									ret := 0.806452 // buy
								if( bullPower > 2.72064 )
									ret := -0.666667
						if( Lower_Band > 213.841 )
							if( Lower_Band <= 215.889 )
								if( bbm <= 0.232715 )
									ret := -0.130435
								if( bbm > 0.232715 )
									ret := 0.677419
							if( Lower_Band > 215.889 )
								if( Lower_Band <= 218.282 )
									ret := -0.120000
								if( Lower_Band > 218.282 )
									ret := 0.162611
	
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
float op_operation = decision_tree_0_AAPL_5Min_d5e3e97a(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


