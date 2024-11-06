//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: UPST_1Min_2ST0_a63da44b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2ST0_a63da44b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_a63da44b(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 48.5104 )
		if( ema2 <= 23.4319 )
			if( smoothD_d <= -1.12375 )
				if( ema13 <= -0.164393 )
					ret := 0.833333 // buy
				if( ema13 > -0.164393 )
					if( k <= 0.001848 )
						if( ema3 <= 22.442 )
							if( ema13 <= -0.02032 )
								if( rsi1 <= 32.4755 )
									ret := -0.291667
								if( rsi1 > 32.4755 )
									ret := 0.545455
							if( ema13 > -0.02032 )
								ret := -0.400000
						if( ema3 > 22.442 )
							if( ema3 <= 22.9582 )
								if( d_k <= 0.493954 )
									ret := 0.300000
								if( d_k > 0.493954 )
									ret := 0.823529 // buy
							if( ema3 > 22.9582 )
								if( smoothD_d <= -2.07401 )
									ret := 0.094340
								if( smoothD_d > -2.07401 )
									ret := -0.400000
					if( k > 0.001848 )
						if( d_k <= -1.42688 )
							if( smoothD_d <= -1.40048 )
								ret := 0.000000
							if( smoothD_d > -1.40048 )
								ret := 0.409091
						if( d_k > -1.42688 )
							if( k <= 1.55225 )
								if( rsi1 <= 12.4424 )
									ret := 0.391304
								if( rsi1 > 12.4424 )
									ret := -0.388158
							if( k > 1.55225 )
								if( ema2 <= 22.7192 )
									ret := -0.941176 // sell
								if( ema2 > 22.7192 )
									ret := -0.391304
			if( smoothD_d > -1.12375 )
				if( ema13 <= -0.141188 )
					if( d_k <= 0.514944 )
						if( smoothD_d <= 65.0686 )
							if( ema12 <= -0.314722 )
								if( d <= 13.2361 )
									ret := 0.900000 // buy
								if( d > 13.2361 )
									ret := 1.000000 // buy
							if( ema12 > -0.314722 )
								if( ema1 <= 22.9737 )
									ret := 0.653153
								if( ema1 > 22.9737 )
									ret := 0.328571
						if( smoothD_d > 65.0686 )
							if( ema2 <= 22.4098 )
								ret := 0.100000
							if( ema2 > 22.4098 )
								ret := -0.529412
					if( d_k > 0.514944 )
						if( smoothK_k <= 13.4791 )
							if( tema <= 21.4773 )
								ret := -0.666667
							if( tema > 21.4773 )
								if( k <= 1.12916 )
									ret := 0.000000
								if( k > 1.12916 )
									ret := 0.657143
						if( smoothK_k > 13.4791 )
							if( tema <= 22.5679 )
								if( k <= 36.4864 )
									ret := -0.960000 // sell
								if( k > 36.4864 )
									ret := -0.875000 // sell
							if( tema > 22.5679 )
								if( tema <= 22.9193 )
									ret := 0.857143 // buy
								if( tema > 22.9193 )
									ret := -0.444444
				if( ema13 > -0.141188 )
					if( ema13 <= 0.016463 )
						if( d_k <= 13.5303 )
							if( d_k <= 10.9802 )
								if( d_k <= 8.96317 )
									ret := 0.069726
								if( d_k > 8.96317 )
									ret := 0.356209
							if( d_k > 10.9802 )
								if( d <= 52.3838 )
									ret := -0.347619
								if( d > 52.3838 )
									ret := 0.149123
						if( d_k > 13.5303 )
							if( k <= 7.90605 )
								if( ema13 <= -0.023804 )
									ret := 0.833333 // buy
								if( ema13 > -0.023804 )
									ret := 0.170213
							if( k > 7.90605 )
								if( ema13 <= -0.035954 )
									ret := 0.471154
								if( ema13 > -0.035954 )
									ret := 0.027613
					if( ema13 > 0.016463 )
						if( smoothD_d <= 11.8387 )
							if( smoothD_d <= 7.00806 )
								if( rsi1 <= 47.2821 )
									ret := 0.476190
								if( rsi1 > 47.2821 )
									ret := -0.666667
							if( smoothD_d > 7.00806 )
								if( ema12 <= 0.016686 )
									ret := 0.929825 // buy
								if( ema12 > 0.016686 )
									ret := 0.500000
						if( smoothD_d > 11.8387 )
							if( rsi1 <= 48.1139 )
								if( ema13 <= 0.030414 )
									ret := 0.274336
								if( ema13 > 0.030414 )
									ret := 0.696203
							if( rsi1 > 48.1139 )
								ret := -0.333333
		if( ema2 > 23.4319 )
			if( tema <= 54.605 )
				if( rsi1 <= 19.8369 )
					if( ema2 <= 36.1005 )
						if( ema13 <= -0.460974 )
							if( d_k <= 1.33587 )
								if( d <= 9.43716 )
									ret := 0.628571
								if( d > 9.43716 )
									ret := 0.800000 // buy
							if( d_k > 1.33587 )
								ret := -0.260870
						if( ema13 > -0.460974 )
							if( ema3 <= 26.5748 )
								if( k <= 0.000584 )
									ret := -0.468085
								if( k > 0.000584 )
									ret := 0.074883
							if( ema3 > 26.5748 )
								if( d <= 4.33198 )
									ret := -0.092896
								if( d > 4.33198 )
									ret := -0.485660
					if( ema2 > 36.1005 )
						if( ema12 <= -0.13382 )
							if( ema1 <= 37.0969 )
								if( k <= 5.97132 )
									ret := 0.867647 // buy
								if( k > 5.97132 )
									ret := 0.416667
							if( ema1 > 37.0969 )
								if( rsi1 <= 6.45225 )
									ret := 1.000000 // buy
								if( rsi1 > 6.45225 )
									ret := 0.182482
						if( ema12 > -0.13382 )
							if( rsi1 <= 14.5746 )
								if( ema3 <= 43.4112 )
									ret := 0.188889
								if( ema3 > 43.4112 )
									ret := -0.777778 // sell
							if( rsi1 > 14.5746 )
								if( smoothK_k <= 28.372 )
									ret := -0.370370
								if( smoothK_k > 28.372 )
									ret := 0.296296
				if( rsi1 > 19.8369 )
					if( tema <= 23.3532 )
						if( ema1 <= 23.3822 )
							ret := 0.058824
						if( ema1 > 23.3822 )
							if( ema2 <= 23.493 )
								if( rsi1 <= 34.0656 )
									ret := -0.611111
								if( rsi1 > 34.0656 )
									ret := -1.000000 // sell
							if( ema2 > 23.493 )
								ret := -0.111111
					if( tema > 23.3532 )
						if( ema2 <= 30.9141 )
							if( smoothD_d <= 8.3762 )
								if( d <= 0.150658 )
									ret := 0.329545
								if( d > 0.150658 )
									ret := -0.053580
							if( smoothD_d > 8.3762 )
								if( ema3 <= 27.6045 )
									ret := 0.078991
								if( ema3 > 27.6045 )
									ret := 0.206298
						if( ema2 > 30.9141 )
							if( smoothK_k <= 94.6807 )
								if( ema12 <= 0.051198 )
									ret := 0.016196
								if( ema12 > 0.051198 )
									ret := -0.643836
							if( smoothK_k > 94.6807 )
								if( ema2 <= 39.7936 )
									ret := -0.589928
								if( ema2 > 39.7936 )
									ret := 0.078652
			if( tema > 54.605 )
				if( smoothK_k <= 13.6282 )
					ret := 0.111111
				if( smoothK_k > 13.6282 )
					if( smoothD_d <= 36.6528 )
						if( tema <= 55.0709 )
							ret := -1.000000 // sell
						if( tema > 55.0709 )
							ret := -0.909091 // sell
					if( smoothD_d > 36.6528 )
						if( ema12 <= -0.001153 )
							ret := -0.642857
						if( ema12 > -0.001153 )
							ret := -0.909091 // sell
	if( rsi1 > 48.5104 )
		if( ema12 <= 0.114 )
			if( ema13 <= 0.057529 )
				if( smoothK_k <= 31.5792 )
					if( ema13 <= -0.011691 )
						if( smoothK_k <= 23.2597 )
							if( ema1 <= 38.1448 )
								if( d <= 22.2797 )
									ret := -0.133333
								if( d > 22.2797 )
									ret := 0.420000
							if( ema1 > 38.1448 )
								if( tema <= 44.3248 )
									ret := -0.560000
								if( tema > 44.3248 )
									ret := 0.571429
						if( smoothK_k > 23.2597 )
							if( smoothD_d <= 28.788 )
								if( d_k <= -9.75193 )
									ret := -0.250000
								if( d_k > -9.75193 )
									ret := -0.782609 // sell
							if( smoothD_d > 28.788 )
								if( smoothK_k <= 27.6684 )
									ret := 0.259259
								if( smoothK_k > 27.6684 )
									ret := -0.466667
					if( ema13 > -0.011691 )
						if( ema1 <= 23.2497 )
							if( d <= 41.393 )
								if( ema2 <= 23.1933 )
									ret := 0.066207
								if( ema2 > 23.1933 )
									ret := 0.744186 // buy
							if( d > 41.393 )
								if( ema12 <= 0.001578 )
									ret := 0.266667
								if( ema12 > 0.001578 )
									ret := -0.500000
						if( ema1 > 23.2497 )
							if( ema2 <= 40.4619 )
								if( tema <= 31.5773 )
									ret := -0.135478
								if( tema > 31.5773 )
									ret := 0.043303
							if( ema2 > 40.4619 )
								if( d_k <= 9.16996 )
									ret := -0.148936
								if( d_k > 9.16996 )
									ret := -0.543689
				if( smoothK_k > 31.5792 )
					if( d_k <= -6.85492 )
						if( ema3 <= 40.2535 )
							if( tema <= 21.3246 )
								if( d_k <= -19.5448 )
									ret := 0.800000 // buy
								if( d_k > -19.5448 )
									ret := 0.315789
							if( tema > 21.3246 )
								if( ema12 <= 0.027581 )
									ret := -0.030473
								if( ema12 > 0.027581 )
									ret := -0.226506
						if( ema3 > 40.2535 )
							if( smoothK_k <= 95.6422 )
								if( k <= 93.3863 )
									ret := -0.170629
								if( k > 93.3863 )
									ret := -0.612903
							if( smoothK_k > 95.6422 )
								if( smoothD_d <= 87.4821 )
									ret := 0.633333
								if( smoothD_d > 87.4821 )
									ret := -0.941176 // sell
					if( d_k > -6.85492 )
						if( smoothD_d <= 60.2585 )
							if( tema <= 39.3635 )
								if( ema2 <= 22.7274 )
									ret := -0.080882
								if( ema2 > 22.7274 )
									ret := 0.201625
							if( tema > 39.3635 )
								if( ema2 <= 40.4707 )
									ret := -0.396226
								if( ema2 > 40.4707 )
									ret := 0.048611
						if( smoothD_d > 60.2585 )
							if( ema1 <= 20.9599 )
								if( ema3 <= 20.8691 )
									ret := 0.700000 // buy
								if( ema3 > 20.8691 )
									ret := 1.000000 // buy
							if( ema1 > 20.9599 )
								if( ema3 <= 23.9209 )
									ret := -0.055541
								if( ema3 > 23.9209 )
									ret := 0.041799
			if( ema13 > 0.057529 )
				if( ema1 <= 28.5053 )
					if( k <= 90.3106 )
						if( rsi1 <= 56.7251 )
							if( d <= 64.4249 )
								if( ema13 <= 0.136227 )
									ret := -0.090370
								if( ema13 > 0.136227 )
									ret := 0.428571
							if( d > 64.4249 )
								if( smoothD_d <= 71.6974 )
									ret := 0.504587
								if( smoothD_d > 71.6974 )
									ret := 0.035971
						if( rsi1 > 56.7251 )
							if( tema <= 23.0036 )
								if( smoothK_k <= 83.194 )
									ret := -0.006821
								if( smoothK_k > 83.194 )
									ret := 0.470588
							if( tema > 23.0036 )
								if( ema3 <= 27.622 )
									ret := -0.138662
								if( ema3 > 27.622 )
									ret := -0.318565
					if( k > 90.3106 )
						if( ema12 <= 0.0706 )
							if( smoothD_d <= 87.6211 )
								if( k <= 99.9969 )
									ret := -0.489971
								if( k > 99.9969 )
									ret := 0.100000
							if( smoothD_d > 87.6211 )
								if( ema3 <= 26.1631 )
									ret := 0.006961
								if( ema3 > 26.1631 )
									ret := -0.281818
						if( ema12 > 0.0706 )
							if( d_k <= -1.82589 )
								if( ema3 <= 25.1054 )
									ret := 0.130137
								if( ema3 > 25.1054 )
									ret := -0.339286
							if( d_k > -1.82589 )
								if( ema3 <= 22.3641 )
									ret := 0.128205
								if( ema3 > 22.3641 )
									ret := -0.528846
				if( ema1 > 28.5053 )
					if( smoothD_d <= 95.0359 )
						if( rsi1 <= 71.63 )
							if( ema13 <= 0.158364 )
								if( d <= 91.581 )
									ret := -0.075157
								if( d > 91.581 )
									ret := 0.147712
							if( ema13 > 0.158364 )
								if( tema <= 30.7292 )
									ret := 0.560748
								if( tema > 30.7292 )
									ret := 0.067759
						if( rsi1 > 71.63 )
							if( k <= 97.4598 )
								if( ema3 <= 41.053 )
									ret := -0.334158
								if( ema3 > 41.053 )
									ret := 0.052209
							if( k > 97.4598 )
								if( tema <= 34.2306 )
									ret := 0.758065 // buy
								if( tema > 34.2306 )
									ret := -0.003846
					if( smoothD_d > 95.0359 )
						if( ema12 <= 0.091968 )
							if( ema2 <= 37.4492 )
								if( rsi1 <= 67.0265 )
									ret := -0.266667
								if( rsi1 > 67.0265 )
									ret := 0.252632
							if( ema2 > 37.4492 )
								if( ema13 <= 0.063047 )
									ret := -0.333333
								if( ema13 > 0.063047 )
									ret := 0.640000
						if( ema12 > 0.091968 )
							if( smoothK_k <= 96.7879 )
								if( ema2 <= 36.8859 )
									ret := -0.775000 // sell
								if( ema2 > 36.8859 )
									ret := -0.300000
							if( smoothK_k > 96.7879 )
								if( ema3 <= 31.0299 )
									ret := 0.888889 // buy
								if( ema3 > 31.0299 )
									ret := 0.155556
		if( ema12 > 0.114 )
			if( ema3 <= 37.592 )
				if( smoothK_k <= 91.7144 )
					if( ema2 <= 30.6282 )
						if( ema12 <= 0.198104 )
							if( ema3 <= 23.3834 )
								if( d_k <= -14.7176 )
									ret := -0.923077 // sell
								if( d_k > -14.7176 )
									ret := 0.678571
							if( ema3 > 23.3834 )
								if( ema13 <= 0.233177 )
									ret := -0.254144
								if( ema13 > 0.233177 )
									ret := 0.173554
						if( ema12 > 0.198104 )
							if( ema1 <= 27.9132 )
								if( rsi1 <= 70.9182 )
									ret := 0.532468
								if( rsi1 > 70.9182 )
									ret := -0.396226
							if( ema1 > 27.9132 )
								if( rsi1 <= 68.602 )
									ret := 0.954545 // buy
								if( rsi1 > 68.602 )
									ret := -0.797872 // sell
					if( ema2 > 30.6282 )
						if( k <= 88.1879 )
							if( smoothD_d <= 57.4158 )
								if( d <= 24.7118 )
									ret := 0.091743
								if( d > 24.7118 )
									ret := 0.589831
							if( smoothD_d > 57.4158 )
								if( ema1 <= 33.1586 )
									ret := 0.857143 // buy
								if( ema1 > 33.1586 )
									ret := 0.203488
						if( k > 88.1879 )
							if( rsi1 <= 82.6371 )
								if( ema12 <= 0.142688 )
									ret := 0.839080 // buy
								if( ema12 > 0.142688 )
									ret := 0.578947
							if( rsi1 > 82.6371 )
								if( ema3 <= 33.7107 )
									ret := 0.666667
								if( ema3 > 33.7107 )
									ret := -0.473684
				if( smoothK_k > 91.7144 )
					if( tema <= 25.6174 )
						if( rsi1 <= 84.8851 )
							if( tema <= 24.4944 )
								if( ema13 <= 0.216327 )
									ret := -0.190476
								if( ema13 > 0.216327 )
									ret := 0.740000 // buy
							if( tema > 24.4944 )
								if( ema1 <= 24.5117 )
									ret := 1.000000 // buy
								if( ema1 > 24.5117 )
									ret := 0.583333
						if( rsi1 > 84.8851 )
							if( ema2 <= 24.5597 )
								if( ema13 <= 0.328991 )
									ret := -0.320000
								if( ema13 > 0.328991 )
									ret := -0.838710 // sell
							if( ema2 > 24.5597 )
								if( d_k <= -0.010563 )
									ret := 0.892857 // buy
								if( d_k > -0.010563 )
									ret := 0.375000
					if( tema > 25.6174 )
						if( k <= 98.7887 )
							if( smoothD_d <= 80.5132 )
								if( ema1 <= 31.5292 )
									ret := -0.812500 // sell
								if( ema1 > 31.5292 )
									ret := -1.000000 // sell
							if( smoothD_d > 80.5132 )
								if( d_k <= 2.1365 )
									ret := 0.122378
								if( d_k > 2.1365 )
									ret := -0.736842 // sell
						if( k > 98.7887 )
							if( d <= 97.3992 )
								if( smoothD_d <= 91.2145 )
									ret := -0.459016
								if( smoothD_d > 91.2145 )
									ret := 0.480000
							if( d > 97.3992 )
								if( ema13 <= 0.352426 )
									ret := -0.215054
								if( ema13 > 0.352426 )
									ret := -0.936842 // sell
			if( ema3 > 37.592 )
				if( ema3 <= 48.106 )
					if( smoothK_k <= 83.8864 )
						if( d <= 80.8086 )
							if( tema <= 39.252 )
								if( ema12 <= 0.190354 )
									ret := -0.583333
								if( ema12 > 0.190354 )
									ret := 0.130435
							if( tema > 39.252 )
								if( ema2 <= 39.1296 )
									ret := 0.633333
								if( ema2 > 39.1296 )
									ret := -0.138748
						if( d > 80.8086 )
							if( ema12 <= 0.241858 )
								if( smoothK_k <= 78.0043 )
									ret := 0.024390
								if( smoothK_k > 78.0043 )
									ret := 0.510791
							if( ema12 > 0.241858 )
								ret := -0.666667
					if( smoothK_k > 83.8864 )
						if( ema13 <= 0.295143 )
							if( d <= 79.3631 )
								if( k <= 91.4534 )
									ret := -1.000000 // sell
								if( k > 91.4534 )
									ret := -0.647059
							if( d > 79.3631 )
								if( d_k <= -2.61524 )
									ret := 0.260355
								if( d_k > -2.61524 )
									ret := -0.164045
						if( ema13 > 0.295143 )
							if( smoothD_d <= 93.616 )
								if( tema <= 38.9041 )
									ret := -0.200000
								if( tema > 38.9041 )
									ret := -0.734694 // sell
							if( smoothD_d > 93.616 )
								if( ema3 <= 38.2874 )
									ret := -0.884615 // sell
								if( ema3 > 38.2874 )
									ret := 0.000000
				if( ema3 > 48.106 )
					if( ema3 <= 54.5052 )
						if( rsi1 <= 69.5003 )
							if( ema12 <= 0.199502 )
								if( k <= 44.1541 )
									ret := 1.000000 // buy
								if( k > 44.1541 )
									ret := 0.250000
							if( ema12 > 0.199502 )
								if( rsi1 <= 65.3397 )
									ret := 0.058824
								if( rsi1 > 65.3397 )
									ret := -0.700000 // sell
						if( rsi1 > 69.5003 )
							if( rsi1 <= 84.267 )
								if( k <= 61.4684 )
									ret := 1.000000 // buy
								if( k > 61.4684 )
									ret := 0.775000 // buy
							if( rsi1 > 84.267 )
								ret := -0.500000
					if( ema3 > 54.5052 )
						if( ema12 <= 0.181795 )
							if( d <= 23.8035 )
								ret := -0.812500 // sell
							if( d > 23.8035 )
								ret := -0.416667
						if( ema12 > 0.181795 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_UPST_1Min_a63da44b(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


