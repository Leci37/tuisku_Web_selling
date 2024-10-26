//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow
// ID_model: TRXUSDT_1Min_1C00_5477fe85 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_1Min_1C00_5477fe85", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_1Min_5477fe85(mf, ad, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( mf <= 0.095745 )
		if( ad <= -1893.02 )
			if( ad_mf <= -95162.5 )
				if( mf <= -0.198129 )
					if( ad_mf <= -6.24511e+06 )
						if( ad <= -1.05614e+07 )
							if( mf <= -0.340087 )
								ret := 0.769231 // buy
							if( mf > -0.340087 )
								ret := -0.666667
						if( ad > -1.05614e+07 )
							if( ad_mf <= -7.36434e+06 )
								ret := 1.000000 // buy
							if( ad_mf > -7.36434e+06 )
								ret := 0.875000 // buy
					if( ad_mf > -6.24511e+06 )
						if( mf <= -0.385878 )
							if( mf <= -0.578319 )
								ret := -0.046012
							if( mf > -0.578319 )
								ret := 0.078073
						if( mf > -0.385878 )
							if( mf <= -0.385774 )
								ret := 1.000000 // buy
							if( mf > -0.385774 )
								ret := 0.173007
				if( mf > -0.198129 )
					if( ad <= -2.57159e+06 )
						if( mf <= -0.185294 )
							if( ad <= -4.11137e+06 )
								ret := -1.000000 // sell
							if( ad > -4.11137e+06 )
								ret := -0.384615
						if( mf > -0.185294 )
							if( mf <= -0.165081 )
								ret := 0.875000 // buy
							if( mf > -0.165081 )
								ret := -0.072917
					if( ad > -2.57159e+06 )
						if( mf <= -0.052746 )
							if( ad <= -2.18443e+06 )
								ret := 0.752809 // buy
							if( ad > -2.18443e+06 )
								ret := 0.247375
						if( mf > -0.052746 )
							if( ad_mf <= -457684 )
								ret := 0.415352
							if( ad_mf > -457684 )
								ret := 0.286638
			if( ad_mf > -95162.5 )
				if( ad_mf <= -29519.4 )
					if( ad_mf <= -29567.5 )
						if( mf <= -0.357546 )
							if( ad <= -89473.8 )
								ret := 0.662162
							if( ad > -89473.8 )
								ret := 0.381433
						if( mf > -0.357546 )
							if( ad <= -47275.8 )
								ret := 0.328769
							if( ad > -47275.8 )
								ret := 0.397070
					if( ad_mf > -29567.5 )
						if( ad <= -29553.6 )
							if( ad <= -29557.8 )
								ret := -0.900000 // sell
							if( ad > -29557.8 )
								ret := -0.538462
						if( ad > -29553.6 )
							if( ad <= -29546.1 )
								ret := 0.750000 // buy
							if( ad > -29546.1 )
								ret := -0.181818
				if( ad_mf > -29519.4 )
					if( mf <= -0.593654 )
						if( mf <= -0.605867 )
							if( ad <= -27648 )
								ret := 0.000000
							if( ad > -27648 )
								ret := 0.372881
						if( mf > -0.605867 )
							if( mf <= -0.603408 )
								ret := -0.285714
							if( mf > -0.603408 )
								ret := 0.000000
					if( mf > -0.593654 )
						if( mf <= -0.207094 )
							if( ad_mf <= -15745.8 )
								ret := 0.457767
							if( ad_mf > -15745.8 )
								ret := 0.555472
						if( mf > -0.207094 )
							if( ad_mf <= -14810.1 )
								ret := 0.415268
							if( ad_mf > -14810.1 )
								ret := 0.517146
		if( ad > -1893.02 )
			if( ad_mf <= 0.419725 )
				if( ad_mf <= -0.085655 )
					if( mf <= 0.092763 )
						if( mf <= 0.091701 )
							if( ad_mf <= -0.0906 )
								ret := 0.300000
							if( ad_mf > -0.0906 )
								ret := -0.294294
						if( mf > 0.091701 )
							ret := -0.607843
					if( mf > 0.092763 )
						if( ad_mf <= -0.094747 )
							if( mf <= 0.095141 )
								ret := -0.923077 // sell
							if( mf > 0.095141 )
								ret := -0.206897
						if( ad_mf > -0.094747 )
							if( ad_mf <= -0.093864 )
								ret := 0.690909
							if( ad_mf > -0.093864 )
								ret := 0.042857
				if( ad_mf > -0.085655 )
					ret := 0.030425
			if( ad_mf > 0.419725 )
				if( mf <= -0.058971 )
					if( mf <= -0.059248 )
						if( ad_mf <= 32359 )
							if( mf <= -0.449382 )
								ret := -0.246085
							if( mf > -0.449382 )
								ret := -0.315058
						if( ad_mf > 32359 )
							if( mf <= -0.390879 )
								ret := -0.274740
							if( mf > -0.390879 )
								ret := -0.219526
					if( mf > -0.059248 )
						if( ad <= 33808.2 )
							if( ad_mf <= 17676.4 )
								ret := 0.000000
							if( ad_mf > 17676.4 )
								ret := -0.500000
						if( ad > 33808.2 )
							if( mf <= -0.059125 )
								ret := 1.000000 // buy
							if( mf > -0.059125 )
								ret := 0.000000
				if( mf > -0.058971 )
					if( ad_mf <= 3264.88 )
						if( ad <= 2045.6 )
							ret := -0.615385
						if( ad > 2045.6 )
							if( mf <= -0.019002 )
								ret := -0.714286 // sell
							if( mf > -0.019002 )
								ret := -0.941176 // sell
					if( ad_mf > 3264.88 )
						if( ad_mf <= 5963.69 )
							if( mf <= 0.065105 )
								ret := 0.057971
							if( mf > 0.065105 )
								ret := -0.253521
						if( ad_mf > 5963.69 )
							if( mf <= 0.095555 )
								ret := -0.286659
							if( mf > 0.095555 )
								ret := 0.137931
	if( mf > 0.095745 )
		if( mf <= 0.423767 )
			if( ad <= -856.8 )
				if( ad <= -31835.6 )
					if( mf <= 0.329395 )
						if( ad_mf <= -1.61986e+06 )
							if( ad <= -1.82404e+06 )
								ret := 0.080645
							if( ad > -1.82404e+06 )
								ret := -0.574713
						if( ad_mf > -1.61986e+06 )
							if( mf <= 0.102203 )
								ret := 0.260958
							if( mf > 0.102203 )
								ret := 0.394236
					if( mf > 0.329395 )
						if( ad <= -64260.4 )
							if( ad_mf <= -71101.1 )
								ret := 0.455892
							if( ad_mf > -71101.1 )
								ret := 0.292490
						if( ad > -64260.4 )
							if( ad <= -60257.2 )
								ret := 0.740964 // buy
							if( ad > -60257.2 )
								ret := 0.535753
				if( ad > -31835.6 )
					if( mf <= 0.162222 )
						if( mf <= 0.161674 )
							if( ad_mf <= -10100.3 )
								ret := 0.418492
							if( ad_mf > -10100.3 )
								ret := 0.591304
						if( mf > 0.161674 )
							if( ad <= -15762.1 )
								ret := -0.096774
							if( ad > -15762.1 )
								ret := 0.833333 // buy
					if( mf > 0.162222 )
						if( mf <= 0.40252 )
							if( ad <= -23775.3 )
								ret := 0.482786
							if( ad > -23775.3 )
								ret := 0.568488
						if( mf > 0.40252 )
							if( ad_mf <= -16976.8 )
								ret := 0.570342
							if( ad_mf > -16976.8 )
								ret := 0.818182 // buy
			if( ad > -856.8 )
				if( ad <= 1956.26 )
					if( ad_mf <= -0.328331 )
						ret := 0.099925
					if( ad_mf > -0.328331 )
						if( mf <= 0.096014 )
							if( mf <= 0.095873 )
								ret := -1.000000 // sell
							if( mf > 0.095873 )
								ret := -0.571429
						if( mf > 0.096014 )
							if( mf <= 0.3231 )
								ret := -0.020177
							if( mf > 0.3231 )
								ret := -0.303371
				if( ad > 1956.26 )
					if( ad <= 101304 )
						if( ad_mf <= 44638.9 )
							if( mf <= 0.272426 )
								ret := -0.353215
							if( mf > 0.272426 )
								ret := -0.404057
						if( ad_mf > 44638.9 )
							if( ad_mf <= 45122.3 )
								ret := -0.027523
							if( ad_mf > 45122.3 )
								ret := -0.332280
					if( ad > 101304 )
						if( mf <= 0.316767 )
							if( ad_mf <= 810978 )
								ret := -0.282940
							if( ad_mf > 810978 )
								ret := -0.192421
						if( mf > 0.316767 )
							if( mf <= 0.404723 )
								ret := -0.231111
							if( mf > 0.404723 )
								ret := -0.158151
		if( mf > 0.423767 )
			if( mf <= 0.698953 )
				if( ad_mf <= -0.673804 )
					if( ad_mf <= -77408.5 )
						if( ad_mf <= -107940 )
							if( ad_mf <= -969005 )
								ret := -0.107143
							if( ad_mf > -969005 )
								ret := 0.480201
						if( ad_mf > -107940 )
							if( ad <= -104618 )
								ret := -0.309091
							if( ad > -104618 )
								ret := 0.324104
					if( ad_mf > -77408.5 )
						if( mf <= 0.525364 )
							if( mf <= 0.428365 )
								ret := 0.691489
							if( mf > 0.428365 )
								ret := 0.539356
						if( mf > 0.525364 )
							if( mf <= 0.680682 )
								ret := 0.604249
							if( mf > 0.680682 )
								ret := 0.437908
				if( ad_mf > -0.673804 )
					if( mf <= 0.424433 )
						if( ad <= 25988.1 )
							if( ad_mf <= -0.424158 )
								ret := -0.833333 // sell
							if( ad_mf > -0.424158 )
								ret := -0.933333 // sell
						if( ad > 25988.1 )
							if( ad_mf <= 409373 )
								ret := -0.440000
							if( ad_mf > 409373 )
								ret := -1.000000 // sell
					if( mf > 0.424433 )
						if( ad <= 1693.85 )
							if( mf <= 0.521823 )
								ret := 0.110543
							if( mf > 0.521823 )
								ret := -0.170467
						if( ad > 1693.85 )
							if( ad_mf <= 78074.6 )
								ret := -0.427009
							if( ad_mf > 78074.6 )
								ret := -0.277496
			if( mf > 0.698953 )
				if( ad_mf <= -3606.4 )
					if( ad <= -26785.4 )
						if( ad <= -76935.7 )
							if( ad_mf <= -103041 )
								ret := 0.609195
							if( ad_mf > -103041 )
								ret := 0.185185
						if( ad > -76935.7 )
							if( mf <= 0.732275 )
								ret := 0.779661 // buy
							if( mf > 0.732275 )
								ret := 0.680769
					if( ad > -26785.4 )
						if( mf <= 0.716163 )
							if( ad_mf <= -15804.9 )
								ret := 0.875000 // buy
							if( ad_mf > -15804.9 )
								ret := 0.724138 // buy
						if( mf > 0.716163 )
							if( ad <= -25306.7 )
								ret := -0.250000
							if( ad > -25306.7 )
								ret := 0.553125
				if( ad_mf > -3606.4 )
					if( mf <= 0.908494 )
						if( ad <= 0 )
							if( mf <= 0.824579 )
								ret := 0.265432
							if( mf > 0.824579 )
								ret := -0.523077
						if( ad > 0 )
							if( ad <= 6422.02 )
								ret := -0.771930 // sell
							if( ad > 6422.02 )
								ret := -0.241100
					if( mf > 0.908494 )
						if( mf <= 0.912512 )
							if( ad_mf <= 79449.6 )
								ret := 0.545455
							if( ad_mf > 79449.6 )
								ret := 0.000000
						if( mf > 0.912512 )
							if( mf <= 0.918124 )
								ret := -0.307692
							if( mf > 0.918124 )
								ret := 0.061947
	
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
float op_operation = decision_tree_0_TRXUSDT_1Min_5477fe85(mf, ad, ad_mf)

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


