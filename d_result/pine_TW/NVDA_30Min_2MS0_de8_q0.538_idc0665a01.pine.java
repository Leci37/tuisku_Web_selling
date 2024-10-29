//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: NVDA_30Min_2MS0_c0665a01 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2MS0_c0665a01", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_c0665a01(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow_Sum <= 2.24818e+10 )
		if( Positive_Money_Flow_Sum <= 1.15832e+10 )
			if( Raw_Money_Flow <= 8.95149e+07 )
				if( Negative_Money_Flow_Sum <= 1.27026e+10 )
					if( MFI_High <= -33.4717 )
						if( Positive_Money_Flow_Sum <= 3.01652e+09 )
							if( Positive_Money_Flow_Sum <= 6.82433e+08 )
								if( k <= 43.3774 )
									ret := 0.030210
								if( k > 43.3774 )
									ret := 0.102448
							if( Positive_Money_Flow_Sum > 6.82433e+08 )
								if( smoothD_d <= 45.8942 )
									ret := 0.007343
								if( smoothD_d > 45.8942 )
									ret := -0.242887
						if( Positive_Money_Flow_Sum > 3.01652e+09 )
							if( Positive_Money_Flow_Sum <= 3.51202e+09 )
								if( d <= 33.6766 )
									ret := 0.258741
								if( d > 33.6766 )
									ret := 0.755396 // buy
							if( Positive_Money_Flow_Sum > 3.51202e+09 )
								if( d_k <= -10.5631 )
									ret := -0.277311
								if( d_k > -10.5631 )
									ret := 0.228846
					if( MFI_High > -33.4717 )
						if( MFI_High <= 0.007069 )
							if( Positive_Money_Flow_Sum <= 3.19354e+08 )
								if( rsi1 <= 84.1764 )
									ret := -0.080043
								if( rsi1 > 84.1764 )
									ret := 0.274419
							if( Positive_Money_Flow_Sum > 3.19354e+08 )
								if( d <= 69.6694 )
									ret := 0.051216
								if( d > 69.6694 )
									ret := -0.077481
						if( MFI_High > 0.007069 )
							if( Negative_Money_Flow_Sum <= 1.65054e+08 )
								if( Negative_Money_Flow_Sum <= 803306 )
									ret := 0.263158
								if( Negative_Money_Flow_Sum > 803306 )
									ret := 0.009269
							if( Negative_Money_Flow_Sum > 1.65054e+08 )
								if( k <= 47.0423 )
									ret := 0.390456
								if( k > 47.0423 )
									ret := 0.087732
				if( Negative_Money_Flow_Sum > 1.27026e+10 )
					if( MFI <= 28.3892 )
						if( Money_Flow_Ratio <= 0.285788 )
							if( MFI_High <= -63.5063 )
								if( smoothK_k <= 63.9146 )
									ret := 0.545455
								if( smoothK_k > 63.9146 )
									ret := 0.055556
							if( MFI_High > -63.5063 )
								if( smoothD_d <= 22.5367 )
									ret := 0.166667
								if( smoothD_d > 22.5367 )
									ret := 0.833333 // buy
						if( Money_Flow_Ratio > 0.285788 )
							if( d <= 43.1049 )
								if( MFI_High <= -56.1175 )
									ret := -0.545455
								if( MFI_High > -56.1175 )
									ret := 0.000000
							if( d > 43.1049 )
								ret := 0.500000
					if( MFI > 28.3892 )
						if( k <= 6.69051 )
							if( Negative_Money_Flow_Sum <= 1.39165e+10 )
								ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 1.39165e+10 )
								ret := 0.250000
						if( k > 6.69051 )
							if( smoothK_k <= 67.1656 )
								if( Money_Flow_Ratio <= 0.689678 )
									ret := 0.937500 // buy
								if( Money_Flow_Ratio > 0.689678 )
									ret := 0.444444
							if( smoothK_k > 67.1656 )
								if( rsi1 <= 37.5473 )
									ret := 0.636364
								if( rsi1 > 37.5473 )
									ret := 0.444444
			if( Raw_Money_Flow > 8.95149e+07 )
				if( smoothD_d <= 87.257 )
					if( MFI <= 66.3064 )
						if( smoothK_k <= 4.7286 )
							if( Negative_Money_Flow_Sum <= 1.99757e+08 )
								if( Negative_Money_Flow <= 9.73447e+07 )
									ret := -0.964286 // sell
								if( Negative_Money_Flow > 9.73447e+07 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.99757e+08 )
								if( d_k <= -0.960223 )
									ret := 0.149923
								if( d_k > -0.960223 )
									ret := 0.006921
						if( smoothK_k > 4.7286 )
							if( rsi1 <= 65.1799 )
								if( Money_Flow_Ratio <= 0.699017 )
									ret := -0.072647
								if( Money_Flow_Ratio > 0.699017 )
									ret := -0.164443
							if( rsi1 > 65.1799 )
								if( Positive_Money_Flow_Sum <= 1.14116e+10 )
									ret := 0.120542
								if( Positive_Money_Flow_Sum > 1.14116e+10 )
									ret := -1.000000 // sell
					if( MFI > 66.3064 )
						if( Negative_Money_Flow_Sum <= 3.43735e+09 )
							if( d_k <= 2.57304 )
								if( Raw_Money_Flow <= 6.10788e+09 )
									ret := 0.060624
								if( Raw_Money_Flow > 6.10788e+09 )
									ret := -0.298246
							if( d_k > 2.57304 )
								if( MFI_High <= -1.72177 )
									ret := 0.050694
								if( MFI_High > -1.72177 )
									ret := -0.192000
						if( Negative_Money_Flow_Sum > 3.43735e+09 )
							if( smoothK_k <= 50.9441 )
								if( Negative_Money_Flow_Sum <= 4.28055e+09 )
									ret := 0.838710 // buy
								if( Negative_Money_Flow_Sum > 4.28055e+09 )
									ret := 0.300000
							if( smoothK_k > 50.9441 )
								if( Typical_Price <= 249.813 )
									ret := -0.500000
								if( Typical_Price > 249.813 )
									ret := 0.342105
				if( smoothD_d > 87.257 )
					if( d_k <= 3.25863 )
						if( MFI_Low <= -16.928 )
							ret := -0.761905 // sell
						if( MFI_Low > -16.928 )
							if( rsi1 <= 54.1101 )
								if( Raw_Money_Flow <= 2.31485e+08 )
									ret := -0.534653
								if( Raw_Money_Flow > 2.31485e+08 )
									ret := 0.030151
							if( rsi1 > 54.1101 )
								if( Negative_Money_Flow_Sum <= 2.0222e+08 )
									ret := -0.045977
								if( Negative_Money_Flow_Sum > 2.0222e+08 )
									ret := 0.129248
					if( d_k > 3.25863 )
						if( Positive_Money_Flow_Sum <= 9.38619e+09 )
							if( d <= 90.351 )
								ret := -0.833333 // sell
							if( d > 90.351 )
								if( rsi1 <= 60.8138 )
									ret := 0.118321
								if( rsi1 > 60.8138 )
									ret := 0.324771
						if( Positive_Money_Flow_Sum > 9.38619e+09 )
							if( smoothK_k <= 83.9281 )
								ret := -0.333333
							if( smoothK_k > 83.9281 )
								ret := -0.769231 // sell
		if( Positive_Money_Flow_Sum > 1.15832e+10 )
			if( k <= 48.2746 )
				if( rsi1 <= 51.9731 )
					if( Positive_Money_Flow_Sum <= 1.23827e+10 )
						if( Negative_Money_Flow <= 1.80989e+09 )
							if( smoothD_d <= 6.67732 )
								ret := 0.000000
							if( smoothD_d > 6.67732 )
								if( Positive_Money_Flow <= 8.74577e+07 )
									ret := 0.822581 // buy
								if( Positive_Money_Flow > 8.74577e+07 )
									ret := 0.392857
						if( Negative_Money_Flow > 1.80989e+09 )
							ret := -0.133333
					if( Positive_Money_Flow_Sum > 1.23827e+10 )
						if( Negative_Money_Flow_Sum <= 1.18809e+10 )
							if( Raw_Money_Flow <= 5.58044e+08 )
								if( d_k <= 2.29898 )
									ret := 0.833333 // buy
								if( d_k > 2.29898 )
									ret := 0.315789
							if( Raw_Money_Flow > 5.58044e+08 )
								if( d_k <= 3.49373 )
									ret := -0.163934
								if( d_k > 3.49373 )
									ret := 0.640000
						if( Negative_Money_Flow_Sum > 1.18809e+10 )
							if( k <= 32.4145 )
								if( MFI <= 43.3335 )
									ret := 0.476190
								if( MFI > 43.3335 )
									ret := -0.562044
							if( k > 32.4145 )
								if( Positive_Money_Flow <= 1.44864e+09 )
									ret := 0.500000
								if( Positive_Money_Flow > 1.44864e+09 )
									ret := -0.250000
				if( rsi1 > 51.9731 )
					if( Negative_Money_Flow_Sum <= 9.23832e+09 )
						if( d <= 64.3453 )
							if( smoothD_d <= 54.2932 )
								if( rsi1 <= 65.0587 )
									ret := 0.435484
								if( rsi1 > 65.0587 )
									ret := -0.017143
							if( smoothD_d > 54.2932 )
								if( Typical_Price <= 274.207 )
									ret := -0.875000 // sell
								if( Typical_Price > 274.207 )
									ret := -0.333333
						if( d > 64.3453 )
							ret := 0.894737 // buy
					if( Negative_Money_Flow_Sum > 9.23832e+09 )
						if( Typical_Price <= 557.143 )
							if( k <= 23.5025 )
								if( smoothK_k <= 6.10927 )
									ret := 0.387755
								if( smoothK_k > 6.10927 )
									ret := -0.218750
							if( k > 23.5025 )
								if( smoothD_d <= 48.2544 )
									ret := 0.708333 // buy
								if( smoothD_d > 48.2544 )
									ret := 0.347826
						if( Typical_Price > 557.143 )
							if( smoothD_d <= 51.9948 )
								if( smoothK_k <= 0.867075 )
									ret := 0.157895
								if( smoothK_k > 0.867075 )
									ret := 0.782123 // buy
							if( smoothD_d > 51.9948 )
								ret := 0.153846
			if( k > 48.2746 )
				if( MFI_Low <= 61.4139 )
					if( Positive_Money_Flow <= 1.04977e+09 )
						if( Negative_Money_Flow_Sum <= 5.00644e+09 )
							if( Negative_Money_Flow <= 2.25598e+09 )
								if( rsi1 <= 67.4586 )
									ret := 0.212121
								if( rsi1 > 67.4586 )
									ret := -0.422018
							if( Negative_Money_Flow > 2.25598e+09 )
								if( Negative_Money_Flow <= 2.80877e+09 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 2.80877e+09 )
									ret := -0.500000
						if( Negative_Money_Flow_Sum > 5.00644e+09 )
							if( Negative_Money_Flow_Sum <= 1.55491e+10 )
								if( Typical_Price <= 106.231 )
									ret := 0.840000 // buy
								if( Typical_Price > 106.231 )
									ret := 0.142420
							if( Negative_Money_Flow_Sum > 1.55491e+10 )
								if( MFI_High <= -23.7014 )
									ret := 0.715596 // buy
								if( MFI_High > -23.7014 )
									ret := -0.277778
					if( Positive_Money_Flow > 1.04977e+09 )
						if( MFI_Low <= 31.4185 )
							if( d <= 63.5817 )
								if( MFI <= 47.0754 )
									ret := -0.285714
								if( MFI > 47.0754 )
									ret := -0.615385
							if( d > 63.5817 )
								if( MFI_Low <= 24.7271 )
									ret := -0.888889 // sell
								if( MFI_Low > 24.7271 )
									ret := -1.000000 // sell
						if( MFI_Low > 31.4185 )
							if( smoothK_k <= 85.9302 )
								if( d_k <= -2.29285 )
									ret := -0.100000
								if( d_k > -2.29285 )
									ret := 0.224806
							if( smoothK_k > 85.9302 )
								if( MFI <= 75.1659 )
									ret := -0.596491
								if( MFI > 75.1659 )
									ret := 0.400000
				if( MFI_Low > 61.4139 )
					if( Raw_Money_Flow <= 2.64811e+09 )
						if( rsi1 <= 70.9594 )
							if( Negative_Money_Flow_Sum <= 3.61982e+09 )
								if( d <= 68.2478 )
									ret := -0.375000
								if( d > 68.2478 )
									ret := 0.514286
							if( Negative_Money_Flow_Sum > 3.61982e+09 )
								ret := -0.782609 // sell
						if( rsi1 > 70.9594 )
							if( Positive_Money_Flow <= 1.28883e+09 )
								if( MFI <= 89.1762 )
									ret := 0.503546
								if( MFI > 89.1762 )
									ret := -0.016260
							if( Positive_Money_Flow > 1.28883e+09 )
								if( Money_Flow_Ratio <= 4.98063 )
									ret := 0.962963 // buy
								if( Money_Flow_Ratio > 4.98063 )
									ret := 0.607656
					if( Raw_Money_Flow > 2.64811e+09 )
						if( Typical_Price <= 767.006 )
							if( Money_Flow_Ratio <= 68.2891 )
								if( smoothD_d <= 55.4305 )
									ret := -0.964286 // sell
								if( smoothD_d > 55.4305 )
									ret := -0.454545
							if( Money_Flow_Ratio > 68.2891 )
								ret := 0.636364
						if( Typical_Price > 767.006 )
							if( Money_Flow_Ratio <= 7.77259 )
								if( MFI_High <= 6.39569 )
									ret := 0.833333 // buy
								if( MFI_High > 6.39569 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 7.77259 )
								if( d_k <= 0.02806 )
									ret := 0.109756
								if( d_k > 0.02806 )
									ret := -0.833333 // sell
	if( Negative_Money_Flow_Sum > 2.24818e+10 )
		if( MFI_Low <= -14.2278 )
			if( Money_Flow_Ratio <= 0.040113 )
				ret := 0.764706 // buy
			if( Money_Flow_Ratio > 0.040113 )
				ret := 1.000000 // buy
		if( MFI_Low > -14.2278 )
			if( Raw_Money_Flow <= 1.63228e+09 )
				if( Typical_Price <= 502.206 )
					if( smoothK_k <= 74.478 )
						if( smoothK_k <= 8.27637 )
							ret := 0.000000
						if( smoothK_k > 8.27637 )
							if( Negative_Money_Flow_Sum <= 3.07641e+10 )
								ret := -0.214286
							if( Negative_Money_Flow_Sum > 3.07641e+10 )
								ret := -1.000000 // sell
					if( smoothK_k > 74.478 )
						ret := 0.692308
				if( Typical_Price > 502.206 )
					if( MFI <= 33.9642 )
						if( smoothK_k <= 12.4985 )
							if( smoothD_d <= 0.087967 )
								ret := 0.590909
							if( smoothD_d > 0.087967 )
								ret := 0.117647
						if( smoothK_k > 12.4985 )
							if( rsi1 <= 30.222 )
								if( rsi1 <= 20.6009 )
									ret := 0.900000 // buy
								if( rsi1 > 20.6009 )
									ret := 1.000000 // buy
							if( rsi1 > 30.222 )
								ret := 0.692308
					if( MFI > 33.9642 )
						ret := 0.000000
			if( Raw_Money_Flow > 1.63228e+09 )
				if( Typical_Price <= 636.364 )
					if( Negative_Money_Flow <= 3.29314e+09 )
						if( Raw_Money_Flow <= 3.40461e+09 )
							if( smoothD_d <= 69.7943 )
								if( Typical_Price <= 450.503 )
									ret := -0.876190 // sell
								if( Typical_Price > 450.503 )
									ret := -0.589286
							if( smoothD_d > 69.7943 )
								ret := -0.400000
						if( Raw_Money_Flow > 3.40461e+09 )
							ret := 0.363636
					if( Negative_Money_Flow > 3.29314e+09 )
						if( Positive_Money_Flow_Sum <= 8.48192e+09 )
							ret := 0.333333
						if( Positive_Money_Flow_Sum > 8.48192e+09 )
							if( Typical_Price <= 149.758 )
								ret := -0.428571
							if( Typical_Price > 149.758 )
								ret := -0.900000 // sell
				if( Typical_Price > 636.364 )
					if( MFI_High <= -45.1306 )
						if( Raw_Money_Flow <= 2.50678e+09 )
							if( MFI_High <= -57.2246 )
								if( k <= 10.2786 )
									ret := 0.764706 // buy
								if( k > 10.2786 )
									ret := 1.000000 // buy
							if( MFI_High > -57.2246 )
								if( k <= 14.4179 )
									ret := -1.000000 // sell
								if( k > 14.4179 )
									ret := 0.423077
						if( Raw_Money_Flow > 2.50678e+09 )
							if( k <= 2.23853 )
								ret := 0.428571
							if( k > 2.23853 )
								if( smoothK_k <= 11.6526 )
									ret := -0.685185
								if( smoothK_k > 11.6526 )
									ret := -0.225000
					if( MFI_High > -45.1306 )
						if( MFI_High <= -31.9692 )
							if( Typical_Price <= 787.73 )
								ret := -1.000000 // sell
							if( Typical_Price > 787.73 )
								if( MFI <= 39.4172 )
									ret := -0.583333
								if( MFI > 39.4172 )
									ret := 0.000000
						if( MFI_High > -31.9692 )
							if( MFI_Low <= 32.0854 )
								ret := -1.000000 // sell
							if( MFI_Low > 32.0854 )
								ret := -0.750000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_NVDA_30Min_c0665a01(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


