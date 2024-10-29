//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Squeeze_Momentum_Indicator
// ID_model: MELI_15Min_1SQU_6a96dfe3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_1SQU_6a96dfe3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_6a96dfe3(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avgHighLow <= 1200.26 )
		if( upperKC <= 1165.32 )
			if( upperKC <= 1136.53 )
				if( lowerBB <= 1082.08 )
					if( rangema <= 11.0418 )
						if( lowerBB <= 1071.48 )
							if( lowerKC <= 152.654 )
								if( rangema <= 0.786575 )
									ret := 0.818182 // buy
								if( rangema > 0.786575 )
									ret := 0.133333
							if( lowerKC > 152.654 )
								if( dev <= 40.2822 )
									ret := 0.062751
								if( dev > 40.2822 )
									ret := 0.423237
						if( lowerBB > 1071.48 )
							if( avgHighLow <= 1091.21 )
								if( ma <= 1086.37 )
									ret := -0.333333
								if( ma > 1086.37 )
									ret := 0.540984
							if( avgHighLow > 1091.21 )
								if( rangema <= 6.61567 )
									ret := 0.153846
								if( rangema > 6.61567 )
									ret := -0.721739 // sell
					if( rangema > 11.0418 )
						if( ma <= 702.012 )
							if( upperKC <= 481.393 )
								if( ma <= 461.547 )
									ret := 0.843750 // buy
								if( ma > 461.547 )
									ret := -0.166667
							if( upperKC > 481.393 )
								if( avgHighLow <= 462.858 )
									ret := 0.045455
								if( avgHighLow > 462.858 )
									ret := -0.654822
						if( ma > 702.012 )
							if( lowerKC <= 905.985 )
								if( avgHighLow <= 799.803 )
									ret := -0.064815
								if( avgHighLow > 799.803 )
									ret := 0.405109
							if( lowerKC > 905.985 )
								if( upperKC <= 1120.21 )
									ret := -0.147458
								if( upperKC > 1120.21 )
									ret := 0.625000
				if( lowerBB > 1082.08 )
					if( avgHighLow <= 1103.86 )
						if( dev <= 17.0963 )
							if( sqzOnInt <= 0.5 )
								if( lowerKC <= 1098.3 )
									ret := 0.793750 // buy
								if( lowerKC > 1098.3 )
									ret := -0.400000
							if( sqzOnInt > 0.5 )
								if( ma <= 1089.71 )
									ret := 0.837838 // buy
								if( ma > 1089.71 )
									ret := 0.222222
						if( dev > 17.0963 )
							if( basis <= 1102.62 )
								if( ma <= 1100.96 )
									ret := -0.500000
								if( ma > 1100.96 )
									ret := -1.000000 // sell
							if( basis > 1102.62 )
								if( val <= -1.32773 )
									ret := 0.200000
								if( val > -1.32773 )
									ret := 0.807692 // buy
					if( avgHighLow > 1103.86 )
						if( lowerBB <= 1102.99 )
							if( lowerBB <= 1089.02 )
								if( val <= 1.26258 )
									ret := 0.078125
								if( val > 1.26258 )
									ret := 0.911765 // buy
							if( lowerBB > 1089.02 )
								if( rangema <= 11.1479 )
									ret := -0.211656
								if( rangema > 11.1479 )
									ret := 0.625000
						if( lowerBB > 1102.99 )
							if( upperKC <= 1133.38 )
								if( val <= 0.339823 )
									ret := 0.772727 // buy
								if( val > 0.339823 )
									ret := 0.136364
							if( upperKC > 1133.38 )
								if( dev <= 14.1946 )
									ret := -0.084746
								if( dev > 14.1946 )
									ret := 0.743590 // buy
			if( upperKC > 1136.53 )
				if( rangema <= 9.00055 )
					if( val <= -0.786639 )
						if( upperBB <= 1169.59 )
							if( upperBB <= 1158.17 )
								if( priceRange <= 9.4602 )
									ret := -0.686275
								if( priceRange > 9.4602 )
									ret := -0.157895
							if( upperBB > 1158.17 )
								if( avgHighLow <= 1152 )
									ret := 0.212121
								if( avgHighLow > 1152 )
									ret := -0.666667
						if( upperBB > 1169.59 )
							if( lowerKC <= 1133 )
								ret := 0.000000
							if( lowerKC > 1133 )
								if( val <= -0.961107 )
									ret := -1.000000 // sell
								if( val > -0.961107 )
									ret := -0.727273 // sell
					if( val > -0.786639 )
						if( lowerKC <= 1134.99 )
							if( upperBB <= 1159.5 )
								if( basis <= 1134.53 )
									ret := 0.149254
								if( basis > 1134.53 )
									ret := 0.612403
							if( upperBB > 1159.5 )
								if( lowerBB <= 1103.66 )
									ret := 0.250000
								if( lowerBB > 1103.66 )
									ret := -0.631579
						if( lowerKC > 1134.99 )
							if( val <= 0.803693 )
								if( lowerBB <= 1150.03 )
									ret := -0.565217
								if( lowerBB > 1150.03 )
									ret := 1.000000 // buy
							if( val > 0.803693 )
								if( upperBB <= 1174.06 )
									ret := 0.644444
								if( upperBB > 1174.06 )
									ret := -1.000000 // sell
				if( rangema > 9.00055 )
					if( dev <= 15.7945 )
						if( lowerKC <= 1129.92 )
							if( avgHighLow <= 1155.67 )
								if( avgHighLow <= 1126.65 )
									ret := -0.646154
								if( avgHighLow > 1126.65 )
									ret := -0.845238 // sell
							if( avgHighLow > 1155.67 )
								if( basis <= 1144.49 )
									ret := 0.000000
								if( basis > 1144.49 )
									ret := -0.250000
						if( lowerKC > 1129.92 )
							if( ma <= 1149.19 )
								ret := 0.750000 // buy
							if( ma > 1149.19 )
								ret := 1.000000 // buy
					if( dev > 15.7945 )
						if( dev <= 20.3619 )
							if( lowerKC <= 1112.93 )
								if( priceRange <= 6.30165 )
									ret := 0.000000
								if( priceRange > 6.30165 )
									ret := 0.787234 // buy
							if( lowerKC > 1112.93 )
								if( avgHighLow <= 1152.57 )
									ret := -0.552632
								if( avgHighLow > 1152.57 )
									ret := 1.000000 // buy
						if( dev > 20.3619 )
							if( avgHighLow <= 1119.45 )
								if( ma <= 1125.9 )
									ret := 0.916667 // buy
								if( ma > 1125.9 )
									ret := 0.500000
							if( avgHighLow > 1119.45 )
								if( dev <= 33.5169 )
									ret := -0.554404
								if( dev > 33.5169 )
									ret := 0.018182
		if( upperKC > 1165.32 )
			if( rangema <= 5.51401 )
				if( upperBB <= 1198.95 )
					if( dev <= 7.96831 )
						if( lowerBB <= 1175.52 )
							if( val <= -1.19872 )
								ret := 0.200000
							if( val > -1.19872 )
								if( dev <= 5.04794 )
									ret := 0.333333
								if( dev > 5.04794 )
									ret := 0.920354 // buy
						if( lowerBB > 1175.52 )
							if( lowerKC <= 1175.17 )
								if( lowerKC <= 1173.57 )
									ret := 0.000000
								if( lowerKC > 1173.57 )
									ret := -0.500000
							if( lowerKC > 1175.17 )
								if( upperKC <= 1198.19 )
									ret := 0.884615 // buy
								if( upperKC > 1198.19 )
									ret := 0.333333
					if( dev > 7.96831 )
						if( avgHighLow <= 1175.86 )
							if( lowerBB <= 1153.28 )
								if( upperBB <= 1172.93 )
									ret := 0.846154 // buy
								if( upperBB > 1172.93 )
									ret := 0.166667
							if( lowerBB > 1153.28 )
								if( priceRange <= 1.575 )
									ret := -1.000000 // sell
								if( priceRange > 1.575 )
									ret := -0.277778
						if( avgHighLow > 1175.86 )
							if( rangema <= 5.12492 )
								if( lowerBB <= 1163.94 )
									ret := 0.750000 // buy
								if( lowerBB > 1163.94 )
									ret := 0.976190 // buy
							if( rangema > 5.12492 )
								if( avgHighLow <= 1186.26 )
									ret := 0.250000
								if( avgHighLow > 1186.26 )
									ret := 1.000000 // buy
				if( upperBB > 1198.95 )
					if( lowerBB <= 1187.65 )
						if( val <= 1.35447 )
							if( val <= 0.612694 )
								if( priceRange <= 9.50796 )
									ret := 0.000000
								if( priceRange > 9.50796 )
									ret := -0.500000
							if( val > 0.612694 )
								if( upperBB <= 1205.41 )
									ret := 0.333333
								if( upperBB > 1205.41 )
									ret := 1.000000 // buy
						if( val > 1.35447 )
							ret := -1.000000 // sell
					if( lowerBB > 1187.65 )
						if( basis <= 1199.29 )
							if( upperBB <= 1203.55 )
								if( lowerBB <= 1188.41 )
									ret := 0.500000
								if( lowerBB > 1188.41 )
									ret := 1.000000 // buy
							if( upperBB > 1203.55 )
								if( ma <= 1197.23 )
									ret := 1.000000 // buy
								if( ma > 1197.23 )
									ret := 0.000000
						if( basis > 1199.29 )
							if( basis <= 1201.4 )
								ret := 0.000000
							if( basis > 1201.4 )
								ret := 0.500000
			if( rangema > 5.51401 )
				if( rangema <= 13.3205 )
					if( lowerKC <= 1140.27 )
						if( dev <= 27.9502 )
							if( upperKC <= 1166.86 )
								ret := -0.166667
							if( upperKC > 1166.86 )
								if( avgHighLow <= 1163.65 )
									ret := 0.876543 // buy
								if( avgHighLow > 1163.65 )
									ret := 0.000000
						if( dev > 27.9502 )
							if( rangema <= 11.8982 )
								if( ma <= 1151.64 )
									ret := 0.200000
								if( ma > 1151.64 )
									ret := -0.750000 // sell
							if( rangema > 11.8982 )
								ret := 0.666667
					if( lowerKC > 1140.27 )
						if( upperBB <= 1185.87 )
							if( val <= -2.38923 )
								if( val <= -2.5322 )
									ret := 1.000000 // buy
								if( val > -2.5322 )
									ret := 0.666667
							if( val > -2.38923 )
								if( priceRange <= 1.64742 )
									ret := -0.833333 // sell
								if( priceRange > 1.64742 )
									ret := -0.031056
						if( upperBB > 1185.87 )
							if( upperKC <= 1190.53 )
								if( priceRange <= 28.7253 )
									ret := 0.493827
								if( priceRange > 28.7253 )
									ret := -0.833333 // sell
							if( upperKC > 1190.53 )
								if( lowerBB <= 1158.94 )
									ret := -0.297297
								if( lowerBB > 1158.94 )
									ret := 0.163311
				if( rangema > 13.3205 )
					if( dev <= 16.5794 )
						if( lowerKC <= 1145.33 )
							ret := 0.500000
						if( lowerKC > 1145.33 )
							ret := 1.000000 // buy
					if( dev > 16.5794 )
						if( lowerKC <= 1138.02 )
							if( val <= -0.581857 )
								if( basis <= 1159.65 )
									ret := -0.789474 // sell
								if( basis > 1159.65 )
									ret := 1.000000 // buy
							if( val > -0.581857 )
								if( lowerKC <= 1126.55 )
									ret := 0.250000
								if( lowerKC > 1126.55 )
									ret := 1.000000 // buy
						if( lowerKC > 1138.02 )
							if( priceRange <= 16.359 )
								if( ma <= 1169.92 )
									ret := -0.676471
								if( ma > 1169.92 )
									ret := -0.115385
							if( priceRange > 16.359 )
								if( priceRange <= 30.9321 )
									ret := -0.956522 // sell
								if( priceRange > 30.9321 )
									ret := -0.500000
	if( avgHighLow > 1200.26 )
		if( rangema <= 3.86945 )
			if( upperBB <= 1208.15 )
				if( dev <= 5.51743 )
					ret := -1.000000 // sell
				if( dev > 5.51743 )
					ret := -0.500000
			if( upperBB > 1208.15 )
				if( priceRange <= 14.007 )
					if( lowerBB <= 1291 )
						if( avgHighLow <= 1266.89 )
							if( lowerBB <= 1235.64 )
								if( upperKC <= 1233.66 )
									ret := 0.603448
								if( upperKC > 1233.66 )
									ret := -0.062500
							if( lowerBB > 1235.64 )
								if( basis <= 1246.08 )
									ret := 0.961538 // buy
								if( basis > 1246.08 )
									ret := 0.416667
						if( avgHighLow > 1266.89 )
							if( dev <= 8.22432 )
								if( upperBB <= 1284.56 )
									ret := -1.000000 // sell
								if( upperBB > 1284.56 )
									ret := -0.545455
							if( dev > 8.22432 )
								ret := 0.000000
					if( lowerBB > 1291 )
						if( ma <= 1565.28 )
							if( val <= 0.019724 )
								if( lowerKC <= 1377.62 )
									ret := 0.437500
								if( lowerKC > 1377.62 )
									ret := 0.903614 // buy
							if( val > 0.019724 )
								if( ma <= 1511.82 )
									ret := 0.206897
								if( ma > 1511.82 )
									ret := 0.772727 // buy
						if( ma > 1565.28 )
							if( upperBB <= 1576.58 )
								if( ma <= 1569.84 )
									ret := -0.500000
								if( ma > 1569.84 )
									ret := -1.000000 // sell
							if( upperBB > 1576.58 )
								if( basis <= 1583.05 )
									ret := 0.564516
								if( basis > 1583.05 )
									ret := 0.165217
				if( priceRange > 14.007 )
					if( basis <= 1395.26 )
						ret := -0.166667
					if( basis > 1395.26 )
						if( val <= 0.354118 )
							ret := -1.000000 // sell
						if( val > 0.354118 )
							ret := -0.750000 // sell
		if( rangema > 3.86945 )
			if( dev <= 58.5925 )
				if( upperBB <= 1405.07 )
					if( rangema <= 13.6157 )
						if( dev <= 8.21981 )
							if( avgHighLow <= 1341.59 )
								if( ma <= 1302.59 )
									ret := -0.158333
								if( ma > 1302.59 )
									ret := 0.270096
							if( avgHighLow > 1341.59 )
								if( lowerKC <= 1351.5 )
									ret := -0.593220
								if( lowerKC > 1351.5 )
									ret := -0.214286
						if( dev > 8.21981 )
							if( lowerKC <= 1192.23 )
								if( val <= -0.570259 )
									ret := -0.567568
								if( val > -0.570259 )
									ret := -0.061224
							if( lowerKC > 1192.23 )
								if( upperBB <= 1228.99 )
									ret := 0.230928
								if( upperBB > 1228.99 )
									ret := -0.018287
					if( rangema > 13.6157 )
						if( dev <= 36.8758 )
							if( upperKC <= 1392.43 )
								if( priceRange <= 17.4151 )
									ret := -0.425000
								if( priceRange > 17.4151 )
									ret := 0.105263
							if( upperKC > 1392.43 )
								ret := 0.800000 // buy
						if( dev > 36.8758 )
							if( val <= 0.494677 )
								if( priceRange <= 20.0279 )
									ret := -0.894737 // sell
								if( priceRange > 20.0279 )
									ret := -0.437500
							if( val > 0.494677 )
								if( lowerBB <= 1207.66 )
									ret := -0.944444 // sell
								if( lowerBB > 1207.66 )
									ret := -0.282051
				if( upperBB > 1405.07 )
					if( avgHighLow <= 1376.46 )
						if( ma <= 1372.45 )
							if( lowerBB <= 1330.19 )
								if( basis <= 1368.4 )
									ret := 0.000000
								if( basis > 1368.4 )
									ret := 0.500000
							if( lowerBB > 1330.19 )
								ret := -0.400000
						if( ma > 1372.45 )
							if( upperKC <= 1399.11 )
								if( val <= 0.781766 )
									ret := 0.846154 // buy
								if( val > 0.781766 )
									ret := 0.200000
							if( upperKC > 1399.11 )
								if( upperKC <= 1413.54 )
									ret := 1.000000 // buy
								if( upperKC > 1413.54 )
									ret := 0.750000 // buy
					if( avgHighLow > 1376.46 )
						if( avgHighLow <= 1517.32 )
							if( val <= 2.42646 )
								if( rangema <= 18.1817 )
									ret := 0.090508
								if( rangema > 18.1817 )
									ret := -0.481203
							if( val > 2.42646 )
								if( priceRange <= 35.1088 )
									ret := 0.669643
								if( priceRange > 35.1088 )
									ret := -0.666667
						if( avgHighLow > 1517.32 )
							if( val <= -0.525318 )
								if( dev <= 38.2535 )
									ret := 0.079860
								if( dev > 38.2535 )
									ret := -0.167109
							if( val > -0.525318 )
								if( dev <= 37.6039 )
									ret := -0.032737
								if( dev > 37.6039 )
									ret := 0.211538
			if( dev > 58.5925 )
				if( upperBB <= 1815.96 )
					if( rangema <= 23.7003 )
						if( basis <= 1260.78 )
							ret := -0.750000 // sell
						if( basis > 1260.78 )
							if( priceRange <= 4.98866 )
								ret := 1.000000 // buy
							if( priceRange > 4.98866 )
								if( basis <= 1647.61 )
									ret := 0.577778
								if( basis > 1647.61 )
									ret := 0.900000 // buy
					if( rangema > 23.7003 )
						if( rangema <= 24.7868 )
							ret := -0.250000
						if( rangema > 24.7868 )
							ret := -1.000000 // sell
				if( upperBB > 1815.96 )
					if( upperBB <= 1862 )
						if( priceRange <= 23.0023 )
							if( val <= 4.22594 )
								if( avgHighLow <= 1727.65 )
									ret := 0.500000
								if( avgHighLow > 1727.65 )
									ret := -0.750000 // sell
							if( val > 4.22594 )
								if( rangema <= 20.5913 )
									ret := -0.750000 // sell
								if( rangema > 20.5913 )
									ret := -1.000000 // sell
						if( priceRange > 23.0023 )
							ret := 0.166667
					if( upperBB > 1862 )
						if( basis <= 1763.19 )
							if( lowerBB <= 1588.17 )
								ret := -0.250000
							if( lowerBB > 1588.17 )
								if( rangema <= 28.3984 )
									ret := 1.000000 // buy
								if( rangema > 28.3984 )
									ret := 0.750000 // buy
						if( basis > 1763.19 )
							if( ma <= 1790.64 )
								ret := -0.714286 // sell
							if( ma > 1790.64 )
								if( rangema <= 20.7974 )
									ret := 0.500000
								if( rangema > 20.7974 )
									ret := -0.200000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Squeeze_Momentum_Indicator 
