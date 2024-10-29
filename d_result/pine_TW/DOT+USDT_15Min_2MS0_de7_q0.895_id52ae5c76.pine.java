//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: DOTUSDT_15Min_2MS0_52ae5c76 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_2MS0_52ae5c76", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_52ae5c76(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 50.4352 )
		if( smoothD_d <= 19.564 )
			if( Money_Flow_Ratio <= 0.357068 )
				if( rsi1 <= 26.5923 )
					if( Negative_Money_Flow_Sum <= 5.07504e+06 )
						if( d_k <= -0.344923 )
							if( Negative_Money_Flow <= 2545.91 )
								ret := -0.503145
							if( Negative_Money_Flow > 2545.91 )
								ret := -0.707951 // sell
						if( d_k > -0.344923 )
							if( Negative_Money_Flow <= 288706 )
								ret := -0.472325
							if( Negative_Money_Flow > 288706 )
								ret := -0.200557
					if( Negative_Money_Flow_Sum > 5.07504e+06 )
						if( d <= 7.4026 )
							if( Typical_Price <= 5.64096 )
								ret := -0.659574
							if( Typical_Price > 5.64096 )
								ret := -0.043093
						if( d > 7.4026 )
							if( MFI <= 16.6315 )
								ret := -0.433839
							if( MFI > 16.6315 )
								ret := -0.101512
				if( rsi1 > 26.5923 )
					if( Raw_Money_Flow <= 682513 )
						if( d_k <= -2.94658 )
							if( rsi1 <= 33.0287 )
								ret := -0.388764
							if( rsi1 > 33.0287 )
								ret := -0.084211
						if( d_k > -2.94658 )
							if( MFI_High <= -61.1973 )
								ret := 0.165939
							if( MFI_High > -61.1973 )
								ret := -0.167401
					if( Raw_Money_Flow > 682513 )
						if( Positive_Money_Flow <= 1.15488e+06 )
							if( MFI <= 25.619 )
								ret := 0.233533
							if( MFI > 25.619 )
								ret := -0.378378
						if( Positive_Money_Flow > 1.15488e+06 )
							if( MFI_Low <= 1.75556 )
								ret := 0.000000
							if( MFI_Low > 1.75556 )
								ret := -0.757576 // sell
			if( Money_Flow_Ratio > 0.357068 )
				if( rsi1 <= 35.986 )
					if( Money_Flow_Ratio <= 0.77797 )
						if( Raw_Money_Flow <= 4.37024e+06 )
							if( rsi1 <= 28.8612 )
								ret := -0.626321
							if( rsi1 > 28.8612 )
								ret := -0.373571
						if( Raw_Money_Flow > 4.37024e+06 )
							if( Negative_Money_Flow <= 6.74894e+06 )
								ret := 0.789474 // buy
							if( Negative_Money_Flow > 6.74894e+06 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.77797 )
						if( k <= 4.6e-05 )
							if( Raw_Money_Flow <= 75473.1 )
								ret := -0.305556
							if( Raw_Money_Flow > 75473.1 )
								ret := -0.560268
						if( k > 4.6e-05 )
							if( rsi1 <= 30.5081 )
								ret := -0.774566 // sell
							if( rsi1 > 30.5081 )
								ret := -0.647092
				if( rsi1 > 35.986 )
					if( Money_Flow_Ratio <= 0.72621 )
						if( Positive_Money_Flow <= 1.96078e+06 )
							if( rsi1 <= 46.4786 )
								ret := -0.154943
							if( rsi1 > 46.4786 )
								ret := 0.055285
						if( Positive_Money_Flow > 1.96078e+06 )
							if( Typical_Price <= 8.32759 )
								ret := -0.625000
							if( Typical_Price > 8.32759 )
								ret := 0.836735 // buy
					if( Money_Flow_Ratio > 0.72621 )
						if( rsi1 <= 49.9973 )
							if( Money_Flow_Ratio <= 2.19204 )
								ret := -0.361013
							if( Money_Flow_Ratio > 2.19204 )
								ret := -0.656693
						if( rsi1 > 49.9973 )
							if( Money_Flow_Ratio <= 5.33384 )
								ret := -0.079830
							if( Money_Flow_Ratio > 5.33384 )
								ret := -0.592715
		if( smoothD_d > 19.564 )
			if( rsi1 <= 53.4218 )
				if( MFI <= 51.1296 )
					if( Positive_Money_Flow <= 774.259 )
						if( MFI_Low <= 9.77233 )
							if( Raw_Money_Flow <= 304041 )
								ret := -0.078275
							if( Raw_Money_Flow > 304041 )
								ret := 0.188768
						if( MFI_Low > 9.77233 )
							if( rsi1 <= 37.8939 )
								ret := -0.337413
							if( rsi1 > 37.8939 )
								ret := 0.024670
					if( Positive_Money_Flow > 774.259 )
						if( rsi1 <= 39.1541 )
							if( MFI_Low <= 7.82637 )
								ret := -0.196203
							if( MFI_Low > 7.82637 )
								ret := -0.492037
						if( rsi1 > 39.1541 )
							if( MFI_Low <= 21.9817 )
								ret := 0.024706
							if( MFI_Low > 21.9817 )
								ret := -0.179202
				if( MFI > 51.1296 )
					if( rsi1 <= 42.8528 )
						if( Positive_Money_Flow_Sum <= 322768 )
							if( d_k <= 12.5101 )
								ret := -0.411765
							if( d_k > 12.5101 )
								ret := 0.000000
						if( Positive_Money_Flow_Sum > 322768 )
							if( Typical_Price <= 12.4332 )
								ret := -0.666500
							if( Typical_Price > 12.4332 )
								ret := 0.333333
					if( rsi1 > 42.8528 )
						if( MFI_Low <= 47.0714 )
							if( Negative_Money_Flow <= 6881.59 )
								ret := -0.359572
							if( Negative_Money_Flow > 6881.59 )
								ret := -0.117869
						if( MFI_Low > 47.0714 )
							if( Positive_Money_Flow_Sum <= 1.16396e+06 )
								ret := -0.330677
							if( Positive_Money_Flow_Sum > 1.16396e+06 )
								ret := -0.634274
			if( rsi1 > 53.4218 )
				if( Positive_Money_Flow <= 142179 )
					if( MFI <= 67.4998 )
						if( Negative_Money_Flow <= 181108 )
							if( MFI_High <= -29.0494 )
								ret := 0.311111
							if( MFI_High > -29.0494 )
								ret := 0.130823
						if( Negative_Money_Flow > 181108 )
							if( Negative_Money_Flow <= 1.40662e+06 )
								ret := 0.386873
							if( Negative_Money_Flow > 1.40662e+06 )
								ret := -0.007874
					if( MFI > 67.4998 )
						if( Positive_Money_Flow_Sum <= 7.35969e+06 )
							if( Typical_Price <= 10.3168 )
								ret := 0.027734
							if( Typical_Price > 10.3168 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 7.35969e+06 )
							if( Raw_Money_Flow <= 1.93204e+06 )
								ret := 0.312883
							if( Raw_Money_Flow > 1.93204e+06 )
								ret := -0.678571
				if( Positive_Money_Flow > 142179 )
					if( MFI_Low <= 27.3731 )
						if( Positive_Money_Flow_Sum <= 3.43965e+06 )
							if( d <= 32.164 )
								ret := 0.204082
							if( d > 32.164 )
								ret := 0.660870
						if( Positive_Money_Flow_Sum > 3.43965e+06 )
							if( Positive_Money_Flow_Sum <= 5.63641e+06 )
								ret := -0.625000
							if( Positive_Money_Flow_Sum > 5.63641e+06 )
								ret := 0.450000
					if( MFI_Low > 27.3731 )
						if( rsi1 <= 62.2235 )
							if( MFI_High <= -6.88205 )
								ret := -0.190859
							if( MFI_High > -6.88205 )
								ret := -0.590566
						if( rsi1 > 62.2235 )
							if( MFI_Low <= 67.6002 )
								ret := 0.139592
							if( MFI_Low > 67.6002 )
								ret := -0.349558
	if( k > 50.4352 )
		if( rsi1 <= 63.6366 )
			if( Money_Flow_Ratio <= 1.01767 )
				if( smoothK_k <= 70.9111 )
					if( rsi1 <= 46.2784 )
						if( MFI_Low <= 9.8445 )
							if( Negative_Money_Flow <= 158135 )
								ret := -0.042434
							if( Negative_Money_Flow > 158135 )
								ret := 0.329043
						if( MFI_Low > 9.8445 )
							if( Positive_Money_Flow <= 18002 )
								ret := -0.044927
							if( Positive_Money_Flow > 18002 )
								ret := -0.272440
					if( rsi1 > 46.2784 )
						if( Negative_Money_Flow <= 81762.4 )
							if( rsi1 <= 56.0611 )
								ret := 0.139652
							if( rsi1 > 56.0611 )
								ret := 0.489388
						if( Negative_Money_Flow > 81762.4 )
							if( rsi1 <= 54.2276 )
								ret := 0.425663
							if( rsi1 > 54.2276 )
								ret := 0.687574
				if( smoothK_k > 70.9111 )
					if( rsi1 <= 46.4506 )
						if( Negative_Money_Flow <= 153712 )
							if( rsi1 <= 39.0546 )
								ret := -0.151515
							if( rsi1 > 39.0546 )
								ret := 0.059406
						if( Negative_Money_Flow > 153712 )
							if( MFI_High <= -44.9536 )
								ret := 0.518484
							if( MFI_High > -44.9536 )
								ret := 0.028571
					if( rsi1 > 46.4506 )
						if( MFI_High <= -44.3827 )
							if( Raw_Money_Flow <= 108694 )
								ret := 0.364035
							if( Raw_Money_Flow > 108694 )
								ret := 0.697351
						if( MFI_High > -44.3827 )
							if( rsi1 <= 55.6183 )
								ret := 0.176750
							if( rsi1 > 55.6183 )
								ret := 0.456497
			if( Money_Flow_Ratio > 1.01767 )
				if( rsi1 <= 52.6675 )
					if( Negative_Money_Flow_Sum <= 4.36753e+06 )
						if( d <= 74.5051 )
							if( rsi1 <= 48.1458 )
								ret := -0.362374
							if( rsi1 > 48.1458 )
								ret := -0.143482
						if( d > 74.5051 )
							if( Negative_Money_Flow <= 222505 )
								ret := -0.111351
							if( Negative_Money_Flow > 222505 )
								ret := 0.168639
					if( Negative_Money_Flow_Sum > 4.36753e+06 )
						if( Positive_Money_Flow <= 533388 )
							if( Negative_Money_Flow_Sum <= 1.97384e+07 )
								ret := -0.334395
							if( Negative_Money_Flow_Sum > 1.97384e+07 )
								ret := 0.631579
						if( Positive_Money_Flow > 533388 )
							if( Negative_Money_Flow_Sum <= 1.06981e+07 )
								ret := -0.438017
							if( Negative_Money_Flow_Sum > 1.06981e+07 )
								ret := -0.875000 // sell
				if( rsi1 > 52.6675 )
					if( Negative_Money_Flow <= 68.9853 )
						if( Raw_Money_Flow <= 616161 )
							if( Money_Flow_Ratio <= 1.82167 )
								ret := 0.075460
							if( Money_Flow_Ratio > 1.82167 )
								ret := -0.142525
						if( Raw_Money_Flow > 616161 )
							if( d_k <= -11.3677 )
								ret := -0.051587
							if( d_k > -11.3677 )
								ret := -0.355046
					if( Negative_Money_Flow > 68.9853 )
						if( Typical_Price <= 7.19392 )
							if( MFI_Low <= 48.6115 )
								ret := 0.321773
							if( MFI_Low > 48.6115 )
								ret := 0.057361
						if( Typical_Price > 7.19392 )
							if( Raw_Money_Flow <= 149824 )
								ret := 0.355556
							if( Raw_Money_Flow > 149824 )
								ret := -0.037170
		if( rsi1 > 63.6366 )
			if( MFI <= 62.7612 )
				if( MFI_Low <= 27.2237 )
					if( Negative_Money_Flow_Sum <= 826542 )
						if( smoothK_k <= 95.1916 )
							if( Negative_Money_Flow <= 119766 )
								ret := 0.561364
							if( Negative_Money_Flow > 119766 )
								ret := 0.913043 // buy
						if( smoothK_k > 95.1916 )
							if( rsi1 <= 82.2212 )
								ret := 0.292857
							if( rsi1 > 82.2212 )
								ret := 0.833333 // buy
					if( Negative_Money_Flow_Sum > 826542 )
						if( k <= 99.9966 )
							if( Typical_Price <= 9.18133 )
								ret := 0.785058 // buy
							if( Typical_Price > 9.18133 )
								ret := 0.530303
						if( k > 99.9966 )
							if( Positive_Money_Flow_Sum <= 1.46032e+07 )
								ret := 0.581081
							if( Positive_Money_Flow_Sum > 1.46032e+07 )
								ret := -0.500000
				if( MFI_Low > 27.2237 )
					if( rsi1 <= 71.4287 )
						if( rsi1 <= 66.668 )
							if( Typical_Price <= 9.15454 )
								ret := 0.407307
							if( Typical_Price > 9.15454 )
								ret := 0.000000
						if( rsi1 > 66.668 )
							if( Positive_Money_Flow_Sum <= 650587 )
								ret := 0.289474
							if( Positive_Money_Flow_Sum > 650587 )
								ret := 0.555621
					if( rsi1 > 71.4287 )
						if( Negative_Money_Flow_Sum <= 852885 )
							if( Positive_Money_Flow_Sum <= 1.28595e+06 )
								ret := 0.591195
							if( Positive_Money_Flow_Sum > 1.28595e+06 )
								ret := -0.800000 // sell
						if( Negative_Money_Flow_Sum > 852885 )
							if( Positive_Money_Flow <= 3.64104e+06 )
								ret := 0.790292 // buy
							if( Positive_Money_Flow > 3.64104e+06 )
								ret := -0.117647
			if( MFI > 62.7612 )
				if( Typical_Price <= 6.19035 )
					if( rsi1 <= 72.9146 )
						if( Money_Flow_Ratio <= 4.7313 )
							if( d_k <= -8.71578 )
								ret := 0.040161
							if( d_k > -8.71578 )
								ret := 0.308627
						if( Money_Flow_Ratio > 4.7313 )
							if( smoothK_k <= 64.8728 )
								ret := -0.362832
							if( smoothK_k > 64.8728 )
								ret := 0.055556
					if( rsi1 > 72.9146 )
						if( Positive_Money_Flow_Sum <= 4.24378e+06 )
							if( Money_Flow_Ratio <= 5.02366 )
								ret := 0.629703
							if( Money_Flow_Ratio > 5.02366 )
								ret := 0.460765
						if( Positive_Money_Flow_Sum > 4.24378e+06 )
							if( Positive_Money_Flow_Sum <= 5.49373e+06 )
								ret := 0.140541
							if( Positive_Money_Flow_Sum > 5.49373e+06 )
								ret := 0.529577
				if( Typical_Price > 6.19035 )
					if( rsi1 <= 75.0207 )
						if( Positive_Money_Flow_Sum <= 2.82857e+06 )
							if( Money_Flow_Ratio <= 2.46497 )
								ret := 0.431746
							if( Money_Flow_Ratio > 2.46497 )
								ret := 0.183932
						if( Positive_Money_Flow_Sum > 2.82857e+06 )
							if( d_k <= 3.04061 )
								ret := -0.039766
							if( d_k > 3.04061 )
								ret := 0.194903
					if( rsi1 > 75.0207 )
						if( MFI <= 83.8138 )
							if( MFI_High <= -3.96409 )
								ret := 0.615795
							if( MFI_High > -3.96409 )
								ret := 0.470716
						if( MFI > 83.8138 )
							if( Positive_Money_Flow <= 5.56827e+06 )
								ret := 0.281250
							if( Positive_Money_Flow > 5.56827e+06 )
								ret := -0.857143 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_DOTUSDT_15Min_52ae5c76(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


