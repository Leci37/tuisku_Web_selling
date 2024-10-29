//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: LYFT_1Min_2MT0_97bb4d9f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2MT0_97bb4d9f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_97bb4d9f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 81.2972 )
		if( Positive_Money_Flow <= 29.2618 )
			if( Raw_Money_Flow <= 21140.8 )
				if( ema12 <= -0.004303 )
					if( ema3 <= 12.3355 )
						if( Positive_Money_Flow_Sum <= 46599.1 )
							if( ema2 <= 11.4277 )
								if( ema1 <= 11.2857 )
									ret := 0.792208 // buy
								if( ema1 > 11.2857 )
									ret := 0.425926
							if( ema2 > 11.4277 )
								if( Typical_Price <= 12.0802 )
									ret := 0.954955 // buy
								if( Typical_Price > 12.0802 )
									ret := 0.764706 // buy
						if( Positive_Money_Flow_Sum > 46599.1 )
							if( Positive_Money_Flow_Sum <= 59053.1 )
								if( Negative_Money_Flow <= 5706.55 )
									ret := -0.386364
								if( Negative_Money_Flow > 5706.55 )
									ret := 0.846154 // buy
							if( Positive_Money_Flow_Sum > 59053.1 )
								if( ema3 <= 10.314 )
									ret := 0.181818
								if( ema3 > 10.314 )
									ret := 0.560284
					if( ema3 > 12.3355 )
						if( ema3 <= 12.4204 )
							if( ema13 <= -0.014408 )
								if( Positive_Money_Flow_Sum <= 82602.4 )
									ret := 0.692308
								if( Positive_Money_Flow_Sum > 82602.4 )
									ret := 0.444444
							if( ema13 > -0.014408 )
								if( Typical_Price <= 12.3547 )
									ret := -0.115385
								if( Typical_Price > 12.3547 )
									ret := -0.615385
						if( ema3 > 12.4204 )
							if( Negative_Money_Flow_Sum <= 136837 )
								if( Money_Flow_Ratio <= 2.0131 )
									ret := 0.676413
								if( Money_Flow_Ratio > 2.0131 )
									ret := 0.019608
							if( Negative_Money_Flow_Sum > 136837 )
								if( Money_Flow_Ratio <= 0.16731 )
									ret := 0.627329
								if( Money_Flow_Ratio > 0.16731 )
									ret := 0.196881
				if( ema12 > -0.004303 )
					if( MFI_Low <= -14.577 )
						if( ema13 <= -0.005296 )
							ret := 0.416667
						if( ema13 > -0.005296 )
							if( ema1 <= 12.2328 )
								if( Raw_Money_Flow <= 4820.75 )
									ret := -0.052632
								if( Raw_Money_Flow > 4820.75 )
									ret := 0.100000
							if( ema1 > 12.2328 )
								if( MFI <= 1.06192 )
									ret := -0.680000
								if( MFI > 1.06192 )
									ret := -0.295455
					if( MFI_Low > -14.577 )
						if( Negative_Money_Flow <= 1464.99 )
							if( Money_Flow_Ratio <= 0.35125 )
								if( Money_Flow_Ratio <= 0.083815 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 0.083815 )
									ret := 0.278689
							if( Money_Flow_Ratio > 0.35125 )
								if( tema <= 14.6572 )
									ret := -0.037129
								if( tema > 14.6572 )
									ret := 0.156716
						if( Negative_Money_Flow > 1464.99 )
							if( ema13 <= -0.009325 )
								if( ema12 <= -0.003278 )
									ret := -0.173913
								if( ema12 > -0.003278 )
									ret := -0.742857 // sell
							if( ema13 > -0.009325 )
								if( Positive_Money_Flow_Sum <= 29238.3 )
									ret := 0.099071
								if( Positive_Money_Flow_Sum > 29238.3 )
									ret := 0.334495
			if( Raw_Money_Flow > 21140.8 )
				if( Negative_Money_Flow <= 1.14622e+06 )
					if( Positive_Money_Flow_Sum <= 356731 )
						if( Negative_Money_Flow_Sum <= 41352.2 )
							if( ema1 <= 13.4339 )
								ret := 0.571429
							if( ema1 > 13.4339 )
								if( ema12 <= 0.008878 )
									ret := -0.588235
								if( ema12 > 0.008878 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 41352.2 )
							if( ema13 <= -0.295334 )
								ret := -0.857143 // sell
							if( ema13 > -0.295334 )
								if( Positive_Money_Flow_Sum <= 65836.7 )
									ret := 0.299287
								if( Positive_Money_Flow_Sum > 65836.7 )
									ret := 0.141268
					if( Positive_Money_Flow_Sum > 356731 )
						if( ema2 <= 17.2583 )
							if( ema3 <= 11.2514 )
								if( Positive_Money_Flow_Sum <= 4.90923e+06 )
									ret := 0.074413
								if( Positive_Money_Flow_Sum > 4.90923e+06 )
									ret := 0.400602
							if( ema3 > 11.2514 )
								if( ema13 <= 0.046573 )
									ret := 0.008813
								if( ema13 > 0.046573 )
									ret := -0.184506
						if( ema2 > 17.2583 )
							if( Negative_Money_Flow <= 894941 )
								if( ema1 <= 17.3067 )
									ret := -0.495327
								if( ema1 > 17.3067 )
									ret := -0.132379
							if( Negative_Money_Flow > 894941 )
								if( ema1 <= 17.4257 )
									ret := -0.411765
								if( ema1 > 17.4257 )
									ret := -0.780488 // sell
				if( Negative_Money_Flow > 1.14622e+06 )
					if( Positive_Money_Flow_Sum <= 829484 )
						if( ema13 <= -0.040893 )
							if( Raw_Money_Flow <= 1.86492e+06 )
								if( ema3 <= 15.5844 )
									ret := 0.750000 // buy
								if( ema3 > 15.5844 )
									ret := 0.000000
							if( Raw_Money_Flow > 1.86492e+06 )
								if( Negative_Money_Flow_Sum <= 8.60842e+06 )
									ret := -0.444444
								if( Negative_Money_Flow_Sum > 8.60842e+06 )
									ret := 0.333333
						if( ema13 > -0.040893 )
							if( tema <= 12.3013 )
								if( ema2 <= 11.6971 )
									ret := -0.578947
								if( ema2 > 11.6971 )
									ret := -1.000000 // sell
							if( tema > 12.3013 )
								if( Negative_Money_Flow <= 1.45632e+06 )
									ret := 0.473684
								if( Negative_Money_Flow > 1.45632e+06 )
									ret := -0.560000
					if( Positive_Money_Flow_Sum > 829484 )
						if( Negative_Money_Flow <= 1.87845e+06 )
							if( ema12 <= 0.068822 )
								if( Negative_Money_Flow_Sum <= 2.11241e+07 )
									ret := 0.317982
								if( Negative_Money_Flow_Sum > 2.11241e+07 )
									ret := -0.525000
							if( ema12 > 0.068822 )
								if( Raw_Money_Flow <= 1.51218e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.51218e+06 )
									ret := 0.100000
						if( Negative_Money_Flow > 1.87845e+06 )
							if( tema <= 11.4791 )
								if( MFI_Low <= 7.50469 )
									ret := 0.195122
								if( MFI_Low > 7.50469 )
									ret := 0.791667 // buy
							if( tema > 11.4791 )
								if( MFI <= 57.7959 )
									ret := 0.089409
								if( MFI > 57.7959 )
									ret := -0.357616
		if( Positive_Money_Flow > 29.2618 )
			if( ema12 <= 0.002469 )
				if( Typical_Price <= 15.8324 )
					if( Positive_Money_Flow_Sum <= 1.23264e+07 )
						if( Money_Flow_Ratio <= 3.35971 )
							if( ema2 <= 12.0006 )
								if( MFI_Low <= 1.58354 )
									ret := -0.192246
								if( MFI_Low > 1.58354 )
									ret := 0.001255
							if( ema2 > 12.0006 )
								if( MFI_Low <= 55.3477 )
									ret := 0.036003
								if( MFI_Low > 55.3477 )
									ret := -0.378049
						if( Money_Flow_Ratio > 3.35971 )
							if( Raw_Money_Flow <= 12069.8 )
								if( ema12 <= 0.001631 )
									ret := 0.824324 // buy
								if( ema12 > 0.001631 )
									ret := 0.111111
							if( Raw_Money_Flow > 12069.8 )
								if( ema2 <= 12.5797 )
									ret := -0.159091
								if( ema2 > 12.5797 )
									ret := 0.368421
					if( Positive_Money_Flow_Sum > 1.23264e+07 )
						if( ema13 <= -0.109172 )
							if( MFI <= 37.019 )
								ret := 1.000000 // buy
							if( MFI > 37.019 )
								ret := 0.583333
						if( ema13 > -0.109172 )
							if( tema <= 11.4197 )
								if( MFI <= 64.982 )
									ret := 0.365385
								if( MFI > 64.982 )
									ret := -0.631579
							if( tema > 11.4197 )
								if( Positive_Money_Flow_Sum <= 3.19037e+07 )
									ret := -0.549550
								if( Positive_Money_Flow_Sum > 3.19037e+07 )
									ret := -0.088235
				if( Typical_Price > 15.8324 )
					if( tema <= 15.837 )
						if( Positive_Money_Flow_Sum <= 1.40835e+06 )
							ret := -0.222222
						if( Positive_Money_Flow_Sum > 1.40835e+06 )
							if( Money_Flow_Ratio <= 0.669287 )
								ret := -0.750000 // sell
							if( Money_Flow_Ratio > 0.669287 )
								ret := -0.904762 // sell
					if( tema > 15.837 )
						if( ema13 <= -0.187767 )
							if( Negative_Money_Flow_Sum <= 1.36874e+07 )
								if( tema <= 16.8687 )
									ret := 0.933333 // buy
								if( tema > 16.8687 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 1.36874e+07 )
								ret := -0.888889 // sell
						if( ema13 > -0.187767 )
							if( Raw_Money_Flow <= 4.28e+06 )
								if( MFI <= 60.8624 )
									ret := -0.125455
								if( MFI > 60.8624 )
									ret := 0.051613
							if( Raw_Money_Flow > 4.28e+06 )
								ret := 0.833333 // buy
			if( ema12 > 0.002469 )
				if( Raw_Money_Flow <= 27532 )
					if( Positive_Money_Flow <= 9916.43 )
						if( MFI_Low <= 55.1975 )
							if( Positive_Money_Flow_Sum <= 29835.6 )
								if( ema1 <= 14.404 )
									ret := -0.797521 // sell
								if( ema1 > 14.404 )
									ret := -0.200000
							if( Positive_Money_Flow_Sum > 29835.6 )
								if( ema12 <= 0.00751 )
									ret := -0.317195
								if( ema12 > 0.00751 )
									ret := -0.558725
						if( MFI_Low > 55.1975 )
							if( Positive_Money_Flow_Sum <= 105865 )
								if( tema <= 11.6537 )
									ret := -0.647059
								if( tema > 11.6537 )
									ret := -0.964286 // sell
							if( Positive_Money_Flow_Sum > 105865 )
								if( Raw_Money_Flow <= 8708.61 )
									ret := -0.181102
								if( Raw_Money_Flow > 8708.61 )
									ret := 0.483871
					if( Positive_Money_Flow > 9916.43 )
						if( ema12 <= 0.014681 )
							if( MFI <= 75.4901 )
								if( Positive_Money_Flow_Sum <= 4.19996e+06 )
									ret := -0.281818
								if( Positive_Money_Flow_Sum > 4.19996e+06 )
									ret := 0.384615
							if( MFI > 75.4901 )
								if( MFI_Low <= 56.3262 )
									ret := 0.923077 // buy
								if( MFI_Low > 56.3262 )
									ret := 0.212766
						if( ema12 > 0.014681 )
							if( ema1 <= 10.8541 )
								if( MFI_Low <= 32.3579 )
									ret := -0.153846
								if( MFI_Low > 32.3579 )
									ret := 0.615385
							if( ema1 > 10.8541 )
								if( Positive_Money_Flow <= 10408.6 )
									ret := 0.000000
								if( Positive_Money_Flow > 10408.6 )
									ret := -0.668810
				if( Raw_Money_Flow > 27532 )
					if( ema3 <= 11.5495 )
						if( Positive_Money_Flow_Sum <= 1.23216e+07 )
							if( MFI_Low <= 39.2239 )
								if( Negative_Money_Flow_Sum <= 2.48942e+06 )
									ret := -0.144082
								if( Negative_Money_Flow_Sum > 2.48942e+06 )
									ret := 0.142857
							if( MFI_Low > 39.2239 )
								if( Positive_Money_Flow <= 3.18461e+06 )
									ret := 0.198520
								if( Positive_Money_Flow > 3.18461e+06 )
									ret := -0.666667
						if( Positive_Money_Flow_Sum > 1.23216e+07 )
							if( MFI <= 64.1261 )
								if( MFI_Low <= 27.441 )
									ret := -0.565217
								if( MFI_Low > 27.441 )
									ret := 0.485714
							if( MFI > 64.1261 )
								if( ema12 <= 0.018216 )
									ret := -0.484848
								if( ema12 > 0.018216 )
									ret := -1.000000 // sell
					if( ema3 > 11.5495 )
						if( MFI_High <= -28.1472 )
							if( MFI <= 33.5033 )
								if( Positive_Money_Flow <= 462241 )
									ret := -0.307116
								if( Positive_Money_Flow > 462241 )
									ret := -0.930233 // sell
							if( MFI > 33.5033 )
								if( Negative_Money_Flow <= 32824.6 )
									ret := -0.131758
								if( Negative_Money_Flow > 32824.6 )
									ret := -0.789474 // sell
						if( MFI_High > -28.1472 )
							if( MFI_Low <= 47.1409 )
								if( ema13 <= 0.021614 )
									ret := -0.029812
								if( ema13 > 0.021614 )
									ret := 0.071942
							if( MFI_Low > 47.1409 )
								if( ema12 <= 0.007106 )
									ret := 0.106684
								if( ema12 > 0.007106 )
									ret := -0.127291
	if( MFI > 81.2972 )
		if( ema13 <= 0.017188 )
			if( Negative_Money_Flow <= 1599.85 )
				if( ema13 <= -0.023432 )
					if( tema <= 13.7962 )
						if( MFI_Low <= 62.8492 )
							ret := 0.000000
						if( MFI_Low > 62.8492 )
							if( Negative_Money_Flow_Sum <= 131895 )
								ret := -0.133333
							if( Negative_Money_Flow_Sum > 131895 )
								if( ema2 <= 11.5178 )
									ret := -0.909091 // sell
								if( ema2 > 11.5178 )
									ret := -1.000000 // sell
					if( tema > 13.7962 )
						ret := 0.176471
				if( ema13 > -0.023432 )
					if( Negative_Money_Flow_Sum <= 39021 )
						if( ema2 <= 14.0883 )
							if( MFI <= 83.2751 )
								if( MFI_Low <= 62.8596 )
									ret := -0.200000
								if( MFI_Low > 62.8596 )
									ret := -0.764706 // sell
							if( MFI > 83.2751 )
								if( Raw_Money_Flow <= 1315.79 )
									ret := -0.391304
								if( Raw_Money_Flow > 1315.79 )
									ret := 0.117647
						if( ema2 > 14.0883 )
							if( ema12 <= -0.003882 )
								ret := 0.920000 // buy
							if( ema12 > -0.003882 )
								if( ema1 <= 15.29 )
									ret := 0.142857
								if( ema1 > 15.29 )
									ret := 0.606557
					if( Negative_Money_Flow_Sum > 39021 )
						if( MFI_High <= 15.5363 )
							if( Positive_Money_Flow <= 32417.7 )
								if( ema3 <= 16.1892 )
									ret := -0.484581
								if( ema3 > 16.1892 )
									ret := 0.190476
							if( Positive_Money_Flow > 32417.7 )
								if( MFI_High <= 14.6453 )
									ret := -0.019646
								if( MFI_High > 14.6453 )
									ret := -1.000000 // sell
						if( MFI_High > 15.5363 )
							if( ema13 <= -0.002799 )
								if( ema12 <= -0.006613 )
									ret := 0.040000
								if( ema12 > -0.006613 )
									ret := 0.705882 // buy
							if( ema13 > -0.002799 )
								if( MFI <= 96.2597 )
									ret := -0.500000
								if( MFI > 96.2597 )
									ret := 0.030303
			if( Negative_Money_Flow > 1599.85 )
				if( Negative_Money_Flow <= 152467 )
					if( MFI_Low <= 67.8282 )
						if( MFI <= 84.3502 )
							if( ema1 <= 12.5739 )
								if( Positive_Money_Flow_Sum <= 1.26572e+06 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 1.26572e+06 )
									ret := -0.111111
							if( ema1 > 12.5739 )
								if( MFI_High <= 2.3693 )
									ret := 0.862069 // buy
								if( MFI_High > 2.3693 )
									ret := 0.459459
						if( MFI > 84.3502 )
							if( ema3 <= 13.4569 )
								if( Negative_Money_Flow <= 4884.34 )
									ret := -0.484848
								if( Negative_Money_Flow > 4884.34 )
									ret := 0.357143
							if( ema3 > 13.4569 )
								if( MFI <= 85.269 )
									ret := 0.166667
								if( MFI > 85.269 )
									ret := -0.606061
					if( MFI_Low > 67.8282 )
						if( MFI_Low <= 68.3925 )
							if( MFI_High <= 8.01888 )
								ret := 1.000000 // buy
							if( MFI_High > 8.01888 )
								if( Negative_Money_Flow_Sum <= 73457.4 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 73457.4 )
									ret := 0.714286 // buy
						if( MFI_Low > 68.3925 )
							if( Positive_Money_Flow_Sum <= 1.5311e+07 )
								if( Negative_Money_Flow_Sum <= 184671 )
									ret := 0.390244
								if( Negative_Money_Flow_Sum > 184671 )
									ret := -0.096774
							if( Positive_Money_Flow_Sum > 1.5311e+07 )
								if( tema <= 13.4244 )
									ret := 0.894737 // buy
								if( tema > 13.4244 )
									ret := 0.187500
				if( Negative_Money_Flow > 152467 )
					if( Negative_Money_Flow <= 183139 )
						ret := -0.888889 // sell
					if( Negative_Money_Flow > 183139 )
						if( ema13 <= -0.001578 )
							ret := -0.375000
						if( ema13 > -0.001578 )
							if( Raw_Money_Flow <= 255397 )
								ret := -0.076923
							if( Raw_Money_Flow > 255397 )
								if( ema12 <= 0.002571 )
									ret := 0.500000
								if( ema12 > 0.002571 )
									ret := 0.090909
		if( ema13 > 0.017188 )
			if( Raw_Money_Flow <= 1.84603e+06 )
				if( Typical_Price <= 16.8541 )
					if( Raw_Money_Flow <= 1.23304e+06 )
						if( Positive_Money_Flow <= 479.495 )
							if( Positive_Money_Flow_Sum <= 2.06819e+06 )
								if( ema12 <= 0.051713 )
									ret := 0.123675
								if( ema12 > 0.051713 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 2.06819e+06 )
								if( ema12 <= 0.022033 )
									ret := -0.349835
								if( ema12 > 0.022033 )
									ret := -0.096667
						if( Positive_Money_Flow > 479.495 )
							if( Raw_Money_Flow <= 6850 )
								if( Negative_Money_Flow <= 2727.31 )
									ret := -0.658228
								if( Negative_Money_Flow > 2727.31 )
									ret := 0.400000
							if( Raw_Money_Flow > 6850 )
								if( ema3 <= 16.0208 )
									ret := -0.279185
								if( ema3 > 16.0208 )
									ret := -0.054726
					if( Raw_Money_Flow > 1.23304e+06 )
						if( ema12 <= 0.042214 )
							if( Typical_Price <= 12.7708 )
								if( Negative_Money_Flow_Sum <= 184103 )
									ret := -0.636364
								if( Negative_Money_Flow_Sum > 184103 )
									ret := 0.802632 // buy
							if( Typical_Price > 12.7708 )
								if( Negative_Money_Flow_Sum <= 1.23867e+06 )
									ret := -0.322581
								if( Negative_Money_Flow_Sum > 1.23867e+06 )
									ret := 0.500000
						if( ema12 > 0.042214 )
							if( MFI_High <= 4.85572 )
								ret := -0.833333 // sell
							if( MFI_High > 4.85572 )
								if( Positive_Money_Flow_Sum <= 9.90929e+06 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 9.90929e+06 )
									ret := 0.307692
				if( Typical_Price > 16.8541 )
					if( Money_Flow_Ratio <= 4.63979 )
						if( Positive_Money_Flow <= 873598 )
							if( MFI <= 81.6617 )
								ret := -0.294118
							if( MFI > 81.6617 )
								ret := -0.666667
						if( Positive_Money_Flow > 873598 )
							ret := 0.777778 // buy
					if( Money_Flow_Ratio > 4.63979 )
						if( Positive_Money_Flow <= 6462.27 )
							if( MFI_High <= 4.13322 )
								if( Raw_Money_Flow <= 229008 )
									ret := -0.625000
								if( Raw_Money_Flow > 229008 )
									ret := -1.000000 // sell
							if( MFI_High > 4.13322 )
								if( Typical_Price <= 17.73 )
									ret := -0.033333
								if( Typical_Price > 17.73 )
									ret := -0.800000 // sell
						if( Positive_Money_Flow > 6462.27 )
							if( Positive_Money_Flow_Sum <= 6.33659e+06 )
								if( Negative_Money_Flow_Sum <= 315195 )
									ret := -0.777778 // sell
								if( Negative_Money_Flow_Sum > 315195 )
									ret := -0.259259
							if( Positive_Money_Flow_Sum > 6.33659e+06 )
								if( ema12 <= 0.048793 )
									ret := -0.909091 // sell
								if( ema12 > 0.048793 )
									ret := -1.000000 // sell
			if( Raw_Money_Flow > 1.84603e+06 )
				if( tema <= 14.3794 )
					if( Positive_Money_Flow <= 2.37557e+06 )
						if( ema1 <= 13.1648 )
							if( ema3 <= 12.0411 )
								ret := -0.571429
							if( ema3 > 12.0411 )
								ret := 0.125000
						if( ema1 > 13.1648 )
							ret := -0.764706 // sell
					if( Positive_Money_Flow > 2.37557e+06 )
						if( MFI <= 89.4853 )
							if( ema2 <= 13.3743 )
								ret := -1.000000 // sell
							if( ema2 > 13.3743 )
								ret := -0.923077 // sell
						if( MFI > 89.4853 )
							if( MFI <= 93.4123 )
								if( Negative_Money_Flow_Sum <= 759963 )
									ret := -0.727273 // sell
								if( Negative_Money_Flow_Sum > 759963 )
									ret := 0.157895
							if( MFI > 93.4123 )
								if( Typical_Price <= 13.2083 )
									ret := -0.696970
								if( Typical_Price > 13.2083 )
									ret := -1.000000 // sell
				if( tema > 14.3794 )
					if( Money_Flow_Ratio <= 6.53738 )
						if( ema12 <= 0.122646 )
							ret := -0.500000
						if( ema12 > 0.122646 )
							ret := 0.888889 // buy
					if( Money_Flow_Ratio > 6.53738 )
						if( ema13 <= 0.115118 )
							if( Positive_Money_Flow_Sum <= 8.84842e+06 )
								if( tema <= 16.3731 )
									ret := -0.928571 // sell
								if( tema > 16.3731 )
									ret := -0.692308
							if( Positive_Money_Flow_Sum > 8.84842e+06 )
								if( MFI <= 90.1999 )
									ret := -0.352941
								if( MFI > 90.1999 )
									ret := 0.842105 // buy
						if( ema13 > 0.115118 )
							if( tema <= 15.7169 )
								ret := -0.846154 // sell
							if( tema > 15.7169 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_LYFT_1Min_97bb4d9f(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, ema12, ema3, ema13, tema, ema1, ema2)

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


