//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: MELI_15Min_2TV0_c3394b19 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2TV0_c3394b19", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_c3394b19(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema3 <= 1192.64 )
		if( ema1 <= 1151.7 )
			if( ema2 <= 1122.41 )
				if( ema2 <= 1118.65 )
					if( tema <= 1125.24 )
						if( ema1 <= 1094.52 )
							if( ema12 <= 15.7882 )
								if( ema2 <= 344.392 )
									ret := 0.090639
								if( ema2 > 344.392 )
									ret := 0.035834
							if( ema12 > 15.7882 )
								if( VIM <= 0.801216 )
									ret := 0.132867
								if( VIM > 0.801216 )
									ret := 0.699115
						if( ema1 > 1094.52 )
							if( ema12 <= 4.47016 )
								if( VIM <= 0.980764 )
									ret := -0.147059
								if( VIM > 0.980764 )
									ret := 0.334043
							if( ema12 > 4.47016 )
								if( VIM <= 0.720947 )
									ret := -0.208333
								if( VIM > 0.720947 )
									ret := 0.725352 // buy
					if( tema > 1125.24 )
						if( ema3 <= 1109.3 )
							if( ema12 <= 13.4056 )
								if( ema2 <= 1115.56 )
									ret := -0.507246
								if( ema2 > 1115.56 )
									ret := -0.958333 // sell
							if( ema12 > 13.4056 )
								if( ema3 <= 1065.07 )
									ret := 0.800000 // buy
								if( ema3 > 1065.07 )
									ret := -0.240000
						if( ema3 > 1109.3 )
							if( VIP_VIM <= 0.614164 )
								if( ema3 <= 1114.31 )
									ret := 0.086957
								if( ema3 > 1114.31 )
									ret := -0.612903
							if( VIP_VIM > 0.614164 )
								ret := 1.000000 // buy
				if( ema2 > 1118.65 )
					if( tema <= 1101.77 )
						if( ema12 <= -12.0666 )
							if( ema13 <= -24.2438 )
								ret := -0.250000
							if( ema13 > -24.2438 )
								ret := 0.857143 // buy
						if( ema12 > -12.0666 )
							if( ema3 <= 1123.17 )
								ret := -1.000000 // sell
							if( ema3 > 1123.17 )
								ret := -0.333333
					if( tema > 1101.77 )
						if( ema3 <= 1124.3 )
							if( ema13 <= 4.06014 )
								if( ema2 <= 1121.66 )
									ret := 0.846154 // buy
								if( ema2 > 1121.66 )
									ret := 0.200000
							if( ema13 > 4.06014 )
								if( tema <= 1131.16 )
									ret := -0.382353
								if( tema > 1131.16 )
									ret := 0.739130 // buy
						if( ema3 > 1124.3 )
							if( VIP <= 1.0111 )
								ret := -0.750000 // sell
							if( VIP > 1.0111 )
								ret := 0.000000
			if( ema2 > 1122.41 )
				if( ema1 <= 1137.67 )
					if( ema13 <= -38.3477 )
						if( ema13 <= -41.795 )
							ret := 1.000000 // buy
						if( ema13 > -41.795 )
							ret := 0.750000 // buy
					if( ema13 > -38.3477 )
						if( VIP <= 0.917596 )
							if( tema <= 1098.71 )
								if( VIM <= 1.36932 )
									ret := 0.750000 // buy
								if( VIM > 1.36932 )
									ret := -0.375000
							if( tema > 1098.71 )
								if( VIP_VIM <= -0.737716 )
									ret := -0.363636
								if( VIP_VIM > -0.737716 )
									ret := -0.766917 // sell
						if( VIP > 0.917596 )
							if( ema3 <= 1133.73 )
								if( ema13 <= 8.99318 )
									ret := -0.510638
								if( ema13 > 8.99318 )
									ret := 0.020408
							if( ema3 > 1133.73 )
								if( ema2 <= 1133.64 )
									ret := 0.385965
								if( ema2 > 1133.64 )
									ret := -0.151515
				if( ema1 > 1137.67 )
					if( tema <= 1137.06 )
						if( VIM <= 1.25848 )
							if( VIM <= 1.05459 )
								if( ema13 <= -8.05361 )
									ret := 1.000000 // buy
								if( ema13 > -8.05361 )
									ret := 0.250000
							if( VIM > 1.05459 )
								if( tema <= 1132.84 )
									ret := -0.857143 // sell
								if( tema > 1132.84 )
									ret := -0.071429
						if( VIM > 1.25848 )
							if( ema1 <= 1143.4 )
								if( tema <= 1128.62 )
									ret := 0.631579
								if( tema > 1128.62 )
									ret := 1.000000 // buy
							if( ema1 > 1143.4 )
								if( VIP_VIM <= -0.675994 )
									ret := -0.500000
								if( VIP_VIM > -0.675994 )
									ret := 0.473684
					if( tema > 1137.06 )
						if( VIM <= 1.1963 )
							if( VIP <= 0.954925 )
								if( ema3 <= 1151.32 )
									ret := -0.363636
								if( ema3 > 1151.32 )
									ret := 0.885714 // buy
							if( VIP > 0.954925 )
								if( tema <= 1141.96 )
									ret := -0.625000
								if( tema > 1141.96 )
									ret := 0.048649
						if( VIM > 1.1963 )
							if( tema <= 1141.33 )
								if( VIM <= 1.29695 )
									ret := -0.750000 // sell
								if( VIM > 1.29695 )
									ret := 0.500000
							if( tema > 1141.33 )
								if( ema2 <= 1147.96 )
									ret := -0.441176
								if( ema2 > 1147.96 )
									ret := -0.964286 // sell
		if( ema1 > 1151.7 )
			if( ema12 <= 6.80302 )
				if( ema13 <= -3.62195 )
					if( tema <= 1175.24 )
						if( ema12 <= -2.02923 )
							if( VIM <= 1.31535 )
								if( tema <= 1167.21 )
									ret := 0.460733
								if( tema > 1167.21 )
									ret := 0.061538
							if( VIM > 1.31535 )
								if( ema13 <= -21.1384 )
									ret := 0.406250
								if( ema13 > -21.1384 )
									ret := -0.296296
						if( ema12 > -2.02923 )
							if( ema3 <= 1168.58 )
								if( VIM <= 1.07865 )
									ret := -0.750000 // sell
								if( VIM > 1.07865 )
									ret := -1.000000 // sell
							if( ema3 > 1168.58 )
								if( ema1 <= 1164.58 )
									ret := 0.500000
								if( ema1 > 1164.58 )
									ret := -0.125000
					if( tema > 1175.24 )
						if( VIM <= 1.22696 )
							if( ema12 <= -4.46562 )
								ret := 0.000000
							if( ema12 > -4.46562 )
								if( VIP_VIM <= -0.13949 )
									ret := -0.829268 // sell
								if( VIP_VIM > -0.13949 )
									ret := -0.450000
						if( VIM > 1.22696 )
							if( tema <= 1178.9 )
								ret := 0.500000
							if( tema > 1178.9 )
								ret := 0.000000
				if( ema13 > -3.62195 )
					if( ema3 <= 1180.73 )
						if( ema12 <= 1.05903 )
							if( ema1 <= 1176.91 )
								if( VIP <= 1.3608 )
									ret := 0.519084
								if( VIP > 1.3608 )
									ret := -1.000000 // sell
							if( ema1 > 1176.91 )
								if( VIM <= 0.966446 )
									ret := 1.000000 // buy
								if( VIM > 0.966446 )
									ret := -0.529412
						if( ema12 > 1.05903 )
							if( VIP <= 1.20087 )
								if( ema13 <= 5.50194 )
									ret := 0.125786
								if( ema13 > 5.50194 )
									ret := -0.223776
							if( VIP > 1.20087 )
								if( ema3 <= 1156.89 )
									ret := 0.508475
								if( ema3 > 1156.89 )
									ret := 0.119760
					if( ema3 > 1180.73 )
						if( VIP_VIM <= 0.180752 )
							if( ema3 <= 1187.48 )
								if( ema3 <= 1182.63 )
									ret := 0.826087 // buy
								if( ema3 > 1182.63 )
									ret := 0.166667
							if( ema3 > 1187.48 )
								if( VIM <= 1.00404 )
									ret := 0.166667
								if( VIM > 1.00404 )
									ret := 0.887640 // buy
						if( VIP_VIM > 0.180752 )
							if( VIP <= 1.13426 )
								ret := -0.285714
							if( VIP > 1.13426 )
								if( ema2 <= 1197.98 )
									ret := 0.490909
								if( ema2 > 1197.98 )
									ret := -0.400000
			if( ema12 > 6.80302 )
				if( ema3 <= 1178.92 )
					if( ema3 <= 1122.26 )
						ret := 0.833333 // buy
					if( ema3 > 1122.26 )
						if( VIP <= 2.03601 )
							if( VIP_VIM <= 0.924347 )
								if( ema3 <= 1154.65 )
									ret := -0.083333
								if( ema3 > 1154.65 )
									ret := -0.345455
							if( VIP_VIM > 0.924347 )
								if( ema3 <= 1141.7 )
									ret := -1.000000 // sell
								if( ema3 > 1141.7 )
									ret := -0.500000
						if( VIP > 2.03601 )
							ret := 1.000000 // buy
				if( ema3 > 1178.92 )
					if( VIM <= 0.855264 )
						if( ema1 <= 1201.49 )
							if( tema <= 1211.04 )
								if( VIP <= 1.31999 )
									ret := 0.000000
								if( VIP > 1.31999 )
									ret := 0.625000
							if( tema > 1211.04 )
								if( VIM <= 0.705433 )
									ret := 0.750000 // buy
								if( VIM > 0.705433 )
									ret := 1.000000 // buy
						if( ema1 > 1201.49 )
							if( VIP <= 1.30989 )
								if( VIP_VIM <= 0.501005 )
									ret := 0.142857
								if( VIP_VIM > 0.501005 )
									ret := -0.666667
							if( VIP > 1.30989 )
								if( ema12 <= 11.4468 )
									ret := 0.526316
								if( ema12 > 11.4468 )
									ret := -0.142857
					if( VIM > 0.855264 )
						if( ema12 <= 7.62005 )
							ret := 0.500000
						if( ema12 > 7.62005 )
							if( ema12 <= 10.5152 )
								if( ema12 <= 8.75604 )
									ret := -0.500000
								if( ema12 > 8.75604 )
									ret := 0.000000
							if( ema12 > 10.5152 )
								if( ema3 <= 1184.32 )
									ret := -0.500000
								if( ema3 > 1184.32 )
									ret := -0.750000 // sell
	if( ema3 > 1192.64 )
		if( ema13 <= -37.2243 )
			if( VIM <= 3.18961 )
				if( tema <= 1141.45 )
					ret := -0.428571
				if( tema > 1141.45 )
					if( ema2 <= 1761.62 )
						if( ema1 <= 1330.04 )
							if( VIP <= 0.876988 )
								if( ema3 <= 1316.13 )
									ret := 0.285714
								if( ema3 > 1316.13 )
									ret := 1.000000 // buy
							if( VIP > 0.876988 )
								ret := -0.400000
						if( ema1 > 1330.04 )
							if( ema12 <= -21.9282 )
								if( VIP_VIM <= -0.531467 )
									ret := 0.781818 // buy
								if( VIP_VIM > -0.531467 )
									ret := 1.000000 // buy
							if( ema12 > -21.9282 )
								if( ema3 <= 1489.61 )
									ret := 1.000000 // buy
								if( ema3 > 1489.61 )
									ret := 0.230769
					if( ema2 > 1761.62 )
						if( ema3 <= 1838.96 )
							if( ema12 <= -41.5832 )
								ret := -1.000000 // sell
							if( ema12 > -41.5832 )
								ret := -0.500000
						if( ema3 > 1838.96 )
							if( ema3 <= 2029.45 )
								if( ema2 <= 1853.18 )
									ret := 1.000000 // buy
								if( ema2 > 1853.18 )
									ret := 0.100000
							if( ema3 > 2029.45 )
								ret := 1.000000 // buy
			if( VIM > 3.18961 )
				if( ema12 <= -25.2844 )
					ret := -0.750000 // sell
				if( ema12 > -25.2844 )
					ret := -1.000000 // sell
		if( ema13 > -37.2243 )
			if( ema12 <= -11.8282 )
				if( VIP <= 0.61083 )
					if( ema3 <= 1600.59 )
						if( ema1 <= 1539.52 )
							if( VIM <= 1.40596 )
								ret := -0.400000
							if( VIM > 1.40596 )
								if( ema12 <= -13.5342 )
									ret := 0.703704 // buy
								if( ema12 > -13.5342 )
									ret := 0.000000
						if( ema1 > 1539.52 )
							if( ema13 <= -24.0539 )
								ret := 0.750000 // buy
							if( ema13 > -24.0539 )
								ret := 1.000000 // buy
					if( ema3 > 1600.59 )
						if( VIM <= 1.57064 )
							if( ema3 <= 1674.81 )
								if( tema <= 1610.57 )
									ret := -0.187500
								if( tema > 1610.57 )
									ret := 0.700000 // buy
							if( ema3 > 1674.81 )
								if( VIP <= 0.529593 )
									ret := 0.333333
								if( VIP > 0.529593 )
									ret := -0.692308
						if( VIM > 1.57064 )
							ret := 0.600000
				if( VIP > 0.61083 )
					if( ema1 <= 1501.25 )
						if( VIM <= 1.28981 )
							if( VIP_VIM <= -0.354948 )
								if( VIM <= 1.23525 )
									ret := 0.050000
								if( VIM > 1.23525 )
									ret := -0.766667 // sell
							if( VIP_VIM > -0.354948 )
								if( ema13 <= -30.9409 )
									ret := -0.500000
								if( ema13 > -30.9409 )
									ret := -0.969231 // sell
						if( VIM > 1.28981 )
							if( VIP <= 1.35872 )
								if( ema12 <= -14.3529 )
									ret := -0.449664
								if( ema12 > -14.3529 )
									ret := -0.083333
							if( VIP > 1.35872 )
								if( ema2 <= 1371.71 )
									ret := 1.000000 // buy
								if( ema2 > 1371.71 )
									ret := 0.750000 // buy
					if( ema1 > 1501.25 )
						if( VIM <= 1.34481 )
							if( ema2 <= 1574.2 )
								if( tema <= 1524.23 )
									ret := 0.153846
								if( tema > 1524.23 )
									ret := 0.800000 // buy
							if( ema2 > 1574.2 )
								if( ema2 <= 1603.89 )
									ret := -0.791667 // sell
								if( ema2 > 1603.89 )
									ret := 0.127820
						if( VIM > 1.34481 )
							if( ema13 <= -33.7809 )
								if( tema <= 1558.63 )
									ret := 0.615385
								if( tema > 1558.63 )
									ret := -0.095238
							if( ema13 > -33.7809 )
								if( tema <= 1550.33 )
									ret := -0.706897 // sell
								if( tema > 1550.33 )
									ret := -0.202970
			if( ema12 > -11.8282 )
				if( ema3 <= 1204.93 )
					if( VIM <= 0.757689 )
						if( ema3 <= 1199.44 )
							if( ema2 <= 1201.8 )
								ret := 1.000000 // buy
							if( ema2 > 1201.8 )
								if( VIM <= 0.598534 )
									ret := 0.900000 // buy
								if( VIM > 0.598534 )
									ret := 0.000000
						if( ema3 > 1199.44 )
							if( ema1 <= 1215.74 )
								ret := -0.500000
							if( ema1 > 1215.74 )
								if( ema2 <= 1209.94 )
									ret := 0.250000
								if( ema2 > 1209.94 )
									ret := 0.000000
					if( VIM > 0.757689 )
						if( ema2 <= 1201.03 )
							if( ema2 <= 1198.57 )
								if( VIP_VIM <= 0.233292 )
									ret := -0.190939
								if( VIP_VIM > 0.233292 )
									ret := -0.774194 // sell
							if( ema2 > 1198.57 )
								if( VIP_VIM <= 0.198258 )
									ret := 0.479592
								if( VIP_VIM > 0.198258 )
									ret := -0.222222
						if( ema2 > 1201.03 )
							if( ema1 <= 1209.29 )
								if( ema3 <= 1203.03 )
									ret := -0.727273 // sell
								if( ema3 > 1203.03 )
									ret := -0.133333
							if( ema1 > 1209.29 )
								if( ema1 <= 1216.15 )
									ret := 0.071429
								if( ema1 > 1216.15 )
									ret := -0.684211
				if( ema3 > 1204.93 )
					if( ema2 <= 1207.2 )
						if( tema <= 1184.04 )
							if( VIP <= 0.874843 )
								ret := 0.142857
							if( VIP > 0.874843 )
								if( VIP <= 0.964338 )
									ret := -1.000000 // sell
								if( VIP > 0.964338 )
									ret := -0.500000
						if( tema > 1184.04 )
							if( tema <= 1219.38 )
								if( VIM <= 1.12595 )
									ret := 0.253333
								if( VIM > 1.12595 )
									ret := 0.609589
							if( tema > 1219.38 )
								ret := -0.857143 // sell
					if( ema2 > 1207.2 )
						if( ema1 <= 1306.64 )
							if( ema3 <= 1280.98 )
								if( ema2 <= 1237.93 )
									ret := -0.085478
								if( ema2 > 1237.93 )
									ret := 0.096963
							if( ema3 > 1280.98 )
								if( ema3 <= 1285.28 )
									ret := -0.541063
								if( ema3 > 1285.28 )
									ret := -0.070732
						if( ema1 > 1306.64 )
							if( ema12 <= 1.8967 )
								if( ema2 <= 1307.8 )
									ret := 0.734694 // buy
								if( ema2 > 1307.8 )
									ret := 0.067187
							if( ema12 > 1.8967 )
								if( tema <= 1539.2 )
									ret := 0.091663
								if( tema > 1539.2 )
									ret := -0.046229
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_MELI_15Min_c3394b19(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


