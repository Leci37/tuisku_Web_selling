//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AFRM_1Min_2MT0_d3f07ae3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2MT0_d3f07ae3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_d3f07ae3(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 90939.9 )
		if( Positive_Money_Flow <= 1206 )
			if( MFI_Low <= -19.9135 )
				if( Raw_Money_Flow <= 2.62532e+06 )
					ret := -0.555556
				if( Raw_Money_Flow > 2.62532e+06 )
					ret := -1.000000 // sell
			if( MFI_Low > -19.9135 )
				if( tema <= 24.4115 )
					if( Typical_Price <= 24.0733 )
						ret := 0.368421
					if( Typical_Price > 24.0733 )
						ret := -1.000000 // sell
				if( tema > 24.4115 )
					if( Negative_Money_Flow <= 568.104 )
						if( Typical_Price <= 28.6988 )
							if( Money_Flow_Ratio <= 0.677188 )
								if( Raw_Money_Flow <= 4176.95 )
									ret := 0.076923
								if( Raw_Money_Flow > 4176.95 )
									ret := 0.621951
							if( Money_Flow_Ratio > 0.677188 )
								if( ema13 <= 0.007904 )
									ret := 0.117647
								if( ema13 > 0.007904 )
									ret := -0.733333 // sell
						if( Typical_Price > 28.6988 )
							if( tema <= 29.5142 )
								if( MFI_High <= -58.6728 )
									ret := -0.823529 // sell
								if( MFI_High > -58.6728 )
									ret := -0.304348
							if( tema > 29.5142 )
								if( ema3 <= 43.2287 )
									ret := 0.000000
								if( ema3 > 43.2287 )
									ret := 0.454545
					if( Negative_Money_Flow > 568.104 )
						if( Positive_Money_Flow_Sum <= 57700 )
							if( ema2 <= 30.9443 )
								if( Negative_Money_Flow_Sum <= 79998.2 )
									ret := 0.318841
								if( Negative_Money_Flow_Sum > 79998.2 )
									ret := 0.607287
							if( ema2 > 30.9443 )
								if( Raw_Money_Flow <= 91816.8 )
									ret := 0.527027
								if( Raw_Money_Flow > 91816.8 )
									ret := -0.283333
						if( Positive_Money_Flow_Sum > 57700 )
							if( MFI_Low <= 14.5063 )
								if( ema3 <= 33.0816 )
									ret := -0.025926
								if( ema3 > 33.0816 )
									ret := 0.243902
							if( MFI_Low > 14.5063 )
								if( Typical_Price <= 30.8998 )
									ret := 0.593407
								if( Typical_Price > 30.8998 )
									ret := 0.331915
		if( Positive_Money_Flow > 1206 )
			if( MFI_High <= -75.1761 )
				if( MFI_Low <= -15.8314 )
					if( ema13 <= -0.072457 )
						ret := -0.545455
					if( ema13 > -0.072457 )
						if( Positive_Money_Flow_Sum <= 59512.8 )
							ret := 0.000000
						if( Positive_Money_Flow_Sum > 59512.8 )
							ret := -0.111111
				if( MFI_Low > -15.8314 )
					if( Positive_Money_Flow <= 8966.96 )
						if( ema3 <= 31.395 )
							ret := -0.875000 // sell
						if( ema3 > 31.395 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow > 8966.96 )
						ret := -0.500000
			if( MFI_High > -75.1761 )
				if( Raw_Money_Flow <= 30546.3 )
					if( Negative_Money_Flow_Sum <= 98244.5 )
						if( Typical_Price <= 29.7438 )
							if( Negative_Money_Flow_Sum <= 75613.9 )
								if( MFI <= 59.6916 )
									ret := 0.139241
								if( MFI > 59.6916 )
									ret := 0.622222
							if( Negative_Money_Flow_Sum > 75613.9 )
								if( Negative_Money_Flow_Sum <= 79313.2 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 79313.2 )
									ret := -0.468085
						if( Typical_Price > 29.7438 )
							if( Positive_Money_Flow <= 3035.29 )
								if( Raw_Money_Flow <= 3503.07 )
									ret := -0.285714
								if( Raw_Money_Flow > 3503.07 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow > 3035.29 )
								if( ema13 <= 0.025873 )
									ret := -0.379562
								if( ema13 > 0.025873 )
									ret := -0.795455 // sell
					if( Negative_Money_Flow_Sum > 98244.5 )
						if( ema12 <= 0.013545 )
							if( Negative_Money_Flow_Sum <= 144285 )
								if( Positive_Money_Flow <= 5657.54 )
									ret := 0.065217
								if( Positive_Money_Flow > 5657.54 )
									ret := 0.647059
							if( Negative_Money_Flow_Sum > 144285 )
								if( MFI_Low <= -0.858756 )
									ret := -0.129630
								if( MFI_Low > -0.858756 )
									ret := 0.132353
						if( ema12 > 0.013545 )
							if( Raw_Money_Flow <= 13086.7 )
								if( Negative_Money_Flow_Sum <= 113142 )
									ret := 0.187500
								if( Negative_Money_Flow_Sum > 113142 )
									ret := -0.614173
							if( Raw_Money_Flow > 13086.7 )
								if( Typical_Price <= 32.1281 )
									ret := -0.115385
								if( Typical_Price > 32.1281 )
									ret := 0.545455
				if( Raw_Money_Flow > 30546.3 )
					if( ema2 <= 30.9289 )
						if( Positive_Money_Flow <= 32358.2 )
							ret := 1.000000 // buy
						if( Positive_Money_Flow > 32358.2 )
							ret := 0.476190
					if( ema2 > 30.9289 )
						if( ema2 <= 32.0323 )
							ret := -0.416667
						if( ema2 > 32.0323 )
							if( Typical_Price <= 32.4088 )
								ret := 0.916667 // buy
							if( Typical_Price > 32.4088 )
								ret := 0.333333
	if( Positive_Money_Flow_Sum > 90939.9 )
		if( Positive_Money_Flow_Sum <= 7.23474e+06 )
			if( ema12 <= 0.011964 )
				if( Money_Flow_Ratio <= 21.3053 )
					if( ema13 <= -0.111283 )
						if( ema1 <= 33.7737 )
							if( ema3 <= 24.1432 )
								if( ema12 <= -0.087217 )
									ret := 0.264706
								if( ema12 > -0.087217 )
									ret := -0.803030 // sell
							if( ema3 > 24.1432 )
								if( tema <= 24.1401 )
									ret := 0.887500 // buy
								if( tema > 24.1401 )
									ret := 0.112640
						if( ema1 > 33.7737 )
							if( Negative_Money_Flow <= 5.57146e+06 )
								if( MFI <= 48.1225 )
									ret := -0.077818
								if( MFI > 48.1225 )
									ret := 0.519435
							if( Negative_Money_Flow > 5.57146e+06 )
								if( Positive_Money_Flow_Sum <= 2.4546e+06 )
									ret := -0.615385
								if( Positive_Money_Flow_Sum > 2.4546e+06 )
									ret := 0.820000 // buy
					if( ema13 > -0.111283 )
						if( Negative_Money_Flow <= 1.61258e+06 )
							if( Raw_Money_Flow <= 114607 )
								if( Negative_Money_Flow <= 70.8642 )
									ret := -0.050425
								if( Negative_Money_Flow > 70.8642 )
									ret := 0.140519
							if( Raw_Money_Flow > 114607 )
								if( ema12 <= -0.000206 )
									ret := -0.051407
								if( ema12 > -0.000206 )
									ret := 0.038859
						if( Negative_Money_Flow > 1.61258e+06 )
							if( Positive_Money_Flow_Sum <= 5.74247e+06 )
								if( ema3 <= 34.6287 )
									ret := 0.467105
								if( ema3 > 34.6287 )
									ret := 0.087432
							if( Positive_Money_Flow_Sum > 5.74247e+06 )
								if( tema <= 31.6615 )
									ret := 0.150000
								if( tema > 31.6615 )
									ret := -0.392157
				if( Money_Flow_Ratio > 21.3053 )
					if( Negative_Money_Flow <= 165.563 )
						if( MFI_Low <= 76.9171 )
							if( ema1 <= 29.8019 )
								ret := 0.300000
							if( ema1 > 29.8019 )
								ret := 0.777778 // buy
						if( MFI_Low > 76.9171 )
							ret := 0.687500
					if( Negative_Money_Flow > 165.563 )
						if( ema12 <= -0.009458 )
							ret := 1.000000 // buy
						if( ema12 > -0.009458 )
							ret := 0.777778 // buy
			if( ema12 > 0.011964 )
				if( Raw_Money_Flow <= 38334.9 )
					if( ema12 <= 0.146523 )
						if( Typical_Price <= 26.5525 )
							if( ema3 <= 24.8405 )
								if( tema <= 22.6735 )
									ret := 0.625000
								if( tema > 22.6735 )
									ret := -0.432990
							if( ema3 > 24.8405 )
								if( Negative_Money_Flow_Sum <= 217124 )
									ret := 0.413978
								if( Negative_Money_Flow_Sum > 217124 )
									ret := -0.303030
						if( Typical_Price > 26.5525 )
							if( Money_Flow_Ratio <= 15.8247 )
								if( Negative_Money_Flow_Sum <= 1.36213e+06 )
									ret := -0.210169
								if( Negative_Money_Flow_Sum > 1.36213e+06 )
									ret := 0.159091
							if( Money_Flow_Ratio > 15.8247 )
								if( Money_Flow_Ratio <= 24.337 )
									ret := -0.592593
								if( Money_Flow_Ratio > 24.337 )
									ret := -0.954545 // sell
					if( ema12 > 0.146523 )
						if( Money_Flow_Ratio <= 3.68738 )
							if( Money_Flow_Ratio <= 1.48895 )
								if( MFI <= 48.4079 )
									ret := -0.666667
								if( MFI > 48.4079 )
									ret := -0.300000
							if( Money_Flow_Ratio > 1.48895 )
								if( Negative_Money_Flow_Sum <= 122683 )
									ret := 0.861538 // buy
								if( Negative_Money_Flow_Sum > 122683 )
									ret := 0.380952
						if( Money_Flow_Ratio > 3.68738 )
							if( Raw_Money_Flow <= 20382.5 )
								if( Positive_Money_Flow_Sum <= 1.39391e+06 )
									ret := -0.681818
								if( Positive_Money_Flow_Sum > 1.39391e+06 )
									ret := 0.636364
							if( Raw_Money_Flow > 20382.5 )
								if( Negative_Money_Flow_Sum <= 101972 )
									ret := 0.846154 // buy
								if( Negative_Money_Flow_Sum > 101972 )
									ret := -0.333333
				if( Raw_Money_Flow > 38334.9 )
					if( ema12 <= 0.058586 )
						if( MFI_Low <= 69.7697 )
							if( Negative_Money_Flow <= 390961 )
								if( Raw_Money_Flow <= 99426.9 )
									ret := -0.105561
								if( Raw_Money_Flow > 99426.9 )
									ret := -0.005679
							if( Negative_Money_Flow > 390961 )
								if( MFI_High <= -26.316 )
									ret := -0.230958
								if( MFI_High > -26.316 )
									ret := -0.041254
						if( MFI_Low > 69.7697 )
							if( Negative_Money_Flow_Sum <= 247364 )
								if( MFI_High <= 10.8719 )
									ret := 0.888889 // buy
								if( MFI_High > 10.8719 )
									ret := 0.362832
							if( Negative_Money_Flow_Sum > 247364 )
								if( ema2 <= 28.2573 )
									ret := 0.562500
								if( ema2 > 28.2573 )
									ret := -0.147541
					if( ema12 > 0.058586 )
						if( Positive_Money_Flow <= 69740.7 )
							if( Positive_Money_Flow <= 43143.6 )
								if( Positive_Money_Flow_Sum <= 5.66658e+06 )
									ret := 0.019188
								if( Positive_Money_Flow_Sum > 5.66658e+06 )
									ret := -0.280098
							if( Positive_Money_Flow > 43143.6 )
								if( MFI_Low <= 28.4743 )
									ret := -0.392857
								if( MFI_Low > 28.4743 )
									ret := 0.278351
						if( Positive_Money_Flow > 69740.7 )
							if( ema12 <= 0.186576 )
								if( Negative_Money_Flow_Sum <= 112868 )
									ret := -0.637584
								if( Negative_Money_Flow_Sum > 112868 )
									ret := -0.164557
							if( ema12 > 0.186576 )
								if( Negative_Money_Flow_Sum <= 370819 )
									ret := -0.726496 // sell
								if( Negative_Money_Flow_Sum > 370819 )
									ret := -0.137931
		if( Positive_Money_Flow_Sum > 7.23474e+06 )
			if( ema13 <= -0.76501 )
				ret := -1.000000 // sell
			if( ema13 > -0.76501 )
				if( Positive_Money_Flow_Sum <= 8.69566e+06 )
					if( Money_Flow_Ratio <= 1.2749 )
						if( Money_Flow_Ratio <= 1.22872 )
							if( ema12 <= -0.242747 )
								ret := 1.000000 // buy
							if( ema12 > -0.242747 )
								if( ema3 <= 30.9892 )
									ret := 0.377778
								if( ema3 > 30.9892 )
									ret := 0.006470
						if( Money_Flow_Ratio > 1.22872 )
							if( Positive_Money_Flow_Sum <= 8.38806e+06 )
								if( Positive_Money_Flow_Sum <= 7.95031e+06 )
									ret := -0.692308
								if( Positive_Money_Flow_Sum > 7.95031e+06 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 8.38806e+06 )
								if( tema <= 40.4128 )
									ret := -1.000000 // sell
								if( tema > 40.4128 )
									ret := -0.923077 // sell
					if( Money_Flow_Ratio > 1.2749 )
						if( ema2 <= 30.0176 )
							if( Positive_Money_Flow <= 1.25502e+06 )
								if( Raw_Money_Flow <= 796506 )
									ret := -0.555556
								if( Raw_Money_Flow > 796506 )
									ret := 0.285714
							if( Positive_Money_Flow > 1.25502e+06 )
								if( ema3 <= 27.9524 )
									ret := -0.950000 // sell
								if( ema3 > 27.9524 )
									ret := -0.545455
						if( ema2 > 30.0176 )
							if( ema3 <= 35.254 )
								if( Positive_Money_Flow_Sum <= 7.66629e+06 )
									ret := 0.252747
								if( Positive_Money_Flow_Sum > 7.66629e+06 )
									ret := 0.469945
							if( ema3 > 35.254 )
								if( Raw_Money_Flow <= 402406 )
									ret := 0.509804
								if( Raw_Money_Flow > 402406 )
									ret := 0.075229
				if( Positive_Money_Flow_Sum > 8.69566e+06 )
					if( ema3 <= 30.8533 )
						if( ema3 <= 30.7057 )
							if( MFI <= 92.9685 )
								if( ema13 <= 0.322826 )
									ret := -0.066667
								if( ema13 > 0.322826 )
									ret := 0.947368 // buy
							if( MFI > 92.9685 )
								if( ema12 <= 0.160375 )
									ret := -0.325301
								if( ema12 > 0.160375 )
									ret := -0.928571 // sell
						if( ema3 > 30.7057 )
							if( Typical_Price <= 30.7971 )
								ret := 0.176471
							if( Typical_Price > 30.7971 )
								if( ema13 <= 0.154588 )
									ret := -0.916667 // sell
								if( ema13 > 0.154588 )
									ret := -0.348837
					if( ema3 > 30.8533 )
						if( Negative_Money_Flow_Sum <= 2.02564e+07 )
							if( ema3 <= 33.1494 )
								if( Positive_Money_Flow_Sum <= 4.96567e+07 )
									ret := 0.139510
								if( Positive_Money_Flow_Sum > 4.96567e+07 )
									ret := 0.789474 // buy
							if( ema3 > 33.1494 )
								if( MFI_Low <= 23.9064 )
									ret := -0.432624
								if( MFI_Low > 23.9064 )
									ret := -0.002256
						if( Negative_Money_Flow_Sum > 2.02564e+07 )
							if( tema <= 43.2473 )
								if( ema2 <= 43.0435 )
									ret := 0.136707
								if( ema2 > 43.0435 )
									ret := -0.493333
							if( tema > 43.2473 )
								if( ema12 <= 0.12911 )
									ret := 0.407121
								if( ema12 > 0.12911 )
									ret := -0.149254
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_AFRM_1Min_d3f07ae3(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


