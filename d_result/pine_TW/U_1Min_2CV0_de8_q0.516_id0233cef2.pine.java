//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: U_1Min_2CV0_0233cef2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2CV0_0233cef2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_0233cef2(ad_mf, mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad_mf <= -0.300323 )
		if( ad_mf <= -132139 )
			if( ad_mf <= -183431 )
				if( VIM <= 0.904319 )
					if( VIP <= 1.21392 )
						if( VIP_VIM <= 0.330228 )
							if( VIP <= 1.08355 )
								ret := -0.250000
							if( VIP > 1.08355 )
								ret := -0.437500
						if( VIP_VIM > 0.330228 )
							ret := -0.947368 // sell
					if( VIP > 1.21392 )
						if( VIM <= 0.630082 )
							ret := 1.000000 // buy
						if( VIM > 0.630082 )
							ret := 0.125000
				if( VIM > 0.904319 )
					if( ad_mf <= -509312 )
						if( VIP_VIM <= -0.262765 )
							ret := 0.733333 // buy
						if( VIP_VIM > -0.262765 )
							ret := 1.000000 // buy
					if( ad_mf > -509312 )
						if( VIM <= 1.32568 )
							if( mf <= -0.331753 )
								if( ad_mf <= -237473 )
									ret := 0.241379
								if( ad_mf > -237473 )
									ret := -0.655172
							if( mf > -0.331753 )
								if( VIP_VIM <= 0.075007 )
									ret := 0.270833
								if( VIP_VIM > 0.075007 )
									ret := 0.846154 // buy
						if( VIM > 1.32568 )
							ret := 1.000000 // buy
			if( ad_mf > -183431 )
				if( VIM <= 1.36076 )
					if( VIP <= 1.28972 )
						if( ad_mf <= -162051 )
							ret := 1.000000 // buy
						if( ad_mf > -162051 )
							if( ad_mf <= -152746 )
								if( VIP <= 0.754778 )
									ret := -0.416667
								if( VIP > 0.754778 )
									ret := 0.448276
							if( ad_mf > -152746 )
								if( VIM <= 0.975035 )
									ret := 0.520000
								if( VIM > 0.975035 )
									ret := 0.932203 // buy
					if( VIP > 1.28972 )
						ret := 0.000000
				if( VIM > 1.36076 )
					ret := 0.000000
		if( ad_mf > -132139 )
			if( VIP <= 1.18891 )
				if( VIP_VIM <= -0.832952 )
					if( ad <= -38998.2 )
						if( VIM <= 1.40365 )
							ret := -0.142857
						if( VIM > 1.40365 )
							if( VIM <= 1.53655 )
								if( ad_mf <= -52165.2 )
									ret := 0.967742 // buy
								if( ad_mf > -52165.2 )
									ret := 0.666667
							if( VIM > 1.53655 )
								ret := 0.636364
					if( ad > -38998.2 )
						if( VIP <= 0.483283 )
							if( ad_mf <= -13224.4 )
								if( mf <= -0.351058 )
									ret := -0.045455
								if( mf > -0.351058 )
									ret := -0.619048
							if( ad_mf > -13224.4 )
								if( mf <= -0.479631 )
									ret := -0.444444
								if( mf > -0.479631 )
									ret := 0.454545
						if( VIP > 0.483283 )
							if( ad <= -7912.04 )
								if( ad <= -19363.9 )
									ret := 0.298701
								if( ad > -19363.9 )
									ret := -0.114035
							if( ad > -7912.04 )
								if( VIM <= 1.64061 )
									ret := 0.204545
								if( VIM > 1.64061 )
									ret := 0.556701
				if( VIP_VIM > -0.832952 )
					if( ad <= -124542 )
						if( VIP_VIM <= -0.104358 )
							if( VIP <= 0.779193 )
								ret := -1.000000 // sell
							if( VIP > 0.779193 )
								ret := -0.818182 // sell
						if( VIP_VIM > -0.104358 )
							ret := -0.230769
					if( ad > -124542 )
						if( ad <= -114685 )
							if( ad_mf <= -119027 )
								if( VIP_VIM <= -0.190904 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.190904 )
									ret := 0.470588
							if( ad_mf > -119027 )
								if( VIP_VIM <= -0.216334 )
									ret := -0.150000
								if( VIP_VIM > -0.216334 )
									ret := 0.809524 // buy
						if( ad > -114685 )
							if( ad_mf <= -107911 )
								if( ad_mf <= -110584 )
									ret := -0.333333
								if( ad_mf > -110584 )
									ret := -0.891892 // sell
							if( ad_mf > -107911 )
								if( mf <= -0.542851 )
									ret := 0.349515
								if( mf > -0.542851 )
									ret := 0.017492
			if( VIP > 1.18891 )
				if( mf <= -0.122166 )
					if( ad <= -3975.84 )
						if( VIM <= 1.32124 )
							if( VIP_VIM <= 0.642813 )
								if( ad_mf <= -42360.4 )
									ret := 0.894737 // buy
								if( ad_mf > -42360.4 )
									ret := 0.047170
							if( VIP_VIM > 0.642813 )
								if( mf <= -0.1774 )
									ret := 0.794872 // buy
								if( mf > -0.1774 )
									ret := 0.352941
						if( VIM > 1.32124 )
							if( VIP <= 1.56951 )
								if( ad <= -21000.5 )
									ret := -0.750000 // sell
								if( ad > -21000.5 )
									ret := -0.255319
							if( VIP > 1.56951 )
								if( ad_mf <= -4226.42 )
									ret := 0.165605
								if( ad_mf > -4226.42 )
									ret := -0.833333 // sell
					if( ad > -3975.84 )
						if( VIM <= 1.21547 )
							if( mf <= -0.358182 )
								if( mf <= -0.521053 )
									ret := 0.153846
								if( mf > -0.521053 )
									ret := -0.775000 // sell
							if( mf > -0.358182 )
								if( VIM <= 1.1706 )
									ret := -0.069444
								if( VIM > 1.1706 )
									ret := 0.451613
						if( VIM > 1.21547 )
							if( ad_mf <= -1687.34 )
								if( VIP_VIM <= 0.450198 )
									ret := 0.634199
								if( VIP_VIM > 0.450198 )
									ret := -0.122449
							if( ad_mf > -1687.34 )
								if( ad_mf <= -1580.32 )
									ret := -0.541667
								if( ad_mf > -1580.32 )
									ret := 0.280569
				if( mf > -0.122166 )
					if( ad_mf <= -41951.8 )
						if( VIM <= 0.82023 )
							if( ad_mf <= -111999 )
								ret := 0.913043 // buy
							if( ad_mf > -111999 )
								if( mf <= 0.288848 )
									ret := 0.376106
								if( mf > 0.288848 )
									ret := -0.266667
						if( VIM > 0.82023 )
							if( mf <= 0.075352 )
								ret := 0.555556
							if( mf > 0.075352 )
								ret := -0.380952
					if( ad_mf > -41951.8 )
						if( mf <= 0.628473 )
							if( ad <= -41256.8 )
								if( mf <= 0.042188 )
									ret := -0.909091 // sell
								if( mf > 0.042188 )
									ret := -1.000000 // sell
							if( ad > -41256.8 )
								if( mf <= 0.463298 )
									ret := 0.050535
								if( mf > 0.463298 )
									ret := 0.200900
						if( mf > 0.628473 )
							if( VIP_VIM <= 0.959792 )
								if( mf <= 0.751633 )
									ret := -0.166667
								if( mf > 0.751633 )
									ret := 0.181818
							if( VIP_VIM > 0.959792 )
								if( VIP <= 4.75601 )
									ret := -0.769231 // sell
								if( VIP > 4.75601 )
									ret := 0.161290
	if( ad_mf > -0.300323 )
		if( VIP_VIM <= -1.43051 )
			if( VIM <= 16.8977 )
				if( VIM <= 2.31312 )
					ret := -0.733333 // sell
				if( VIM > 2.31312 )
					if( VIP <= 0.958574 )
						ret := 0.952381 // buy
					if( VIP > 0.958574 )
						if( ad_mf <= -0.197116 )
							if( VIM <= 4.81855 )
								ret := 0.666667
							if( VIM > 4.81855 )
								ret := -0.352941
						if( ad_mf > -0.197116 )
							if( VIM <= 7.58418 )
								if( VIP <= 1.45587 )
									ret := -0.583333
								if( VIP > 1.45587 )
									ret := 0.255319
							if( VIM > 7.58418 )
								if( VIP_VIM <= -1.78481 )
									ret := 0.391026
								if( VIP_VIM > -1.78481 )
									ret := 0.677083
			if( VIM > 16.8977 )
				if( VIP_VIM <= -1.70135 )
					if( mf <= -0.219571 )
						if( ad_mf <= 0.298894 )
							ret := 0.166667
						if( ad_mf > 0.298894 )
							ret := 0.230769
					if( mf > -0.219571 )
						if( VIP <= 18.965 )
							if( VIP <= 16.5046 )
								if( VIP <= 15.7048 )
									ret := -0.444444
								if( VIP > 15.7048 )
									ret := -0.846154 // sell
							if( VIP > 16.5046 )
								if( mf <= -0.132939 )
									ret := -0.666667
								if( mf > -0.132939 )
									ret := -0.285714
						if( VIP > 18.965 )
							if( mf <= 0.047744 )
								if( VIM <= 28.6491 )
									ret := -0.071429
								if( VIM > 28.6491 )
									ret := -0.500000
							if( mf > 0.047744 )
								if( mf <= 0.139627 )
									ret := 0.150000
								if( mf > 0.139627 )
									ret := -0.166667
				if( VIP_VIM > -1.70135 )
					ret := 0.800000 // buy
		if( VIP_VIM > -1.43051 )
			if( mf <= -0.34052 )
				if( mf <= -0.341695 )
					if( VIP_VIM <= -0.395311 )
						if( VIM <= 1.35376 )
							if( ad <= 21984.8 )
								if( VIM <= 1.20464 )
									ret := 0.466667
								if( VIM > 1.20464 )
									ret := 0.033816
							if( ad > 21984.8 )
								if( ad_mf <= 31676.8 )
									ret := -0.894737 // sell
								if( ad_mf > 31676.8 )
									ret := -0.166667
						if( VIM > 1.35376 )
							if( ad_mf <= 0.484435 )
								if( ad_mf <= 0.357133 )
									ret := 0.097561
								if( ad_mf > 0.357133 )
									ret := 0.460241
							if( ad_mf > 0.484435 )
								if( VIM <= 1.89914 )
									ret := 0.302239
								if( VIM > 1.89914 )
									ret := 0.088353
					if( VIP_VIM > -0.395311 )
						if( mf <= -0.733228 )
							if( ad_mf <= 0.79204 )
								ret := 0.700000 // buy
							if( ad_mf > 0.79204 )
								if( VIP <= 1.43701 )
									ret := 0.428571
								if( VIP > 1.43701 )
									ret := -0.105263
						if( mf > -0.733228 )
							if( ad_mf <= 0.486011 )
								if( ad_mf <= 0.425267 )
									ret := -0.034596
								if( ad_mf > 0.425267 )
									ret := 0.199313
							if( ad_mf > 0.486011 )
								if( mf <= -0.3513 )
									ret := -0.112936
								if( mf > -0.3513 )
									ret := 0.191176
				if( mf > -0.341695 )
					ret := 0.619048
			if( mf > -0.34052 )
				if( ad_mf <= 4740.34 )
					if( VIP_VIM <= -0.168573 )
						if( ad <= 3427 )
							if( VIM <= 8.98678 )
								if( VIP_VIM <= -0.391509 )
									ret := -0.020575
								if( VIP_VIM > -0.391509 )
									ret := 0.066267
							if( VIM > 8.98678 )
								if( VIP <= 10.9528 )
									ret := -0.438424
								if( VIP > 10.9528 )
									ret := -0.056478
						if( ad > 3427 )
							if( ad_mf <= 4158.18 )
								if( VIP <= 1.5207 )
									ret := -0.323171
								if( VIP > 1.5207 )
									ret := -0.913043 // sell
							if( ad_mf > 4158.18 )
								if( ad <= 4636.05 )
									ret := 0.051587
								if( ad > 4636.05 )
									ret := -0.529412
					if( VIP_VIM > -0.168573 )
						if( mf <= -0.186343 )
							if( ad_mf <= 0.223788 )
								if( VIM <= 1.06056 )
									ret := 0.568966
								if( VIM > 1.06056 )
									ret := 0.094637
							if( ad_mf > 0.223788 )
								if( ad <= 3417.61 )
									ret := -0.055952
								if( ad > 3417.61 )
									ret := 0.159664
						if( mf > -0.186343 )
							if( ad_mf <= 390.866 )
								if( ad <= 63.6462 )
									ret := -0.087747
								if( ad > 63.6462 )
									ret := 0.155722
							if( ad_mf > 390.866 )
								if( VIM <= 1.11774 )
									ret := -0.103649
								if( VIM > 1.11774 )
									ret := -0.383710
				if( ad_mf > 4740.34 )
					if( VIM <= 0.666735 )
						if( VIP <= 1.53705 )
							if( mf <= 0.317518 )
								if( ad <= 8439.01 )
									ret := 0.478261
								if( ad > 8439.01 )
									ret := -0.013514
							if( mf > 0.317518 )
								if( VIP <= 1.25559 )
									ret := -0.117647
								if( VIP > 1.25559 )
									ret := 0.319475
						if( VIP > 1.53705 )
							if( mf <= 0.409131 )
								if( VIM <= 0.462176 )
									ret := -0.230769
								if( VIM > 0.462176 )
									ret := -0.846154 // sell
							if( mf > 0.409131 )
								ret := 0.047619
					if( VIM > 0.666735 )
						if( VIP <= 0.976817 )
							if( ad_mf <= 5740.65 )
								if( VIP <= 0.798195 )
									ret := -0.106667
								if( VIP > 0.798195 )
									ret := 0.213028
							if( ad_mf > 5740.65 )
								if( VIP <= 0.642792 )
									ret := 0.122500
								if( VIP > 0.642792 )
									ret := -0.060782
						if( VIP > 0.976817 )
							if( ad <= 4779.84 )
								if( VIP_VIM <= 0.195492 )
									ret := 0.815789 // buy
								if( VIP_VIM > 0.195492 )
									ret := 0.133333
							if( ad > 4779.84 )
								if( ad_mf <= 274270 )
									ret := 0.002768
								if( ad_mf > 274270 )
									ret := -0.580000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_U_1Min_0233cef2(ad_mf, mf, ad, VIP, VIP_VIM, VIM)

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


