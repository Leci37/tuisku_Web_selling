//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: LYFT_1Min_2CM0_f135556f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2CM0_f135556f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_f135556f(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 4.83847 )
		if( Negative_Money_Flow_Sum <= 500978 )
			if( Positive_Money_Flow <= 27.3587 )
				if( mf <= -0.77817 )
					if( MFI <= 97.4512 )
						ret := 0.500000
					if( MFI > 97.4512 )
						ret := 1.000000 // buy
				if( mf > -0.77817 )
					if( Raw_Money_Flow <= 18369.5 )
						if( Typical_Price <= 14.2076 )
							if( Raw_Money_Flow <= 3279 )
								if( Negative_Money_Flow_Sum <= 135515 )
									ret := -0.060606
								if( Negative_Money_Flow_Sum > 135515 )
									ret := 0.157895
							if( Raw_Money_Flow > 3279 )
								if( mf <= 0.49136 )
									ret := 0.092308
								if( mf > 0.49136 )
									ret := 0.437500
						if( Typical_Price > 14.2076 )
							if( Positive_Money_Flow_Sum <= 145449 )
								if( Raw_Money_Flow <= 1728.37 )
									ret := -0.075000
								if( Raw_Money_Flow > 1728.37 )
									ret := 0.329268
							if( Positive_Money_Flow_Sum > 145449 )
								if( Positive_Money_Flow_Sum <= 146387 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow_Sum > 146387 )
									ret := 0.050000
					if( Raw_Money_Flow > 18369.5 )
						if( mf <= 0.03926 )
							if( Positive_Money_Flow_Sum <= 30707.2 )
								if( Raw_Money_Flow <= 40525.7 )
									ret := -0.062500
								if( Raw_Money_Flow > 40525.7 )
									ret := 0.692308
							if( Positive_Money_Flow_Sum > 30707.2 )
								if( ad_mf <= 0.069946 )
									ret := 0.026667
								if( ad_mf > 0.069946 )
									ret := -0.140351
						if( mf > 0.03926 )
							if( Negative_Money_Flow_Sum <= 61173.4 )
								if( Raw_Money_Flow <= 65278.7 )
									ret := -0.250000
								if( Raw_Money_Flow > 65278.7 )
									ret := -0.812500 // sell
							if( Negative_Money_Flow_Sum > 61173.4 )
								if( Typical_Price <= 9.9575 )
									ret := 0.750000 // buy
								if( Typical_Price > 9.9575 )
									ret := -0.102804
			if( Positive_Money_Flow > 27.3587 )
				if( ad_mf <= -95.0912 )
					if( Positive_Money_Flow_Sum <= 708536 )
						if( Positive_Money_Flow_Sum <= 71921.8 )
							if( MFI <= 33.8904 )
								if( MFI_High <= -60.6244 )
									ret := -0.229167
								if( MFI_High > -60.6244 )
									ret := 0.500000
							if( MFI > 33.8904 )
								if( Positive_Money_Flow_Sum <= 51157.6 )
									ret := 0.094340
								if( Positive_Money_Flow_Sum > 51157.6 )
									ret := -0.644068
						if( Positive_Money_Flow_Sum > 71921.8 )
							if( Negative_Money_Flow_Sum <= 474340 )
								if( ad <= -2905.87 )
									ret := 0.430464
								if( ad > -2905.87 )
									ret := 0.154856
							if( Negative_Money_Flow_Sum > 474340 )
								ret := -0.857143 // sell
					if( Positive_Money_Flow_Sum > 708536 )
						if( Money_Flow_Ratio <= 22.751 )
							if( Typical_Price <= 16.3496 )
								if( Negative_Money_Flow_Sum <= 471920 )
									ret := -0.174603
								if( Negative_Money_Flow_Sum > 471920 )
									ret := -0.564103
							if( Typical_Price > 16.3496 )
								if( mf <= 0.124405 )
									ret := -1.000000 // sell
								if( mf > 0.124405 )
									ret := -0.333333
						if( Money_Flow_Ratio > 22.751 )
							if( Money_Flow_Ratio <= 32.6385 )
								if( Typical_Price <= 12.9519 )
									ret := 1.000000 // buy
								if( Typical_Price > 12.9519 )
									ret := 0.666667
							if( Money_Flow_Ratio > 32.6385 )
								if( Typical_Price <= 11.5083 )
									ret := -0.750000 // sell
								if( Typical_Price > 11.5083 )
									ret := 0.411765
				if( ad_mf > -95.0912 )
					if( MFI_Low <= 73.8713 )
						if( ad_mf <= 0.650131 )
							if( Positive_Money_Flow <= 9625.06 )
								if( MFI_Low <= 18.7713 )
									ret := -0.100116
								if( MFI_Low > 18.7713 )
									ret := -0.301013
							if( Positive_Money_Flow > 9625.06 )
								if( Positive_Money_Flow_Sum <= 29445 )
									ret := -0.540541
								if( Positive_Money_Flow_Sum > 29445 )
									ret := -0.043931
						if( ad_mf > 0.650131 )
							if( Positive_Money_Flow_Sum <= 180823 )
								if( Positive_Money_Flow_Sum <= 33033.7 )
									ret := -0.052083
								if( Positive_Money_Flow_Sum > 33033.7 )
									ret := -0.428398
							if( Positive_Money_Flow_Sum > 180823 )
								if( Positive_Money_Flow_Sum <= 3.73178e+06 )
									ret := -0.179327
								if( Positive_Money_Flow_Sum > 3.73178e+06 )
									ret := -0.612903
					if( MFI_Low > 73.8713 )
						if( Negative_Money_Flow_Sum <= 82748.3 )
							if( Raw_Money_Flow <= 427548 )
								if( Positive_Money_Flow_Sum <= 406298 )
									ret := -0.608696
								if( Positive_Money_Flow_Sum > 406298 )
									ret := 0.113208
							if( Raw_Money_Flow > 427548 )
								if( Negative_Money_Flow_Sum <= 76151.4 )
									ret := -0.966667 // sell
								if( Negative_Money_Flow_Sum > 76151.4 )
									ret := -0.500000
						if( Negative_Money_Flow_Sum > 82748.3 )
							if( Typical_Price <= 13.5258 )
								if( Raw_Money_Flow <= 746540 )
									ret := -0.114286
								if( Raw_Money_Flow > 746540 )
									ret := 0.602151
							if( Typical_Price > 13.5258 )
								if( Positive_Money_Flow <= 456975 )
									ret := 0.055556
								if( Positive_Money_Flow > 456975 )
									ret := -0.806452 // sell
		if( Negative_Money_Flow_Sum > 500978 )
			if( MFI_High <= 2.67364 )
				if( ad_mf <= -0.709135 )
					if( Typical_Price <= 11.4368 )
						if( ad <= -53924.5 )
							if( Negative_Money_Flow_Sum <= 3.31947e+07 )
								if( Typical_Price <= 11.37 )
									ret := -0.425926
								if( Typical_Price > 11.37 )
									ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 3.31947e+07 )
								ret := 1.000000 // buy
						if( ad > -53924.5 )
							if( mf <= -0.2126 )
								if( Raw_Money_Flow <= 131781 )
									ret := -0.382979
								if( Raw_Money_Flow > 131781 )
									ret := 0.192308
							if( mf > -0.2126 )
								if( Positive_Money_Flow_Sum <= 880851 )
									ret := -0.010204
								if( Positive_Money_Flow_Sum > 880851 )
									ret := 0.325265
					if( Typical_Price > 11.4368 )
						if( Positive_Money_Flow_Sum <= 4.6245e+07 )
							if( Positive_Money_Flow_Sum <= 2.00984e+07 )
								if( Positive_Money_Flow_Sum <= 1.24476e+07 )
									ret := 0.069830
								if( Positive_Money_Flow_Sum > 1.24476e+07 )
									ret := -0.341176
							if( Positive_Money_Flow_Sum > 2.00984e+07 )
								if( mf <= -0.122291 )
									ret := 0.894737 // buy
								if( mf > -0.122291 )
									ret := 0.160000
						if( Positive_Money_Flow_Sum > 4.6245e+07 )
							if( ad <= -105304 )
								ret := -0.666667
							if( ad > -105304 )
								ret := -1.000000 // sell
				if( ad_mf > -0.709135 )
					if( Typical_Price <= 12.8531 )
						if( Positive_Money_Flow_Sum <= 2.99371e+06 )
							if( Money_Flow_Ratio <= 3.54173 )
								if( MFI_Low <= 28.7381 )
									ret := 0.059446
								if( MFI_Low > 28.7381 )
									ret := -0.043838
							if( Money_Flow_Ratio > 3.54173 )
								if( Negative_Money_Flow_Sum <= 574619 )
									ret := -0.093750
								if( Negative_Money_Flow_Sum > 574619 )
									ret := 0.567010
						if( Positive_Money_Flow_Sum > 2.99371e+06 )
							if( Positive_Money_Flow <= 2.76006e+06 )
								if( Raw_Money_Flow <= 434551 )
									ret := 0.050996
								if( Raw_Money_Flow > 434551 )
									ret := 0.241840
							if( Positive_Money_Flow > 2.76006e+06 )
								if( Negative_Money_Flow_Sum <= 1.49688e+07 )
									ret := -0.484211
								if( Negative_Money_Flow_Sum > 1.49688e+07 )
									ret := 0.241379
					if( Typical_Price > 12.8531 )
						if( ad <= 346437 )
							if( Positive_Money_Flow <= 1.37737e+06 )
								if( mf <= -0.485971 )
									ret := -0.392857
								if( mf > -0.485971 )
									ret := -0.037792
							if( Positive_Money_Flow > 1.37737e+06 )
								if( Positive_Money_Flow_Sum <= 3.92533e+06 )
									ret := 0.552632
								if( Positive_Money_Flow_Sum > 3.92533e+06 )
									ret := 0.078182
						if( ad > 346437 )
							if( Negative_Money_Flow_Sum <= 1.34745e+07 )
								if( Raw_Money_Flow <= 9.02582e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 9.02582e+06 )
									ret := -0.600000
							if( Negative_Money_Flow_Sum > 1.34745e+07 )
								ret := -1.000000 // sell
			if( MFI_High > 2.67364 )
				if( Typical_Price <= 11.316 )
					if( Negative_Money_Flow_Sum <= 860742 )
						if( mf <= 0.164308 )
							if( Negative_Money_Flow_Sum <= 701983 )
								if( MFI_High <= 12.6794 )
									ret := -0.960000 // sell
								if( MFI_High > 12.6794 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 701983 )
								if( ad <= -1091.64 )
									ret := 0.500000
								if( ad > -1091.64 )
									ret := -0.611111
						if( mf > 0.164308 )
							if( Money_Flow_Ratio <= 13.6913 )
								if( MFI <= 83.1523 )
									ret := 0.500000
								if( MFI > 83.1523 )
									ret := -0.160000
							if( Money_Flow_Ratio > 13.6913 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 860742 )
						if( ad <= 69735.7 )
							if( Positive_Money_Flow_Sum <= 1.20982e+07 )
								if( Positive_Money_Flow_Sum <= 5.87904e+06 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 5.87904e+06 )
									ret := 0.900000 // buy
							if( Positive_Money_Flow_Sum > 1.20982e+07 )
								if( Money_Flow_Ratio <= 8.12732 )
									ret := 0.200000
								if( Money_Flow_Ratio > 8.12732 )
									ret := -0.500000
						if( ad > 69735.7 )
							if( ad_mf <= 86246.8 )
								ret := -0.250000
							if( ad_mf > 86246.8 )
								ret := -0.800000 // sell
				if( Typical_Price > 11.316 )
					if( ad_mf <= -14954.6 )
						if( MFI_High <= 8.24809 )
							if( Positive_Money_Flow_Sum <= 4.74089e+06 )
								if( Raw_Money_Flow <= 395829 )
									ret := 0.000000
								if( Raw_Money_Flow > 395829 )
									ret := 0.842105 // buy
							if( Positive_Money_Flow_Sum > 4.74089e+06 )
								if( Raw_Money_Flow <= 668670 )
									ret := -0.533333
								if( Raw_Money_Flow > 668670 )
									ret := 0.333333
						if( MFI_High > 8.24809 )
							if( MFI_High <= 10.5743 )
								if( Positive_Money_Flow <= 564819 )
									ret := -0.285714
								if( Positive_Money_Flow > 564819 )
									ret := -0.823529 // sell
							if( MFI_High > 10.5743 )
								if( MFI_Low <= 72.7458 )
									ret := -0.142857
								if( MFI_Low > 72.7458 )
									ret := 0.400000
					if( ad_mf > -14954.6 )
						if( Positive_Money_Flow_Sum <= 3.32338e+06 )
							if( mf <= 0.136691 )
								if( Typical_Price <= 12.7129 )
									ret := 0.272727
								if( Typical_Price > 12.7129 )
									ret := -0.636364
							if( mf > 0.136691 )
								if( Raw_Money_Flow <= 169484 )
									ret := -0.285714
								if( Raw_Money_Flow > 169484 )
									ret := 0.687500
						if( Positive_Money_Flow_Sum > 3.32338e+06 )
							if( ad <= 428997 )
								if( Money_Flow_Ratio <= 13.0831 )
									ret := -0.371753
								if( Money_Flow_Ratio > 13.0831 )
									ret := 0.000000
							if( ad > 428997 )
								if( mf <= 0.659716 )
									ret := -1.000000 // sell
								if( mf > 0.659716 )
									ret := -0.500000
	if( Negative_Money_Flow > 4.83847 )
		if( Positive_Money_Flow_Sum <= 420408 )
			if( ad <= 1.78902 )
				if( Positive_Money_Flow_Sum <= 66814.6 )
					if( Typical_Price <= 15.5532 )
						if( ad_mf <= -71.0917 )
							if( Typical_Price <= 9.25226 )
								if( Negative_Money_Flow_Sum <= 131339 )
									ret := -0.545455
								if( Negative_Money_Flow_Sum > 131339 )
									ret := 0.222222
							if( Typical_Price > 9.25226 )
								if( Negative_Money_Flow_Sum <= 1.72424e+06 )
									ret := 0.663399
								if( Negative_Money_Flow_Sum > 1.72424e+06 )
									ret := 0.071429
						if( ad_mf > -71.0917 )
							if( ad_mf <= 0.371914 )
								if( ad_mf <= -0.248418 )
									ret := 0.164251
								if( ad_mf > -0.248418 )
									ret := 0.463869
							if( ad_mf > 0.371914 )
								if( MFI_High <= -71.6219 )
									ret := -0.321429
								if( MFI_High > -71.6219 )
									ret := 0.169643
					if( Typical_Price > 15.5532 )
						if( Negative_Money_Flow <= 383004 )
							if( Typical_Price <= 17.4725 )
								if( Negative_Money_Flow <= 1585.95 )
									ret := 0.710526 // buy
								if( Negative_Money_Flow > 1585.95 )
									ret := 0.266839
							if( Typical_Price > 17.4725 )
								if( Negative_Money_Flow_Sum <= 280287 )
									ret := -0.444444
								if( Negative_Money_Flow_Sum > 280287 )
									ret := -1.000000 // sell
						if( Negative_Money_Flow > 383004 )
							if( ad_mf <= -56749.7 )
								ret := -0.750000 // sell
							if( ad_mf > -56749.7 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 66814.6 )
					if( Negative_Money_Flow_Sum <= 388233 )
						if( Raw_Money_Flow <= 3280.7 )
							if( Typical_Price <= 17.3245 )
								if( Positive_Money_Flow_Sum <= 68274.4 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 68274.4 )
									ret := 0.210923
							if( Typical_Price > 17.3245 )
								if( Negative_Money_Flow_Sum <= 51301.9 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 51301.9 )
									ret := -0.888889 // sell
						if( Raw_Money_Flow > 3280.7 )
							if( mf <= -0.13714 )
								if( Negative_Money_Flow_Sum <= 114620 )
									ret := 0.048544
								if( Negative_Money_Flow_Sum > 114620 )
									ret := 0.351254
							if( mf > -0.13714 )
								if( Negative_Money_Flow <= 3076.97 )
									ret := 0.670455
								if( Negative_Money_Flow > 3076.97 )
									ret := 0.376320
					if( Negative_Money_Flow_Sum > 388233 )
						if( MFI_Low <= -17.8496 )
							if( Positive_Money_Flow_Sum <= 146870 )
								if( MFI <= 1.79876 )
									ret := -0.360000
								if( MFI > 1.79876 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 146870 )
								if( ad <= -204.122 )
									ret := 0.600000
								if( ad > -204.122 )
									ret := 0.000000
						if( MFI_Low > -17.8496 )
							if( ad <= -13650 )
								if( ad <= -161532 )
									ret := -0.777778 // sell
								if( ad > -161532 )
									ret := 0.008000
							if( ad > -13650 )
								if( Negative_Money_Flow_Sum <= 1.73422e+06 )
									ret := 0.143251
								if( Negative_Money_Flow_Sum > 1.73422e+06 )
									ret := 0.432727
			if( ad > 1.78902 )
				if( Negative_Money_Flow <= 1.33183e+06 )
					if( Negative_Money_Flow_Sum <= 56187 )
						if( MFI <= 55.4541 )
							if( ad <= 800.5 )
								if( Raw_Money_Flow <= 11227.4 )
									ret := -0.956522 // sell
								if( Raw_Money_Flow > 11227.4 )
									ret := -0.600000
							if( ad > 800.5 )
								ret := -0.333333
						if( MFI > 55.4541 )
							if( MFI_High <= 7.95836 )
								if( Typical_Price <= 11.2411 )
									ret := 0.250000
								if( Typical_Price > 11.2411 )
									ret := -0.510638
							if( MFI_High > 7.95836 )
								ret := 0.571429
					if( Negative_Money_Flow_Sum > 56187 )
						if( MFI_High <= -66.777 )
							if( Negative_Money_Flow_Sum <= 149843 )
								if( Negative_Money_Flow <= 21825.4 )
									ret := -0.692308
								if( Negative_Money_Flow > 21825.4 )
									ret := 0.285714
							if( Negative_Money_Flow_Sum > 149843 )
								if( ad_mf <= 1108.8 )
									ret := 0.703125 // buy
								if( ad_mf > 1108.8 )
									ret := 0.146597
						if( MFI_High > -66.777 )
							if( Negative_Money_Flow_Sum <= 79791.1 )
								if( mf <= -0.025004 )
									ret := -0.166667
								if( mf > -0.025004 )
									ret := 0.558140
							if( Negative_Money_Flow_Sum > 79791.1 )
								if( Positive_Money_Flow_Sum <= 69765.5 )
									ret := -0.427536
								if( Positive_Money_Flow_Sum > 69765.5 )
									ret := 0.015332
				if( Negative_Money_Flow > 1.33183e+06 )
					if( Negative_Money_Flow_Sum <= 2.51067e+06 )
						if( mf <= 0.236688 )
							if( MFI_High <= -77.1127 )
								ret := -1.000000 // sell
							if( MFI_High > -77.1127 )
								ret := -0.750000 // sell
						if( mf > 0.236688 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 2.51067e+06 )
						if( ad_mf <= 56437.1 )
							ret := -0.857143 // sell
						if( ad_mf > 56437.1 )
							ret := 0.500000
		if( Positive_Money_Flow_Sum > 420408 )
			if( ad <= -6136.48 )
				if( MFI <= 75.387 )
					if( Money_Flow_Ratio <= 0.209915 )
						if( Negative_Money_Flow_Sum <= 4.78168e+06 )
							if( ad_mf <= -66508.7 )
								if( Negative_Money_Flow_Sum <= 4.31895e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.31895e+06 )
									ret := -0.500000
							if( ad_mf > -66508.7 )
								if( MFI <= 15.7284 )
									ret := -0.005208
								if( MFI > 15.7284 )
									ret := 0.337662
						if( Negative_Money_Flow_Sum > 4.78168e+06 )
							if( mf <= -0.202909 )
								if( Negative_Money_Flow_Sum <= 2.3402e+07 )
									ret := 0.401575
								if( Negative_Money_Flow_Sum > 2.3402e+07 )
									ret := 0.933333 // buy
							if( mf > -0.202909 )
								if( Negative_Money_Flow <= 533833 )
									ret := 0.423077
								if( Negative_Money_Flow > 533833 )
									ret := -0.132530
					if( Money_Flow_Ratio > 0.209915 )
						if( Negative_Money_Flow <= 424012 )
							if( Positive_Money_Flow_Sum <= 693205 )
								if( Negative_Money_Flow_Sum <= 1.63414e+06 )
									ret := -0.100000
								if( Negative_Money_Flow_Sum > 1.63414e+06 )
									ret := 0.171429
							if( Positive_Money_Flow_Sum > 693205 )
								if( Typical_Price <= 11.2917 )
									ret := 0.305489
								if( Typical_Price > 11.2917 )
									ret := 0.125192
						if( Negative_Money_Flow > 424012 )
							if( Raw_Money_Flow <= 1.16569e+06 )
								if( Negative_Money_Flow_Sum <= 1.8869e+07 )
									ret := 0.016511
								if( Negative_Money_Flow_Sum > 1.8869e+07 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.16569e+06 )
								if( mf <= -0.17037 )
									ret := 0.391827
								if( mf > -0.17037 )
									ret := 0.047158
				if( MFI > 75.387 )
					if( Typical_Price <= 11.5533 )
						if( ad_mf <= -49686.5 )
							if( Negative_Money_Flow <= 688556 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow > 688556 )
								ret := 1.000000 // buy
						if( ad_mf > -49686.5 )
							if( Raw_Money_Flow <= 242260 )
								if( Positive_Money_Flow_Sum <= 6.22838e+06 )
									ret := -0.346939
								if( Positive_Money_Flow_Sum > 6.22838e+06 )
									ret := 0.777778 // buy
							if( Raw_Money_Flow > 242260 )
								if( Raw_Money_Flow <= 507927 )
									ret := 0.534483
								if( Raw_Money_Flow > 507927 )
									ret := -0.131579
					if( Typical_Price > 11.5533 )
						if( Raw_Money_Flow <= 222289 )
							if( Positive_Money_Flow_Sum <= 2.59869e+06 )
								if( Positive_Money_Flow_Sum <= 2.52395e+06 )
									ret := -0.111111
								if( Positive_Money_Flow_Sum > 2.52395e+06 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 2.59869e+06 )
								if( mf <= -0.029235 )
									ret := -0.818182 // sell
								if( mf > -0.029235 )
									ret := -0.447154
						if( Raw_Money_Flow > 222289 )
							if( ad <= -136550 )
								if( Raw_Money_Flow <= 3.05354e+06 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 3.05354e+06 )
									ret := -0.571429
							if( ad > -136550 )
								if( Negative_Money_Flow_Sum <= 1.53316e+06 )
									ret := -0.184783
								if( Negative_Money_Flow_Sum > 1.53316e+06 )
									ret := 0.084746
			if( ad > -6136.48 )
				if( MFI_Low <= -0.810366 )
					if( Typical_Price <= 11.8161 )
						if( Raw_Money_Flow <= 224878 )
							if( Positive_Money_Flow_Sum <= 459672 )
								ret := 0.142857
							if( Positive_Money_Flow_Sum > 459672 )
								if( MFI_High <= -69.738 )
									ret := 0.000000
								if( MFI_High > -69.738 )
									ret := -0.781250 // sell
						if( Raw_Money_Flow > 224878 )
							if( Positive_Money_Flow_Sum <= 818647 )
								if( Negative_Money_Flow <= 323510 )
									ret := -0.904762 // sell
								if( Negative_Money_Flow > 323510 )
									ret := -0.304348
							if( Positive_Money_Flow_Sum > 818647 )
								if( Negative_Money_Flow <= 258824 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 258824 )
									ret := 0.148148
					if( Typical_Price > 11.8161 )
						if( Raw_Money_Flow <= 473769 )
							if( ad_mf <= -894.856 )
								if( Positive_Money_Flow_Sum <= 504689 )
									ret := 0.620690
								if( Positive_Money_Flow_Sum > 504689 )
									ret := 0.077922
							if( ad_mf > -894.856 )
								if( ad_mf <= 14411.2 )
									ret := -0.148305
								if( ad_mf > 14411.2 )
									ret := 0.275000
						if( Raw_Money_Flow > 473769 )
							if( ad <= -908.758 )
								if( MFI_Low <= -9.31448 )
									ret := -0.200000
								if( MFI_Low > -9.31448 )
									ret := -0.947368 // sell
							if( ad > -908.758 )
								if( Raw_Money_Flow <= 664342 )
									ret := -0.411765
								if( Raw_Money_Flow > 664342 )
									ret := -0.012195
				if( MFI_Low > -0.810366 )
					if( Typical_Price <= 15.3502 )
						if( Negative_Money_Flow_Sum <= 5.92306e+06 )
							if( Positive_Money_Flow <= 28957.5 )
								if( Negative_Money_Flow_Sum <= 164941 )
									ret := 0.360215
								if( Negative_Money_Flow_Sum > 164941 )
									ret := 0.035866
							if( Positive_Money_Flow > 28957.5 )
								if( ad_mf <= -5018.16 )
									ret := -0.733333 // sell
								if( ad_mf > -5018.16 )
									ret := 0.294624
						if( Negative_Money_Flow_Sum > 5.92306e+06 )
							if( Raw_Money_Flow <= 7.48137e+06 )
								if( MFI <= 33.4144 )
									ret := 0.445283
								if( MFI > 33.4144 )
									ret := 0.207317
							if( Raw_Money_Flow > 7.48137e+06 )
								if( Money_Flow_Ratio <= 0.597218 )
									ret := 0.000000
								if( Money_Flow_Ratio > 0.597218 )
									ret := -0.857143 // sell
					if( Typical_Price > 15.3502 )
						if( Typical_Price <= 17.6119 )
							if( Negative_Money_Flow_Sum <= 2.83677e+07 )
								if( Negative_Money_Flow_Sum <= 7.21605e+06 )
									ret := -0.030645
								if( Negative_Money_Flow_Sum > 7.21605e+06 )
									ret := 0.190476
							if( Negative_Money_Flow_Sum > 2.83677e+07 )
								if( Negative_Money_Flow_Sum <= 3.47575e+07 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow_Sum > 3.47575e+07 )
									ret := 0.833333 // buy
						if( Typical_Price > 17.6119 )
							if( Positive_Money_Flow_Sum <= 571628 )
								ret := 0.166667
							if( Positive_Money_Flow_Sum > 571628 )
								if( mf <= 0.073848 )
									ret := -0.823529 // sell
								if( mf > 0.073848 )
									ret := -0.291667
	
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
float op_operation = decision_tree_0_LYFT_1Min_f135556f(mf, ad_mf, ad, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