//@version=5
//indicator "Squeeze Momentum Indicator [LazyBear]", shorttitle="SQZMOM_LB", overlay=false)

lengthBB = input.int(20, title="BB Length")
mult = input.float(2.0, title="BB MultFactor")
lengthKC = input.int(20, title="KC Length")
multKC = input.float(1.5, title="KC MultFactor")

useTrueRange = input(true, title="Use TrueRange (KC)")

// Calculate BB
source = close
basis = ta.sma(source, lengthBB)
dev = multKC * ta.stdev(source, lengthBB)
upperBB = basis + dev
lowerBB = basis - dev

// Calculate KC
ma = ta.sma(source, lengthKC)
priceRange = useTrueRange ? ta.tr(true) : (high - low)
rangema = ta.sma(priceRange, lengthKC)
upperKC = ma + rangema * multKC
lowerKC = ma - rangema * multKC

sqzOn = (lowerBB > lowerKC) and (upperBB < upperKC)
sqzOff = (lowerBB < lowerKC) and (upperBB > upperKC)
noSqz = not sqzOn and not sqzOff
sqzOnInt = sqzOn ? 1: 0   //Bool to int
sqzOffInt = sqzOff ? 1: 0   //Bool to int
noSqzInt = noSqz ? 1: 0   //Bool to int

avgHighLow = (ta.highest(high, lengthKC) + ta.lowest(low, lengthKC)) / 2
val = ta.linreg(source - (avgHighLow + ta.sma(close, lengthKC)) / 2, lengthKC, 0)

bcolor = val > 0 ? (val > nz(val[1]) ? color.lime : color.green) : (val < nz(val[1]) ? color.red : color.maroon)
scolor = noSqz ? color.blue : sqzOn ? color.black : color.gray

plot(val, color=bcolor, style=plot.style_histogram, linewidth=4)
plot(0, color=scolor, style=plot.style_cross, linewidth=2)


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
float op_operation = decision_tree_0_MELI_15Min_6a96dfe3(sqzOnInt, priceRange, lowerKC, lowerBB, rangema, noSqzInt, basis, val, ma, dev, sqzOffInt, upperBB, upperKC, avgHighLow)

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


