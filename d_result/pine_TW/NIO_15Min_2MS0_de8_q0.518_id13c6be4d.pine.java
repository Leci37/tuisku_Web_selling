//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: NIO_15Min_2MS0_13c6be4d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_15Min_2MS0_13c6be4d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_15Min_13c6be4d(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 3.60612e+06 )
		if( d <= 39.5612 )
			if( Raw_Money_Flow <= 28666.5 )
				if( Negative_Money_Flow_Sum <= 2.0148e+06 )
					if( Positive_Money_Flow <= 4.26006 )
						if( Positive_Money_Flow_Sum <= 105824 )
							if( Positive_Money_Flow_Sum <= 14473.5 )
								if( MFI_High <= -56.6556 )
									ret := 0.062500
								if( MFI_High > -56.6556 )
									ret := -0.384615
							if( Positive_Money_Flow_Sum > 14473.5 )
								if( Typical_Price <= 3.01084 )
									ret := 0.756345 // buy
								if( Typical_Price > 3.01084 )
									ret := 0.337662
						if( Positive_Money_Flow_Sum > 105824 )
							if( rsi1 <= 54.6921 )
								if( Negative_Money_Flow <= 224.718 )
									ret := 0.000000
								if( Negative_Money_Flow > 224.718 )
									ret := 0.334873
							if( rsi1 > 54.6921 )
								if( MFI_Low <= 73.8695 )
									ret := -0.215909
								if( MFI_Low > 73.8695 )
									ret := 0.416667
					if( Positive_Money_Flow > 4.26006 )
						if( Positive_Money_Flow <= 951.761 )
							if( Raw_Money_Flow <= 1216.07 )
								if( Negative_Money_Flow_Sum <= 115814 )
									ret := -0.974359 // sell
								if( Negative_Money_Flow_Sum > 115814 )
									ret := -0.148148
							if( Raw_Money_Flow > 1216.07 )
								if( Positive_Money_Flow <= 255.84 )
									ret := -0.680000
								if( Positive_Money_Flow > 255.84 )
									ret := 0.192308
						if( Positive_Money_Flow > 951.761 )
							if( Typical_Price <= 6.34664 )
								if( Negative_Money_Flow_Sum <= 208726 )
									ret := 0.237082
								if( Negative_Money_Flow_Sum > 208726 )
									ret := -0.182073
							if( Typical_Price > 6.34664 )
								if( Negative_Money_Flow_Sum <= 168217 )
									ret := 0.680851
								if( Negative_Money_Flow_Sum > 168217 )
									ret := 0.129808
				if( Negative_Money_Flow_Sum > 2.0148e+06 )
					if( d <= 32.7439 )
						if( d <= 29.0894 )
							if( Typical_Price <= 8.60768 )
								if( Raw_Money_Flow <= 10802.7 )
									ret := 0.694444
								if( Raw_Money_Flow > 10802.7 )
									ret := 0.176471
							if( Typical_Price > 8.60768 )
								ret := -0.333333
						if( d > 29.0894 )
							ret := -0.272727
					if( d > 32.7439 )
						if( Positive_Money_Flow <= 11656.1 )
							if( smoothK_k <= 22.1342 )
								ret := 1.000000 // buy
							if( smoothK_k > 22.1342 )
								ret := 0.900000 // buy
						if( Positive_Money_Flow > 11656.1 )
							ret := 0.812500 // buy
			if( Raw_Money_Flow > 28666.5 )
				if( Money_Flow_Ratio <= 0.241703 )
					if( Raw_Money_Flow <= 306459 )
						if( MFI_Low <= -2.49384 )
							if( Typical_Price <= 2.31 )
								if( d <= 17.7378 )
									ret := -0.333333
								if( d > 17.7378 )
									ret := 0.900000 // buy
							if( Typical_Price > 2.31 )
								if( Positive_Money_Flow_Sum <= 168730 )
									ret := -0.278607
								if( Positive_Money_Flow_Sum > 168730 )
									ret := -0.542222
						if( MFI_Low > -2.49384 )
							if( rsi1 <= 21.6799 )
								if( Typical_Price <= 4.0252 )
									ret := -0.740741 // sell
								if( Typical_Price > 4.0252 )
									ret := -0.090909
							if( rsi1 > 21.6799 )
								if( d_k <= 1.4267 )
									ret := -0.138889
								if( d_k > 1.4267 )
									ret := 0.606061
					if( Raw_Money_Flow > 306459 )
						if( smoothD_d <= 3.44184 )
							if( Negative_Money_Flow_Sum <= 1.56248e+06 )
								ret := -0.555556
							if( Negative_Money_Flow_Sum > 1.56248e+06 )
								if( smoothD_d <= 1.09176 )
									ret := 0.411765
								if( smoothD_d > 1.09176 )
									ret := 0.744186 // buy
						if( smoothD_d > 3.44184 )
							if( smoothK_k <= 16.5703 )
								if( Money_Flow_Ratio <= 0.043715 )
									ret := 0.133333
								if( Money_Flow_Ratio > 0.043715 )
									ret := -0.559322
							if( smoothK_k > 16.5703 )
								if( Negative_Money_Flow_Sum <= 2.76319e+06 )
									ret := 0.588235
								if( Negative_Money_Flow_Sum > 2.76319e+06 )
									ret := -0.111111
				if( Money_Flow_Ratio > 0.241703 )
					if( MFI <= 97.0046 )
						if( Typical_Price <= 5.92961 )
							if( Raw_Money_Flow <= 102499 )
								if( Money_Flow_Ratio <= 5.00361 )
									ret := -0.056891
								if( Money_Flow_Ratio > 5.00361 )
									ret := 0.384615
							if( Raw_Money_Flow > 102499 )
								if( Negative_Money_Flow_Sum <= 2.13675e+06 )
									ret := 0.202868
								if( Negative_Money_Flow_Sum > 2.13675e+06 )
									ret := -0.163814
						if( Typical_Price > 5.92961 )
							if( Positive_Money_Flow <= 430375 )
								if( Money_Flow_Ratio <= 0.667213 )
									ret := 0.128726
								if( Money_Flow_Ratio > 0.667213 )
									ret := -0.036713
							if( Positive_Money_Flow > 430375 )
								if( Raw_Money_Flow <= 910227 )
									ret := -0.252836
								if( Raw_Money_Flow > 910227 )
									ret := -0.061224
					if( MFI > 97.0046 )
						if( rsi1 <= 62.7822 )
							if( MFI_Low <= 77.4583 )
								if( Positive_Money_Flow <= 18152.9 )
									ret := 0.666667
								if( Positive_Money_Flow > 18152.9 )
									ret := 1.000000 // buy
							if( MFI_Low > 77.4583 )
								if( smoothD_d <= 8.94637 )
									ret := 0.090909
								if( smoothD_d > 8.94637 )
									ret := 0.666667
						if( rsi1 > 62.7822 )
							if( Positive_Money_Flow_Sum <= 3.29938e+07 )
								if( MFI <= 98.0086 )
									ret := -0.800000 // sell
								if( MFI > 98.0086 )
									ret := 0.222222
							if( Positive_Money_Flow_Sum > 3.29938e+07 )
								if( d_k <= -19.0315 )
									ret := 0.000000
								if( d_k > -19.0315 )
									ret := 0.714286 // buy
		if( d > 39.5612 )
			if( Positive_Money_Flow <= 19.121 )
				if( smoothK_k <= 74.5406 )
					if( Negative_Money_Flow_Sum <= 116102 )
						if( Positive_Money_Flow_Sum <= 57888.8 )
							if( d <= 68.0038 )
								if( rsi1 <= 57.8941 )
									ret := 0.800000 // buy
								if( rsi1 > 57.8941 )
									ret := 0.000000
							if( d > 68.0038 )
								if( MFI_High <= -20.6496 )
									ret := 0.342857
								if( MFI_High > -20.6496 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 57888.8 )
							if( Typical_Price <= 3.12913 )
								if( Negative_Money_Flow_Sum <= 71015.2 )
									ret := 0.184211
								if( Negative_Money_Flow_Sum > 71015.2 )
									ret := 0.587879
							if( Typical_Price > 3.12913 )
								if( Positive_Money_Flow_Sum <= 85357.8 )
									ret := 0.322581
								if( Positive_Money_Flow_Sum > 85357.8 )
									ret := -0.171598
					if( Negative_Money_Flow_Sum > 116102 )
						if( Positive_Money_Flow_Sum <= 3.80161e+06 )
							if( MFI <= 67.3489 )
								if( smoothK_k <= 27.6179 )
									ret := 0.204167
								if( smoothK_k > 27.6179 )
									ret := 0.000000
							if( MFI > 67.3489 )
								if( d_k <= -3.80052 )
									ret := 0.054795
								if( d_k > -3.80052 )
									ret := -0.307826
						if( Positive_Money_Flow_Sum > 3.80161e+06 )
							if( MFI_High <= -16.7266 )
								if( d <= 75.4934 )
									ret := 0.634328
								if( d > 75.4934 )
									ret := -0.321429
							if( MFI_High > -16.7266 )
								if( Negative_Money_Flow <= 936865 )
									ret := 0.150221
								if( Negative_Money_Flow > 936865 )
									ret := -0.338235
				if( smoothK_k > 74.5406 )
					if( MFI <= 7.19106 )
						ret := 0.904762 // buy
					if( MFI > 7.19106 )
						if( Negative_Money_Flow <= 1.55246e+06 )
							if( Positive_Money_Flow_Sum <= 2.68188e+06 )
								if( MFI <= 14.4009 )
									ret := -0.557692
								if( MFI > 14.4009 )
									ret := -0.139096
							if( Positive_Money_Flow_Sum > 2.68188e+06 )
								if( smoothD_d <= 92.0464 )
									ret := 0.069189
								if( smoothD_d > 92.0464 )
									ret := -0.152406
						if( Negative_Money_Flow > 1.55246e+06 )
							if( Positive_Money_Flow_Sum <= 9.23486e+06 )
								if( smoothK_k <= 83.4187 )
									ret := -0.625000
								if( smoothK_k > 83.4187 )
									ret := 0.228571
							if( Positive_Money_Flow_Sum > 9.23486e+06 )
								if( smoothD_d <= 89.505 )
									ret := -0.969697 // sell
								if( smoothD_d > 89.505 )
									ret := -0.230769
			if( Positive_Money_Flow > 19.121 )
				if( MFI <= 98.0367 )
					if( Typical_Price <= 1.97741 )
						if( Negative_Money_Flow_Sum <= 46005.3 )
							if( d <= 87.4778 )
								if( Typical_Price <= 1.50177 )
									ret := -0.272727
								if( Typical_Price > 1.50177 )
									ret := -0.920000 // sell
							if( d > 87.4778 )
								ret := -0.500000
						if( Negative_Money_Flow_Sum > 46005.3 )
							if( d <= 92.8899 )
								if( MFI_High <= 8.68991 )
									ret := -0.174129
								if( MFI_High > 8.68991 )
									ret := -0.888889 // sell
							if( d > 92.8899 )
								if( Money_Flow_Ratio <= 1.38779 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.38779 )
									ret := -0.545455
					if( Typical_Price > 1.97741 )
						if( rsi1 <= 60.0123 )
							if( Positive_Money_Flow_Sum <= 7.93167e+06 )
								if( Positive_Money_Flow <= 143080 )
									ret := -0.030987
								if( Positive_Money_Flow > 143080 )
									ret := -0.249856
							if( Positive_Money_Flow_Sum > 7.93167e+06 )
								if( MFI_Low <= 61.038 )
									ret := 0.686567
								if( MFI_Low > 61.038 )
									ret := 0.077135
						if( rsi1 > 60.0123 )
							if( Money_Flow_Ratio <= 1.14203 )
								if( Negative_Money_Flow <= 96.9465 )
									ret := -0.309313
								if( Negative_Money_Flow > 96.9465 )
									ret := -0.658537
							if( Money_Flow_Ratio > 1.14203 )
								if( Positive_Money_Flow_Sum <= 389748 )
									ret := -0.384503
								if( Positive_Money_Flow_Sum > 389748 )
									ret := -0.135069
				if( MFI > 98.0367 )
					if( Negative_Money_Flow_Sum <= 1.48668e+06 )
						if( Positive_Money_Flow_Sum <= 1.30579e+07 )
							if( Positive_Money_Flow <= 3.3433e+06 )
								if( Typical_Price <= 4.14435 )
									ret := 0.666667
								if( Typical_Price > 4.14435 )
									ret := -0.047619
							if( Positive_Money_Flow > 3.3433e+06 )
								ret := -0.533333
						if( Positive_Money_Flow_Sum > 1.30579e+07 )
							if( Positive_Money_Flow_Sum <= 3.23576e+07 )
								if( Positive_Money_Flow <= 2.27106e+06 )
									ret := -0.131148
								if( Positive_Money_Flow > 2.27106e+06 )
									ret := -0.693548
							if( Positive_Money_Flow_Sum > 3.23576e+07 )
								if( rsi1 <= 81.8725 )
									ret := 0.156069
								if( rsi1 > 81.8725 )
									ret := -0.523810
					if( Negative_Money_Flow_Sum > 1.48668e+06 )
						if( d_k <= -9.53329 )
							if( Typical_Price <= 9.43798 )
								ret := -0.916667 // sell
							if( Typical_Price > 9.43798 )
								ret := -0.043478
						if( d_k > -9.53329 )
							if( k <= 97.5994 )
								if( Money_Flow_Ratio <= 75.7666 )
									ret := 0.738095 // buy
								if( Money_Flow_Ratio > 75.7666 )
									ret := -0.129032
							if( k > 97.5994 )
								if( MFI_Low <= 79.5262 )
									ret := 0.947368 // buy
								if( MFI_Low > 79.5262 )
									ret := 0.666667
	if( Negative_Money_Flow_Sum > 3.60612e+06 )
		if( Negative_Money_Flow_Sum <= 2.55382e+09 )
			if( Negative_Money_Flow <= 1.07373e+06 )
				if( Money_Flow_Ratio <= 0.059155 )
					if( Negative_Money_Flow <= 526.046 )
						if( MFI_High <= -76.2191 )
							if( smoothK_k <= 41.8547 )
								if( d <= 31.7447 )
									ret := 0.132780
								if( d > 31.7447 )
									ret := 0.407407
							if( smoothK_k > 41.8547 )
								if( smoothD_d <= 56.5896 )
									ret := -0.259615
								if( smoothD_d > 56.5896 )
									ret := 0.097826
						if( MFI_High > -76.2191 )
							if( Money_Flow_Ratio <= 0.050148 )
								if( Raw_Money_Flow <= 464875 )
									ret := -0.074074
								if( Raw_Money_Flow > 464875 )
									ret := -0.828571 // sell
							if( Money_Flow_Ratio > 0.050148 )
								if( Raw_Money_Flow <= 1.28779e+06 )
									ret := 0.292308
								if( Raw_Money_Flow > 1.28779e+06 )
									ret := -0.571429
					if( Negative_Money_Flow > 526.046 )
						if( d <= 28.9791 )
							if( Negative_Money_Flow_Sum <= 4.5667e+06 )
								if( Negative_Money_Flow_Sum <= 4.03143e+06 )
									ret := 0.066667
								if( Negative_Money_Flow_Sum > 4.03143e+06 )
									ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 4.5667e+06 )
								if( rsi1 <= 40.6276 )
									ret := 0.508929
								if( rsi1 > 40.6276 )
									ret := 0.090909
						if( d > 28.9791 )
							if( Negative_Money_Flow_Sum <= 9.03403e+06 )
								if( Negative_Money_Flow <= 14617.3 )
									ret := 0.956044 // buy
								if( Negative_Money_Flow > 14617.3 )
									ret := 0.592593
							if( Negative_Money_Flow_Sum > 9.03403e+06 )
								if( Positive_Money_Flow <= 0.777052 )
									ret := 0.469136
								if( Positive_Money_Flow > 0.777052 )
									ret := 0.696552
				if( Money_Flow_Ratio > 0.059155 )
					if( Positive_Money_Flow <= 1.16169e+06 )
						if( k <= 91.1047 )
							if( Money_Flow_Ratio <= 0.541039 )
								if( Negative_Money_Flow <= 166972 )
									ret := 0.075848
								if( Negative_Money_Flow > 166972 )
									ret := -0.030867
							if( Money_Flow_Ratio > 0.541039 )
								if( Typical_Price <= 33.9433 )
									ret := 0.137490
								if( Typical_Price > 33.9433 )
									ret := -0.015704
						if( k > 91.1047 )
							if( MFI_High <= 14.8682 )
								if( Negative_Money_Flow_Sum <= 6.23466e+08 )
									ret := -0.022300
								if( Negative_Money_Flow_Sum > 6.23466e+08 )
									ret := -0.814815 // sell
							if( MFI_High > 14.8682 )
								if( smoothK_k <= 92.4094 )
									ret := -0.842105 // sell
								if( smoothK_k > 92.4094 )
									ret := -0.363636
					if( Positive_Money_Flow > 1.16169e+06 )
						if( smoothD_d <= 59.9418 )
							if( MFI <= 13.0239 )
								if( MFI_High <= -72.3009 )
									ret := 0.169492
								if( MFI_High > -72.3009 )
									ret := -0.193084
							if( MFI > 13.0239 )
								if( MFI_Low <= 74.9811 )
									ret := 0.042473
								if( MFI_Low > 74.9811 )
									ret := -0.120833
						if( smoothD_d > 59.9418 )
							if( rsi1 <= 79.6199 )
								if( Money_Flow_Ratio <= 35.3929 )
									ret := -0.028933
								if( Money_Flow_Ratio > 35.3929 )
									ret := 0.261261
							if( rsi1 > 79.6199 )
								if( Positive_Money_Flow_Sum <= 1.44681e+07 )
									ret := -0.512500
								if( Positive_Money_Flow_Sum > 1.44681e+07 )
									ret := -0.092121
			if( Negative_Money_Flow > 1.07373e+06 )
				if( rsi1 <= 21.2955 )
					if( MFI_High <= -69.333 )
						if( Raw_Money_Flow <= 7.3841e+06 )
							if( MFI_High <= -71.2715 )
								if( k <= 3.69896 )
									ret := 0.518750
								if( k > 3.69896 )
									ret := 0.115942
							if( MFI_High > -71.2715 )
								if( Typical_Price <= 2.69865 )
									ret := -0.846154 // sell
								if( Typical_Price > 2.69865 )
									ret := -0.009346
						if( Raw_Money_Flow > 7.3841e+06 )
							if( rsi1 <= 3.92265 )
								if( MFI_High <= -79.0741 )
									ret := 0.642857
								if( MFI_High > -79.0741 )
									ret := 0.296296
							if( rsi1 > 3.92265 )
								if( MFI_High <= -79.5933 )
									ret := -0.561404
								if( MFI_High > -79.5933 )
									ret := -0.053571
					if( MFI_High > -69.333 )
						if( Money_Flow_Ratio <= 1.12307 )
							if( Negative_Money_Flow_Sum <= 5.57094e+06 )
								if( MFI_Low <= -1.30983 )
									ret := -0.862069 // sell
								if( MFI_Low > -1.30983 )
									ret := -0.244898
							if( Negative_Money_Flow_Sum > 5.57094e+06 )
								if( Raw_Money_Flow <= 1.70821e+08 )
									ret := 0.173700
								if( Raw_Money_Flow > 1.70821e+08 )
									ret := 0.672414
						if( Money_Flow_Ratio > 1.12307 )
							if( smoothK_k <= 12.1108 )
								if( MFI_Low <= 37.0877 )
									ret := -0.956522 // sell
								if( MFI_Low > 37.0877 )
									ret := -0.181818
							if( smoothK_k > 12.1108 )
								ret := 0.125000
				if( rsi1 > 21.2955 )
					if( rsi1 <= 50.9635 )
						if( Typical_Price <= 6.3143 )
							if( MFI_High <= -27.3365 )
								if( k <= 41.7188 )
									ret := -0.076156
								if( k > 41.7188 )
									ret := 0.063101
							if( MFI_High > -27.3365 )
								if( Money_Flow_Ratio <= 1.15163 )
									ret := 0.542169
								if( Money_Flow_Ratio > 1.15163 )
									ret := 0.130346
						if( Typical_Price > 6.3143 )
							if( MFI <= 2.84517 )
								if( MFI_Low <= -18.5804 )
									ret := 0.197917
								if( MFI_Low > -18.5804 )
									ret := -0.455764
							if( MFI > 2.84517 )
								if( MFI_High <= -20.7279 )
									ret := -0.071144
								if( MFI_High > -20.7279 )
									ret := -0.220436
					if( rsi1 > 50.9635 )
						if( Negative_Money_Flow <= 1.50859e+08 )
							if( MFI_Low <= 50.3272 )
								if( Negative_Money_Flow <= 1.51008e+06 )
									ret := -0.168155
								if( Negative_Money_Flow > 1.51008e+06 )
									ret := 0.054216
							if( MFI_Low > 50.3272 )
								if( MFI_Low <= 62.0874 )
									ret := -0.148162
								if( MFI_Low > 62.0874 )
									ret := 0.155087
						if( Negative_Money_Flow > 1.50859e+08 )
							if( rsi1 <= 70.6248 )
								if( d_k <= 3.24025 )
									ret := 0.379421
								if( d_k > 3.24025 )
									ret := -0.144981
							if( rsi1 > 70.6248 )
								if( Positive_Money_Flow_Sum <= 4.69706e+09 )
									ret := 0.542857
								if( Positive_Money_Flow_Sum > 4.69706e+09 )
									ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 2.55382e+09 )
			if( Positive_Money_Flow_Sum <= 3.30305e+09 )
				if( rsi1 <= 48.3365 )
					if( MFI_High <= -45.6174 )
						if( Typical_Price <= 41.2225 )
							if( MFI <= 18.6755 )
								if( d_k <= 0.582381 )
									ret := -0.300000
								if( d_k > 0.582381 )
									ret := 0.733333 // buy
							if( MFI > 18.6755 )
								if( MFI_Low <= 12.1465 )
									ret := 0.974026 // buy
								if( MFI_Low > 12.1465 )
									ret := 0.764706 // buy
						if( Typical_Price > 41.2225 )
							if( Positive_Money_Flow_Sum <= 8.61825e+08 )
								if( MFI <= 12.0663 )
									ret := 0.491525
								if( MFI > 12.0663 )
									ret := -0.253521
							if( Positive_Money_Flow_Sum > 8.61825e+08 )
								if( d_k <= -8.02107 )
									ret := 0.264706
								if( d_k > -8.02107 )
									ret := 0.666667
					if( MFI_High > -45.6174 )
						if( Money_Flow_Ratio <= 0.620174 )
							if( Positive_Money_Flow <= 3.20833e+06 )
								if( Negative_Money_Flow_Sum <= 4.03879e+09 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 4.03879e+09 )
									ret := 0.600000
							if( Positive_Money_Flow > 3.20833e+06 )
								if( Negative_Money_Flow <= 6.56664e+06 )
									ret := -0.571429
								if( Negative_Money_Flow > 6.56664e+06 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.620174 )
							if( Raw_Money_Flow <= 4.73027e+08 )
								if( k <= 23.2899 )
									ret := 0.333333
								if( k > 23.2899 )
									ret := 0.906977 // buy
							if( Raw_Money_Flow > 4.73027e+08 )
								ret := -0.500000
				if( rsi1 > 48.3365 )
					if( Typical_Price <= 47.023 )
						if( Money_Flow_Ratio <= 0.796581 )
							ret := -1.000000 // sell
						if( Money_Flow_Ratio > 0.796581 )
							ret := -0.500000
					if( Typical_Price > 47.023 )
						if( Negative_Money_Flow <= 1.81961e+06 )
							ret := 0.823529 // buy
						if( Negative_Money_Flow > 1.81961e+06 )
							if( MFI_High <= -37.494 )
								ret := 0.545455
							if( MFI_High > -37.494 )
								ret := -0.066667
			if( Positive_Money_Flow_Sum > 3.30305e+09 )
				if( d <= 5.88172 )
					if( MFI <= 57.8186 )
						ret := 0.545455
					if( MFI > 57.8186 )
						ret := 1.000000 // buy
				if( d > 5.88172 )
					if( k <= 8.62523 )
						if( Negative_Money_Flow_Sum <= 4.10399e+09 )
							if( smoothD_d <= 7.60764 )
								ret := 0.888889 // buy
							if( smoothD_d > 7.60764 )
								ret := 0.750000 // buy
						if( Negative_Money_Flow_Sum > 4.10399e+09 )
							ret := -0.700000 // sell
					if( k > 8.62523 )
						if( Raw_Money_Flow <= 2.15413e+08 )
							ret := 0.000000
						if( Raw_Money_Flow > 2.15413e+08 )
							if( d_k <= 3.67543 )
								if( Typical_Price <= 52.4489 )
									ret := -1.000000 // sell
								if( Typical_Price > 52.4489 )
									ret := -0.807692 // sell
							if( d_k > 3.67543 )
								if( Raw_Money_Flow <= 5.32484e+08 )
									ret := -0.304348
								if( Raw_Money_Flow > 5.32484e+08 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_NIO_15Min_13c6be4d(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


