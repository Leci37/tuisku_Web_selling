//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: NVDA_30Min_2SV0_f84dbdbf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_30Min_2SV0_f84dbdbf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_30Min_f84dbdbf(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 69.5653 )
		if( d <= 3.9401 )
			if( rsi1 <= 16.4878 )
				if( rsi1 <= 14.3851 )
					if( smoothK_k <= 3.58649 )
						if( rsi1 <= 11.7136 )
							if( rsi1 <= 3.52928 )
								if( rsi1 <= 0.664603 )
									ret := 0.900000 // buy
								if( rsi1 > 0.664603 )
									ret := -0.250000
							if( rsi1 > 3.52928 )
								if( rsi1 <= 4.86468 )
									ret := 0.837209 // buy
								if( rsi1 > 4.86468 )
									ret := 0.317460
						if( rsi1 > 11.7136 )
							if( k <= 1.9675 )
								if( VIM <= 1.34078 )
									ret := 0.202899
								if( VIM > 1.34078 )
									ret := -0.365079
							if( k > 1.9675 )
								if( VIP <= 0.995539 )
									ret := 0.273810
								if( VIP > 0.995539 )
									ret := -0.800000 // sell
					if( smoothK_k > 3.58649 )
						if( rsi1 <= 12.9944 )
							if( d <= 3.05927 )
								ret := -0.750000 // sell
							if( d > 3.05927 )
								ret := -1.000000 // sell
						if( rsi1 > 12.9944 )
							ret := 0.250000
				if( rsi1 > 14.3851 )
					if( d_k <= 0.612876 )
						if( smoothK_k <= 1.28869 )
							if( VIP_VIM <= -0.731998 )
								if( smoothK_k <= -0.859608 )
									ret := -0.150000
								if( smoothK_k > -0.859608 )
									ret := 0.400000
							if( VIP_VIM > -0.731998 )
								if( k <= 2.83342 )
									ret := 0.730435 // buy
								if( k > 2.83342 )
									ret := 0.000000
						if( smoothK_k > 1.28869 )
							if( VIM <= 1.51785 )
								if( smoothK_k <= 2.17068 )
									ret := 0.812500 // buy
								if( smoothK_k > 2.17068 )
									ret := 1.000000 // buy
							if( VIM > 1.51785 )
								ret := 0.500000
					if( d_k > 0.612876 )
						if( VIP <= 0.874326 )
							if( d <= 1.1926 )
								ret := -0.666667
							if( d > 1.1926 )
								if( VIM <= 1.45181 )
									ret := 0.554054
								if( VIM > 1.45181 )
									ret := -0.333333
						if( VIP > 0.874326 )
							if( VIP_VIM <= -0.421944 )
								ret := -1.000000 // sell
							if( VIP_VIM > -0.421944 )
								ret := -0.500000
			if( rsi1 > 16.4878 )
				if( d_k <= -0.437378 )
					if( VIP <= 0.700223 )
						if( VIP_VIM <= -0.726543 )
							if( k <= 3.74799 )
								if( d <= 1.65413 )
									ret := -0.100000
								if( d > 1.65413 )
									ret := 0.750000 // buy
							if( k > 3.74799 )
								if( rsi1 <= 18.6293 )
									ret := -0.833333 // sell
								if( rsi1 > 18.6293 )
									ret := -0.090909
						if( VIP_VIM > -0.726543 )
							if( d_k <= -0.716058 )
								if( d <= 1.21259 )
									ret := 0.000000
								if( d > 1.21259 )
									ret := -0.493506
							if( d_k > -0.716058 )
								if( smoothK_k <= -0.822317 )
									ret := -1.000000 // sell
								if( smoothK_k > -0.822317 )
									ret := -0.500000
					if( VIP > 0.700223 )
						if( d_k <= -0.614656 )
							if( VIP <= 1.06996 )
								if( d_k <= -3.08302 )
									ret := -0.035461
								if( d_k > -3.08302 )
									ret := 0.152859
							if( VIP > 1.06996 )
								if( smoothD_d <= 0.672929 )
									ret := -0.218045
								if( smoothD_d > 0.672929 )
									ret := 0.466667
						if( d_k > -0.614656 )
							if( VIM <= 1.30488 )
								if( VIP_VIM <= 0.161929 )
									ret := -0.278846
								if( VIP_VIM > 0.161929 )
									ret := -0.916667 // sell
							if( VIM > 1.30488 )
								if( VIM <= 1.43966 )
									ret := 0.476190
								if( VIM > 1.43966 )
									ret := -1.000000 // sell
				if( d_k > -0.437378 )
					if( rsi1 <= 22.1204 )
						if( VIP_VIM <= -0.419201 )
							if( VIP <= 0.741956 )
								if( VIM <= 1.26212 )
									ret := -0.544118
								if( VIM > 1.26212 )
									ret := 0.087500
							if( VIP > 0.741956 )
								if( VIM <= 1.58453 )
									ret := 0.322581
								if( VIM > 1.58453 )
									ret := -0.666667
						if( VIP_VIM > -0.419201 )
							if( rsi1 <= 21.3935 )
								if( smoothK_k <= -2.99978 )
									ret := -0.375000
								if( smoothK_k > -2.99978 )
									ret := -0.764706 // sell
							if( rsi1 > 21.3935 )
								ret := 0.000000
					if( rsi1 > 22.1204 )
						if( rsi1 <= 23.2043 )
							if( smoothD_d <= -1.55879 )
								if( VIM <= 1.25852 )
									ret := 0.927273 // buy
								if( VIM > 1.25852 )
									ret := 0.214286
							if( smoothD_d > -1.55879 )
								if( VIM <= 1.2643 )
									ret := -0.280000
								if( VIM > 1.2643 )
									ret := 0.590909
						if( rsi1 > 23.2043 )
							if( VIP <= 1.62579 )
								if( d <= 0.000724 )
									ret := -0.004425
								if( d > 0.000724 )
									ret := 0.220143
							if( VIP > 1.62579 )
								ret := -1.000000 // sell
		if( d > 3.9401 )
			if( d <= 6.4779 )
				if( VIM <= 1.36461 )
					if( smoothK_k <= 4.3491 )
						if( rsi1 <= 11.4505 )
							if( smoothK_k <= -0.556262 )
								if( d <= 4.52849 )
									ret := -0.750000 // sell
								if( d > 4.52849 )
									ret := 0.375000
							if( smoothK_k > -0.556262 )
								if( smoothK_k <= 1.49949 )
									ret := 0.875000 // buy
								if( smoothK_k > 1.49949 )
									ret := 0.250000
						if( rsi1 > 11.4505 )
							if( rsi1 <= 48.09 )
								if( VIM <= 1.1422 )
									ret := 0.025918
								if( VIM > 1.1422 )
									ret := -0.218543
							if( rsi1 > 48.09 )
								if( rsi1 <= 52.6488 )
									ret := -0.507692
								if( rsi1 > 52.6488 )
									ret := -0.158730
					if( smoothK_k > 4.3491 )
						if( k <= 10.4803 )
							if( rsi1 <= 45.7785 )
								if( d_k <= -2.88337 )
									ret := -0.118644
								if( d_k > -2.88337 )
									ret := 0.255102
							if( rsi1 > 45.7785 )
								if( smoothD_d <= 2.93215 )
									ret := 0.602151
								if( smoothD_d > 2.93215 )
									ret := -0.217391
						if( k > 10.4803 )
							if( rsi1 <= 20.5665 )
								if( d <= 5.91698 )
									ret := 0.500000
								if( d > 5.91698 )
									ret := 1.000000 // buy
							if( rsi1 > 20.5665 )
								if( smoothD_d <= 2.70958 )
									ret := 0.000000
								if( smoothD_d > 2.70958 )
									ret := -0.366013
				if( VIM > 1.36461 )
					if( d_k <= 5.34583 )
						if( VIP_VIM <= -0.789733 )
							if( VIM <= 1.38127 )
								ret := 1.000000 // buy
							if( VIM > 1.38127 )
								if( d_k <= 4.7973 )
									ret := -0.122807
								if( d_k > 4.7973 )
									ret := -0.800000 // sell
						if( VIP_VIM > -0.789733 )
							if( rsi1 <= 10.2988 )
								if( k <= 2.32821 )
									ret := 0.500000
								if( k > 2.32821 )
									ret := 1.000000 // buy
							if( rsi1 > 10.2988 )
								if( rsi1 <= 30.0959 )
									ret := 0.234234
								if( rsi1 > 30.0959 )
									ret := -0.076923
					if( d_k > 5.34583 )
						if( VIP <= 0.790168 )
							ret := 0.500000
						if( VIP > 0.790168 )
							ret := 1.000000 // buy
			if( d > 6.4779 )
				if( smoothK_k <= 77.9427 )
					if( d_k <= 25.6991 )
						if( VIP <= 0.91544 )
							if( d_k <= 22.0545 )
								if( d <= 8.09431 )
									ret := 0.132568
								if( d > 8.09431 )
									ret := -0.018511
							if( d_k > 22.0545 )
								if( d_k <= 24.2584 )
									ret := 0.334572
								if( d_k > 24.2584 )
									ret := -0.038462
						if( VIP > 0.91544 )
							if( VIP_VIM <= -0.1405 )
								if( rsi1 <= 17.9969 )
									ret := 0.526316
								if( rsi1 > 17.9969 )
									ret := 0.091677
							if( VIP_VIM > -0.1405 )
								if( smoothK_k <= -2.78435 )
									ret := 0.242623
								if( smoothK_k > -2.78435 )
									ret := 0.034316
					if( d_k > 25.6991 )
						if( rsi1 <= 22.1142 )
							if( d <= 31.9238 )
								if( d <= 26.897 )
									ret := 0.750000 // buy
								if( d > 26.897 )
									ret := 0.500000
							if( d > 31.9238 )
								if( VIP <= 0.696898 )
									ret := 0.115385
								if( VIP > 0.696898 )
									ret := -0.422535
						if( rsi1 > 22.1142 )
							if( VIP_VIM <= -0.093885 )
								if( VIM <= 1.33432 )
									ret := 0.378723
								if( VIM > 1.33432 )
									ret := -0.062500
							if( VIP_VIM > -0.093885 )
								if( VIP <= 1.02851 )
									ret := 0.259740
								if( VIP > 1.02851 )
									ret := 0.021480
				if( smoothK_k > 77.9427 )
					if( rsi1 <= 63.9082 )
						if( VIP_VIM <= 0.016293 )
							if( d_k <= -20.6611 )
								if( smoothK_k <= 89.424 )
									ret := 0.095833
								if( smoothK_k > 89.424 )
									ret := 0.379085
							if( d_k > -20.6611 )
								if( d_k <= 4.69896 )
									ret := -0.040545
								if( d_k > 4.69896 )
									ret := 0.189873
						if( VIP_VIM > 0.016293 )
							if( d <= 96.1251 )
								if( rsi1 <= 43.716 )
									ret := 0.450980
								if( rsi1 > 43.716 )
									ret := -0.129485
							if( d > 96.1251 )
								if( VIM <= 0.90005 )
									ret := 0.429293
								if( VIM > 0.90005 )
									ret := 0.000000
					if( rsi1 > 63.9082 )
						if( k <= 96.6494 )
							if( k <= 93.3891 )
								if( smoothD_d <= 68.7907 )
									ret := -0.204082
								if( smoothD_d > 68.7907 )
									ret := 0.090242
							if( k > 93.3891 )
								if( VIP_VIM <= 0.240921 )
									ret := 0.608939
								if( VIP_VIM > 0.240921 )
									ret := 0.267568
						if( k > 96.6494 )
							if( d_k <= -2.16085 )
								if( smoothD_d <= 89.2359 )
									ret := -0.102564
								if( smoothD_d > 89.2359 )
									ret := 0.278049
							if( d_k > -2.16085 )
								if( d <= 99.9995 )
									ret := -0.229607
								if( d > 99.9995 )
									ret := 0.173913
	if( rsi1 > 69.5653 )
		if( VIM <= 0.623218 )
			if( d_k <= -31.8204 )
				ret := -1.000000 // sell
			if( d_k > -31.8204 )
				if( rsi1 <= 97.1345 )
					if( rsi1 <= 80.1248 )
						if( VIP_VIM <= 0.739513 )
							if( d_k <= -14.6374 )
								if( d_k <= -22.1223 )
									ret := 0.750000 // buy
								if( d_k > -22.1223 )
									ret := 0.333333
							if( d_k > -14.6374 )
								if( rsi1 <= 77.0061 )
									ret := 0.000000
								if( rsi1 > 77.0061 )
									ret := -0.652174
						if( VIP_VIM > 0.739513 )
							if( rsi1 <= 78.371 )
								if( d_k <= 2.56095 )
									ret := -0.428571
								if( d_k > 2.56095 )
									ret := 0.153846
							if( rsi1 > 78.371 )
								if( smoothD_d <= 88.2754 )
									ret := 0.760000 // buy
								if( smoothD_d > 88.2754 )
									ret := 0.052632
					if( rsi1 > 80.1248 )
						if( d <= 99.9851 )
							if( d_k <= -20.8933 )
								if( k <= 99.0229 )
									ret := 0.416667
								if( k > 99.0229 )
									ret := 1.000000 // buy
							if( d_k > -20.8933 )
								if( d <= 99.7673 )
									ret := 0.302668
								if( d > 99.7673 )
									ret := 0.731343 // buy
						if( d > 99.9851 )
							if( VIP_VIM <= 0.865603 )
								if( VIP <= 1.38146 )
									ret := -0.600000
								if( VIP > 1.38146 )
									ret := -0.100000
							if( VIP_VIM > 0.865603 )
								if( VIM <= 0.503658 )
									ret := 0.545455
								if( VIM > 0.503658 )
									ret := 0.076923
				if( rsi1 > 97.1345 )
					if( smoothD_d <= 95.9653 )
						if( smoothD_d <= 95.5173 )
							ret := -0.285714
						if( smoothD_d > 95.5173 )
							if( VIP <= 1.43845 )
								ret := -0.750000 // sell
							if( VIP > 1.43845 )
								ret := -1.000000 // sell
					if( smoothD_d > 95.9653 )
						if( VIP_VIM <= 1.08951 )
							if( k <= 99.9764 )
								ret := 0.833333 // buy
							if( k > 99.9764 )
								if( d_k <= -0.032848 )
									ret := 0.600000
								if( d_k > -0.032848 )
									ret := -0.285714
						if( VIP_VIM > 1.08951 )
							ret := -0.600000
		if( VIM > 0.623218 )
			if( smoothD_d <= 96.8931 )
				if( smoothK_k <= 19.6048 )
					if( VIM <= 0.98015 )
						if( smoothK_k <= 13.0303 )
							if( rsi1 <= 78.8924 )
								if( smoothD_d <= 6.53756 )
									ret := 0.353383
								if( smoothD_d > 6.53756 )
									ret := -0.128676
							if( rsi1 > 78.8924 )
								if( d_k <= 28.1344 )
									ret := 0.617647
								if( d_k > 28.1344 )
									ret := 0.000000
						if( smoothK_k > 13.0303 )
							if( rsi1 <= 70.6803 )
								if( k <= 21.5559 )
									ret := 0.235294
								if( k > 21.5559 )
									ret := -0.636364
							if( rsi1 > 70.6803 )
								if( VIM <= 0.943524 )
									ret := 0.563636
								if( VIM > 0.943524 )
									ret := -0.357143
					if( VIM > 0.98015 )
						if( VIP_VIM <= 0.172275 )
							if( d_k <= 6.53501 )
								ret := 0.250000
							if( d_k > 6.53501 )
								if( VIM <= 1.02938 )
									ret := 0.750000 // buy
								if( VIM > 1.02938 )
									ret := 1.000000 // buy
						if( VIP_VIM > 0.172275 )
							if( VIP_VIM <= 0.399524 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.399524 )
								ret := 0.833333 // buy
				if( smoothK_k > 19.6048 )
					if( k <= 78.9407 )
						if( d_k <= 16.4688 )
							if( d <= 63.1012 )
								if( smoothK_k <= 28.9412 )
									ret := -0.093750
								if( smoothK_k > 28.9412 )
									ret := 0.110043
							if( d > 63.1012 )
								if( VIP <= 1.07839 )
									ret := -0.627451
								if( VIP > 1.07839 )
									ret := -0.024376
						if( d_k > 16.4688 )
							if( d <= 55.1075 )
								if( k <= 28.9826 )
									ret := 0.127660
								if( k > 28.9826 )
									ret := 0.712121 // buy
							if( d > 55.1075 )
								if( smoothK_k <= 55.0626 )
									ret := -0.017857
								if( smoothK_k > 55.0626 )
									ret := 0.541667
					if( k > 78.9407 )
						if( k <= 80.0683 )
							if( rsi1 <= 78.7837 )
								if( VIP <= 1.32261 )
									ret := 0.364486
								if( VIP > 1.32261 )
									ret := -0.296296
							if( rsi1 > 78.7837 )
								if( VIP <= 1.40871 )
									ret := 0.712121 // buy
								if( VIP > 1.40871 )
									ret := 0.000000
						if( k > 80.0683 )
							if( d_k <= -1.82619 )
								if( VIP <= 1.01198 )
									ret := -0.551724
								if( VIP > 1.01198 )
									ret := 0.069075
							if( d_k > -1.82619 )
								if( rsi1 <= 95.0481 )
									ret := 0.144355
								if( rsi1 > 95.0481 )
									ret := -0.416667
			if( smoothD_d > 96.8931 )
				if( rsi1 <= 80.5681 )
					if( VIM <= 1.36192 )
						if( rsi1 <= 73.4231 )
							if( VIP <= 1.31903 )
								if( VIM <= 0.880292 )
									ret := -0.333333
								if( VIM > 0.880292 )
									ret := -1.000000 // sell
							if( VIP > 1.31903 )
								ret := 0.333333
						if( rsi1 > 73.4231 )
							if( VIM <= 0.797701 )
								if( VIP <= 1.25906 )
									ret := -0.440000
								if( VIP > 1.25906 )
									ret := 0.181818
							if( VIM > 0.797701 )
								if( rsi1 <= 76.6151 )
									ret := 0.228571
								if( rsi1 > 76.6151 )
									ret := 0.696970
					if( VIM > 1.36192 )
						if( smoothD_d <= 96.9969 )
							ret := -1.000000 // sell
						if( smoothD_d > 96.9969 )
							ret := -0.714286 // sell
				if( rsi1 > 80.5681 )
					if( smoothD_d <= 96.9987 )
						if( VIP <= 1.24395 )
							if( VIP <= 1.18016 )
								ret := -0.600000
							if( VIP > 1.18016 )
								ret := 0.333333
						if( VIP > 1.24395 )
							if( rsi1 <= 87.3539 )
								if( VIM <= 0.710571 )
									ret := -0.705882 // sell
								if( VIM > 0.710571 )
									ret := -0.958333 // sell
							if( rsi1 > 87.3539 )
								if( VIM <= 0.64901 )
									ret := 0.750000 // buy
								if( VIM > 0.64901 )
									ret := -0.451613
					if( smoothD_d > 96.9987 )
						if( VIP_VIM <= 0.662171 )
							if( VIP <= 1.32546 )
								if( VIP_VIM <= 0.52399 )
									ret := -0.347826
								if( VIP_VIM > 0.52399 )
									ret := 0.148148
							if( VIP > 1.32546 )
								if( VIP <= 1.37572 )
									ret := -0.772727 // sell
								if( VIP > 1.37572 )
									ret := -0.368421
						if( VIP_VIM > 0.662171 )
							if( VIM <= 0.629275 )
								ret := -0.750000 // sell
							if( VIM > 0.629275 )
								if( VIP_VIM <= 0.764716 )
									ret := 0.368421
								if( VIP_VIM > 0.764716 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_NVDA_30Min_f84dbdbf(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


