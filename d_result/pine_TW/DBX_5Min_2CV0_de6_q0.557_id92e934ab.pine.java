//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: DBX_5Min_2CV0_92e934ab Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DBX_5Min_2CV0_92e934ab", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DBX_5Min_92e934ab(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( VIP <= 1.45873 )
		if( VIM <= 0.864419 )
			if( mf <= 0.02646 )
				if( ad <= -147607 )
					if( ad_mf <= -218020 )
						if( ad_mf <= -350193 )
							ret := 0.625000
						if( ad_mf > -350193 )
							ret := -0.600000
					if( ad_mf > -218020 )
						if( VIP <= 1.15043 )
							ret := 0.500000
						if( VIP > 1.15043 )
							ret := 1.000000 // buy
				if( ad > -147607 )
					if( ad_mf <= -105647 )
						if( VIP_VIM <= 0.239083 )
							ret := -0.333333
						if( VIP_VIM > 0.239083 )
							ret := -0.828571 // sell
					if( ad_mf > -105647 )
						if( ad <= -89588.9 )
							ret := 0.727273 // buy
						if( ad > -89588.9 )
							ret := -0.168513
			if( mf > 0.02646 )
				if( ad_mf <= 55052.1 )
					if( ad_mf <= -77360.9 )
						if( mf <= 0.071011 )
							ret := -0.307692
						if( mf > 0.071011 )
							ret := 0.848485 // buy
					if( ad_mf > -77360.9 )
						if( ad_mf <= 52188.2 )
							ret := 0.013916
						if( ad_mf > 52188.2 )
							ret := 0.714286 // buy
				if( ad_mf > 55052.1 )
					if( ad_mf <= 81259.9 )
						if( ad <= 68810.5 )
							ret := -0.147541
						if( ad > 68810.5 )
							ret := -0.915254 // sell
					if( ad_mf > 81259.9 )
						if( ad <= 403053 )
							ret := -0.031469
						if( ad > 403053 )
							ret := -0.956522 // sell
		if( VIM > 0.864419 )
			if( VIM <= 1.95434 )
				if( mf <= 0.439844 )
					if( ad_mf <= -74360.6 )
						if( VIM <= 0.944824 )
							ret := -0.244681
						if( VIM > 0.944824 )
							ret := 0.201176
					if( ad_mf > -74360.6 )
						if( ad <= -70157.2 )
							ret := -0.633803
						if( ad > -70157.2 )
							ret := 0.018576
				if( mf > 0.439844 )
					if( ad_mf <= 342892 )
						if( VIP <= 1.29394 )
							ret := 0.547486
						if( VIP > 1.29394 )
							ret := 0.080000
					if( ad_mf > 342892 )
						if( VIP_VIM <= -0.435082 )
							ret := 1.000000 // buy
						if( VIP_VIM > -0.435082 )
							ret := -0.920000 // sell
			if( VIM > 1.95434 )
				if( mf <= -0.163933 )
					if( ad_mf <= -460.558 )
						ret := 0.000000
					if( ad_mf > -460.558 )
						if( VIP <= 1.19003 )
							ret := 0.555556
						if( VIP > 1.19003 )
							ret := 0.960784 // buy
				if( mf > -0.163933 )
					if( mf <= -0.062846 )
						if( VIP <= 1.37536 )
							ret := -0.583333
						if( VIP > 1.37536 )
							ret := -1.000000 // sell
					if( mf > -0.062846 )
						if( VIM <= 2.11417 )
							ret := 0.555556
						if( VIM > 2.11417 )
							ret := -0.500000
	if( VIP > 1.45873 )
		if( mf <= -0.129399 )
			if( VIP_VIM <= -0.091641 )
				if( VIP <= 3.33217 )
					if( VIP_VIM <= -0.583061 )
						if( VIM <= 2.58654 )
							ret := 0.500000
						if( VIM > 2.58654 )
							ret := 0.968750 // buy
					if( VIP_VIM > -0.583061 )
						if( mf <= -0.622518 )
							ret := 1.000000 // buy
						if( mf > -0.622518 )
							ret := 0.266332
				if( VIP > 3.33217 )
					if( ad_mf <= 421.559 )
						if( ad_mf <= -9171 )
							ret := 0.200000
						if( ad_mf > -9171 )
							ret := -0.879310 // sell
					if( ad_mf > 421.559 )
						if( VIP_VIM <= -0.178279 )
							ret := 0.884615 // buy
						if( VIP_VIM > -0.178279 )
							ret := -0.666667
			if( VIP_VIM > -0.091641 )
				if( VIM <= 1.36828 )
					if( mf <= -0.466101 )
						ret := -1.000000 // sell
					if( mf > -0.466101 )
						if( ad <= -23844.9 )
							ret := 0.815789 // buy
						if( ad > -23844.9 )
							ret := 0.281250
				if( VIM > 1.36828 )
					if( VIP <= 2.06688 )
						if( VIP_VIM <= 0.079126 )
							ret := -0.578947
						if( VIP_VIM > 0.079126 )
							ret := -0.283688
					if( VIP > 2.06688 )
						if( VIM <= 5.18606 )
							ret := 0.182510
						if( VIM > 5.18606 )
							ret := -0.730769 // sell
		if( mf > -0.129399 )
			if( mf <= 0.284739 )
				if( VIM <= 3.56734 )
					if( VIM <= 1.0596 )
						if( ad_mf <= 9266.5 )
							ret := -0.043860
						if( ad_mf > 9266.5 )
							ret := 0.429907
					if( VIM > 1.0596 )
						if( VIM <= 1.55085 )
							ret := -0.313447
						if( VIM > 1.55085 )
							ret := -0.097364
				if( VIM > 3.56734 )
					if( VIP <= 3.99201 )
						if( mf <= 0.225359 )
							ret := 0.659091
						if( mf > 0.225359 )
							ret := -0.916667 // sell
					if( VIP > 3.99201 )
						if( ad_mf <= -0.204231 )
							ret := 0.637681
						if( ad_mf > -0.204231 )
							ret := -0.234513
			if( mf > 0.284739 )
				if( VIM <= 1.09597 )
					if( mf <= 0.318722 )
						if( ad_mf <= -4048.45 )
							ret := -0.100000
						if( ad_mf > -4048.45 )
							ret := -0.750000 // sell
					if( mf > 0.318722 )
						if( VIM <= 1.06809 )
							ret := 0.035211
						if( VIM > 1.06809 )
							ret := 1.000000 // buy
				if( VIM > 1.09597 )
					if( VIP <= 1.70248 )
						if( ad <= 5773.92 )
							ret := -0.921053 // sell
						if( ad > 5773.92 )
							ret := -0.074074
					if( VIP > 1.70248 )
						if( VIP <= 1.74677 )
							ret := 0.312500
						if( VIP > 1.74677 )
							ret := -0.387187
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_DBX_5Min_92e934ab(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


